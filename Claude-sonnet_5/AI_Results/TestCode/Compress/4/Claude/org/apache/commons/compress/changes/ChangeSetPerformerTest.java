package org.apache.commons.compress.changes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.junit.Test;

/**
 * Unit tests for {@link ChangeSetPerformer} (Compress-4b)
 *
 * หมายเหตุ: คลาสทดสอบนี้อยู่ package เดียวกับ target class (org.apache.commons.compress.changes)
 * เพื่อให้เข้าถึง ChangeSet / ChangeSetResults ได้โดยตรง (ไม่ต้อง mock framework เพราะ classpath
 * มีเฉพาะ junit-3.8.2.jar) จึงสร้าง stub ของ ArchiveEntry/ArchiveInputStream/ArchiveOutputStream เอง
 */
public class ChangeSetPerformerTest {

    // ---------------------------------------------------------------
    // Stub helpers
    // ---------------------------------------------------------------

    /**
     * Stub ArchiveEntry อย่างง่าย
     * สมมติฐาน: ArchiveEntry interface ต้องการ getName(), getSize(), isDirectory()
     * (ถ้า interface จริงมี method อื่นเพิ่มเติม จะต้อง implement เพิ่ม)
     */
    static class StubArchiveEntry implements ArchiveEntry {
        private final String name;
        StubArchiveEntry(String name) { this.name = name; }
        public String getName() { return name; }
        public long getSize() { return 0L; }
        public boolean isDirectory() { return false; }
    }

    /** Stub ArchiveInputStream ที่คืน entry ตามลำดับคิวที่กำหนด และไม่มีข้อมูล content จริง (EOF ทันที) */
    static class StubArchiveInputStream extends ArchiveInputStream {
        private final Queue<ArchiveEntry> entries;
        StubArchiveInputStream(List<ArchiveEntry> entryList) {
            this.entries = new LinkedList<ArchiveEntry>(entryList);
        }
        public ArchiveEntry getNextEntry() throws IOException {
            return entries.poll();
        }
        public int read() throws IOException {
            return -1; // ไม่มี content, IOUtils.copy จะจบทันที
        }
    }

    /** Stub ArchiveOutputStream ที่บันทึกว่า entry ใดถูก put/close เพื่อใช้ตรวจสอบผลลัพธ์ */
    static class StubArchiveOutputStream extends ArchiveOutputStream {
        final List<String> putEntries = new ArrayList<String>();
        int closeCount = 0;

        public void putArchiveEntry(ArchiveEntry entry) throws IOException {
            putEntries.add(entry.getName());
        }
        public void closeArchiveEntry() throws IOException {
            closeCount++;
        }
        // เผื่อ superclass ประกาศ finish() เป็น abstract - ไม่ใส่ @Override เพื่อความปลอดภัย
        public void finish() throws IOException {
        }
        public void write(int b) throws IOException {
            // no-op
        }
    }

    // ---------------------------------------------------------------
    // Constructor tests
    // ---------------------------------------------------------------

    @Test(expected = NullPointerException.class)
    public void testConstructor_nullChangeSet_throwsNPE() {
        // changes = changeSet.getChanges() -> NPE เมื่อ changeSet เป็น null
        new ChangeSetPerformer(null);
    }

    // ---------------------------------------------------------------
    // perform() - boundary / empty cases
    // ---------------------------------------------------------------

    @Test
    public void testPerform_emptyChangeSetEmptyStream_returnsEmptyResults() throws IOException {
        ChangeSet changeSet = new ChangeSet();
        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        StubArchiveInputStream in = new StubArchiveInputStream(new ArrayList<ArchiveEntry>());
        StubArchiveOutputStream out = new StubArchiveOutputStream();

        ChangeSetResults results = performer.perform(in, out);

        assertNotNull(results);
        assertTrue(results.getAddedFromChangeSet().isEmpty());
        assertTrue(results.getAddedFromStream().isEmpty());
        assertTrue(results.getDeleted().isEmpty());
        assertTrue(out.putEntries.isEmpty());
    }

    // ---------------------------------------------------------------
    // First loop: TYPE_ADD && isReplaceMode()
    // ---------------------------------------------------------------

    @Test
    public void testPerform_addWithReplaceMode_copiedInFirstLoop() throws IOException {
        ChangeSet changeSet = new ChangeSet();
        ArchiveEntry newEntry = new StubArchiveEntry("added.txt");
        InputStream content = new ByteArrayInputStream("hello".getBytes());
        changeSet.add(newEntry, content); // สมมติ default replace = true

        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);
        StubArchiveInputStream in = new StubArchiveInputStream(new ArrayList<ArchiveEntry>());
        StubArchiveOutputStream out = new StubArchiveOutputStream();

        ChangeSetResults results = performer.perform(in, out);

        assertTrue(results.getAddedFromChangeSet().contains("added.txt"));
        assertTrue(out.putEntries.contains("added.txt"));
        assertEquals(1, out.closeCount);
    }

    // ---------------------------------------------------------------
    // Third loop: TYPE_ADD && !isReplaceMode() && !hasBeenAdded
    // ---------------------------------------------------------------

    @Test
    public void testPerform_addWithoutReplaceMode_addedInLastLoop() throws IOException {
        ChangeSet changeSet = new ChangeSet();
        ArchiveEntry newEntry = new StubArchiveEntry("noreplace.txt");
        InputStream content = new ByteArrayInputStream("data".getBytes());
        changeSet.add(newEntry, content, false); // replace = false -> ไม่ถูกจับใน loop แรก

        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);
        StubArchiveInputStream in = new StubArchiveInputStream(new ArrayList<ArchiveEntry>());
        StubArchiveOutputStream out = new StubArchiveOutputStream();

        ChangeSetResults results = performer.perform(in, out);

        assertTrue(results.getAddedFromChangeSet().contains("noreplace.txt"));
        assertTrue(out.putEntries.contains("noreplace.txt"));
    }

    // ---------------------------------------------------------------
    // Main while loop: entry ไม่เกี่ยวข้องกับ change ใดๆ -> copy จาก stream
    // ---------------------------------------------------------------

    @Test
    public void testPerform_streamEntryUnaffected_copiedFromStream() throws IOException {
        ChangeSet changeSet = new ChangeSet(); // ไม่มี change
        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        List<ArchiveEntry> entries = new ArrayList<ArchiveEntry>();
        entries.add(new StubArchiveEntry("plain.txt"));
        StubArchiveInputStream in = new StubArchiveInputStream(entries);
        StubArchiveOutputStream out = new StubArchiveOutputStream();

        ChangeSetResults results = performer.perform(in, out);

        assertTrue(results.getAddedFromStream().contains("plain.txt"));
        assertTrue(out.putEntries.contains("plain.txt"));
    }

    // ---------------------------------------------------------------
    // TYPE_DELETE ตรง / ไม่ตรง
    // ---------------------------------------------------------------

    @Test
    public void testPerform_deleteMatchingEntry_notCopied() throws IOException {
        ChangeSet changeSet = new ChangeSet();
        changeSet.delete("delete_me.txt");
        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        List<ArchiveEntry> entries = new ArrayList<ArchiveEntry>();
        entries.add(new StubArchiveEntry("delete_me.txt"));
        StubArchiveInputStream in = new StubArchiveInputStream(entries);
        StubArchiveOutputStream out = new StubArchiveOutputStream();

        ChangeSetResults results = performer.perform(in, out);

        assertTrue(results.getDeleted().contains("delete_me.txt"));
        assertFalse(out.putEntries.contains("delete_me.txt"));
        assertTrue(results.getAddedFromStream().isEmpty());
    }

    @Test
    public void testPerform_deleteNonMatchingEntry_stillCopied() throws IOException {
        ChangeSet changeSet = new ChangeSet();
        changeSet.delete("other.txt");
        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        List<ArchiveEntry> entries = new ArrayList<ArchiveEntry>();
        entries.add(new StubArchiveEntry("keep.txt"));
        StubArchiveInputStream in = new StubArchiveInputStream(entries);
        StubArchiveOutputStream out = new StubArchiveOutputStream();

        ChangeSetResults results = performer.perform(in, out);

        assertTrue(results.getAddedFromStream().contains("keep.txt"));
        assertTrue(out.putEntries.contains("keep.txt"));
        assertTrue(results.getDeleted().isEmpty());
    }

    // ---------------------------------------------------------------
    // TYPE_DELETE_DIR ตรง (startsWith target + "/")
    // ---------------------------------------------------------------

    @Test
    public void testPerform_deleteDirMatchingEntry_notCopied() throws IOException {
        ChangeSet changeSet = new ChangeSet();
        changeSet.deleteDir("dir"); // สมมติ targetFile ถูกเก็บเป็น "dir" (ไม่มี trailing slash)
        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        List<ArchiveEntry> entries = new ArrayList<ArchiveEntry>();
        entries.add(new StubArchiveEntry("dir/file.txt"));
        StubArchiveInputStream in = new StubArchiveInputStream(entries);
        StubArchiveOutputStream out = new StubArchiveOutputStream();

        ChangeSetResults results = performer.perform(in, out);

        assertTrue(results.getDeleted().contains("dir/file.txt"));
        assertFalse(out.putEntries.contains("dir/file.txt"));
    }

    // ---------------------------------------------------------------
    // hasBeenAdded(): ป้องกันการเพิ่มไฟล์ซ้ำ (ทั้งกรณี addedFromStream และ addedFromChangeSet)
    // ---------------------------------------------------------------

    @Test
    public void testPerform_addNoReplace_duplicateNameAlreadyInStream_notAddedTwice() throws IOException {
        ChangeSet changeSet = new ChangeSet();
        ArchiveEntry newEntry = new StubArchiveEntry("dup.txt");
        InputStream content = new ByteArrayInputStream("x".getBytes());
        changeSet.add(newEntry, content, false);

        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        List<ArchiveEntry> entries = new ArrayList<ArchiveEntry>();
        entries.add(new StubArchiveEntry("dup.txt")); // มีอยู่แล้วใน stream input
        StubArchiveInputStream in = new StubArchiveInputStream(entries);
        StubArchiveOutputStream out = new StubArchiveOutputStream();

        ChangeSetResults results = performer.perform(in, out);

        assertTrue(results.getAddedFromStream().contains("dup.txt"));
        assertFalse(results.getAddedFromChangeSet().contains("dup.txt"));

        int count = 0;
        for (String n : out.putEntries) {
            if ("dup.txt".equals(n)) {
                count++;
            }
        }
        assertEquals(1, count);
    }

    @Test
    public void testPerform_streamEntrySameNameAsReplaceAdd_skippedByHasBeenAdded() throws IOException {
        // เพิ่มด้วย replace=true -> ถูกเพิ่มใน loop แรกก่อนอ่าน stream
        ChangeSet changeSet = new ChangeSet();
        ArchiveEntry newEntry = new StubArchiveEntry("same.txt");
        InputStream content = new ByteArrayInputStream("y".getBytes());
        changeSet.add(newEntry, content, true);

        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        List<ArchiveEntry> entries = new ArrayList<ArchiveEntry>();
        entries.add(new StubArchiveEntry("same.txt")); // ชื่อเดียวกันปรากฏใน stream ด้วย
        StubArchiveInputStream in = new StubArchiveInputStream(entries);
        StubArchiveOutputStream out = new StubArchiveOutputStream();

        ChangeSetResults results = performer.perform(in, out);

        // ควรถูกนับว่า addedFromChangeSet เท่านั้น ไม่ถูกคัดลอกซ้ำจาก stream
        assertTrue(results.getAddedFromChangeSet().contains("same.txt"));
        assertFalse(results.getAddedFromStream().contains("same.txt"));

        int count = 0;
        for (String n : out.putEntries) {
            if ("same.txt".equals(n)) {
                count++;
            }
        }
        assertEquals(1, count);
    }

    // ---------------------------------------------------------------
    // Fault-detecting test: entry.getName() == null -> isDeletedLater() NPE
    // (วิเคราะห์ตรงจาก source: main loop เงื่อนไข "name != null" ทำให้ไม่ match
    //  จึง copy ยังคง true และไปเรียก isDeletedLater() ซึ่งมี source.equals(target)
    //  โดยไม่ตรวจ null -> NullPointerException)
    // ---------------------------------------------------------------

    @Test(expected = NullPointerException.class)
    public void testPerform_entryWithNullName_causesNPEInIsDeletedLater() throws IOException {
        ChangeSet changeSet = new ChangeSet();
        changeSet.delete("something.txt"); // workingSet ไม่ว่าง -> isDeletedLater เข้า for loop

        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        List<ArchiveEntry> entries = new ArrayList<ArchiveEntry>();
        entries.add(new StubArchiveEntry(null)); // ชื่อ entry เป็น null (malformed input)
        StubArchiveInputStream in = new StubArchiveInputStream(entries);
        StubArchiveOutputStream out = new StubArchiveOutputStream();

        performer.perform(in, out);
    }

    // ---------------------------------------------------------------
    // Combination test: ใช้หลาย branch ในการรันเดียวกัน
    // ---------------------------------------------------------------

    @Test
    public void testPerform_multipleAddsAndDeletesCombination() throws IOException {
        ChangeSet changeSet = new ChangeSet();
        changeSet.add(new StubArchiveEntry("r1.txt"), new ByteArrayInputStream("a".getBytes()), true);
        changeSet.add(new StubArchiveEntry("r2.txt"), new ByteArrayInputStream("b".getBytes()), false);
        changeSet.delete("del.txt");
        changeSet.deleteDir("olddir");

        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        List<ArchiveEntry> entries = new ArrayList<ArchiveEntry>();
        entries.add(new StubArchiveEntry("del.txt"));
        entries.add(new StubArchiveEntry("olddir/inner.txt"));
        entries.add(new StubArchiveEntry("keepme.txt"));
        StubArchiveInputStream in = new StubArchiveInputStream(entries);
        StubArchiveOutputStream out = new StubArchiveOutputStream();

        ChangeSetResults results = performer.perform(in, out);

        assertTrue(results.getAddedFromChangeSet().contains("r1.txt"));
        assertTrue(results.getAddedFromChangeSet().contains("r2.txt"));
        assertTrue(results.getDeleted().contains("del.txt"));
        assertTrue(results.getDeleted().contains("olddir/inner.txt"));
        assertTrue(results.getAddedFromStream().contains("keepme.txt"));
        assertFalse(out.putEntries.contains("del.txt"));
        assertFalse(out.putEntries.contains("olddir/inner.txt"));
        assertTrue(out.putEntries.contains("keepme.txt"));
    }
}
