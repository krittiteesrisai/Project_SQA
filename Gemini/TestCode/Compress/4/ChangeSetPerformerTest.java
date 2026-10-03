package org.apache.commons.compress.changes;

import junit.framework.TestCase;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.ArchiveOutputStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

public class ChangeSetPerformerTest extends TestCase {

    // --- Mock / Stub Implementations for Testing without Mockito ---

    private static class TestArchiveEntry implements ArchiveEntry {
        private final String name;
        private final boolean isDirectory;

        public TestArchiveEntry(String name, boolean isDirectory) {
            this.name = name;
            this.isDirectory = isDirectory;
        }

        public String getName() { return name; }
        public long getSize() { return 10; }
        public boolean isDirectory() { return isDirectory; }
        public Date getLastModifiedDate() { return new Date(); }
    }

    private static class MockArchiveInputStream extends ArchiveInputStream {
        private final ArchiveEntry[] entries;
        private int index = 0;

        public MockArchiveInputStream(ArchiveEntry[] entries) {
            this.entries = entries;
        }

        public ArchiveEntry getNextEntry() throws IOException {
            if (index < entries.length) {
                return entries[index++];
            }
            return null;
        }

        public int read() throws IOException {
            return -1;
        }
    }

    private static class MockArchiveOutputStream extends ArchiveOutputStream {
        public void putArchiveEntry(ArchiveEntry entry) throws IOException {}
        public void write(byte[] b, int off, int len) throws IOException {}
        public void closeArchiveEntry() throws IOException {}
        public void finish() throws IOException {}
        public void close() throws IOException {}
        public ArchiveEntry createArchiveEntry(java.io.File inputFile, String entryName) throws IOException {
            return new TestArchiveEntry(entryName, inputFile.isDirectory());
        }
    }

    // --- Test Cases ---

    public void testAddWithReplaceMode() throws Exception {
        ChangeSet set = new ChangeSet();
        InputStream data = new ByteArrayInputStream("content".getBytes());
        ArchiveEntry entry = new TestArchiveEntry("file1.txt", false);
        set.add(entry, data, true); // TYPE_ADD with replace mode = true

        ChangeSetPerformer performer = new ChangeSetPerformer(set);
        MockArchiveInputStream in = new MockArchiveInputStream(new ArchiveEntry[0]);
        MockArchiveOutputStream out = new MockArchiveOutputStream();

        ChangeSetResults results = performer.perform(in, out);
        assertNotNull(results);
        assertTrue(results.hasBeenAdded("file1.txt"));
    }

    public void testDeleteFileMatching() throws Exception {
        ChangeSet set = new ChangeSet();
        set.delete("file1.txt"); // TYPE_DELETE

        ChangeSetPerformer performer = new ChangeSetPerformer(set);
        ArchiveEntry[] entries = { new TestArchiveEntry("file1.txt", false) };
        MockArchiveInputStream in = new MockArchiveInputStream(entries);
        MockArchiveOutputStream out = new MockArchiveOutputStream();

        ChangeSetResults results = performer.perform(in, out);
        assertNotNull(results);
    }

    public void testDeleteDirectoryMatching() throws Exception {
        ChangeSet set = new ChangeSet();
        set.delete("mydir"); // TYPE_DELETE_DIR

        ChangeSetPerformer performer = new ChangeSetPerformer(set);
        ArchiveEntry[] entries = { new TestArchiveEntry("mydir/file1.txt", false) };
        MockArchiveInputStream in = new MockArchiveInputStream(entries);
        MockArchiveOutputStream out = new MockArchiveOutputStream();

        ChangeSetResults results = performer.perform(in, out);
        assertNotNull(results);
    }

    public void testIsDeletedLaterFileAndDirEdgeCases() throws Exception {
        ChangeSet set = new ChangeSet();
        // Add file then delete it later in the same changeset (Tests isDeletedLater for file and dir)
        InputStream data = new ByteArrayInputStream("content".getBytes());
        ArchiveEntry entry1 = new TestArchiveEntry("folder/file2.txt", false);
        ArchiveEntry entry2 = new TestArchiveEntry("file3.txt", false);
        
        set.add(entry1, data, false);
        set.add(entry2, data, false);
        set.delete("folder"); // Will trigger TYPE_DELETE_DIR in isDeletedLater
        set.delete("file3.txt"); // Will trigger TYPE_DELETE in isDeletedLater

        ChangeSetPerformer performer = new ChangeSetPerformer(set);
        MockArchiveInputStream in = new MockArchiveInputStream(new ArchiveEntry[0]);
        MockArchiveOutputStream out = new MockArchiveOutputStream();

        ChangeSetResults results = performer.perform(in, out);
        assertNotNull(results);
    }

    public void testAddWithoutReplaceModeProcessedAtEnd() throws Exception {
        ChangeSet set = new ChangeSet();
        InputStream data = new ByteArrayInputStream("content".getBytes());
        ArchiveEntry entry = new TestArchiveEntry("late_add.txt", false);
        set.add(entry, data, false); // TYPE_ADD with replace mode = false

        ChangeSetPerformer performer = new ChangeSetPerformer(set);
        MockArchiveInputStream in = new MockArchiveInputStream(new ArchiveEntry[0]);
        MockArchiveOutputStream out = new MockArchiveOutputStream();

        ChangeSetResults results = performer.perform(in, out);
        assertTrue(results.hasBeenAdded("late_add.txt"));
    }

    public void testNullEntryNameHandling() throws Exception {
        ChangeSet set = new ChangeSet();
        set.delete("target.txt");

        ChangeSetPerformer performer = new ChangeSetPerformer(set);
        // Entry with null name to test 'name != null' condition branches safely
        ArchiveEntry nullNameEntry = new TestArchiveEntry(null, false) {
            public String getName() { return null; }
        };
        
        ArchiveEntry[] entries = { nullNameEntry };
        MockArchiveInputStream in = new MockArchiveInputStream(entries);
        MockArchiveOutputStream out = new MockArchiveOutputStream();

        ChangeSetResults results = performer.perform(in, out);
        assertNotNull(results);
    }
}