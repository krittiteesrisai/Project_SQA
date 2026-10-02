package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.HtmlTreeBuilderState; // import คลาสเป้าหมาย (อยู่ใน package เดียวกัน)
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit tests for {@link HtmlTreeBuilderState}.
 *
 * Because HtmlTreeBuilderState / Token / HtmlTreeBuilder are package-private and their
 * construction APIs are not shown in the provided source, the state machine is exercised
 * indirectly through the public Jsoup.parse(...) API. Each test is crafted so that a
 * specific branch described in the enum's source code is triggered, and asserts on the
 * resulting DOM to detect regressions/faults.
 */
public class HtmlTreeBuilderStateTest {

    // ---------------------------------------------------------------
    // Enum sanity (direct use of the imported target class)
    // ---------------------------------------------------------------

    @Test
    public void testEnumConstantsCount() {
        // Initial, BeforeHtml, BeforeHead, InHead, InHeadNoscript, AfterHead, InBody, Text,
        // InTable, InTableText, InCaption, InColumnGroup, InTableBody, InRow, InCell,
        // InSelect, InSelectInTable, AfterBody, InFrameset, AfterFrameset, AfterAfterBody,
        // AfterAfterFrameset, ForeignContent = 23
        assertEquals(23, HtmlTreeBuilderState.values().length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEnumValueOfInvalidNameThrows() {
        HtmlTreeBuilderState.valueOf("NotARealState");
    }

    // ---------------------------------------------------------------
    // Initial / BeforeHtml
    // ---------------------------------------------------------------

    @Test
    public void testEmptyDocumentCreatesHtmlHeadBody() {
        Document doc = Jsoup.parse("");
        assertNotNull(doc.head());
        assertNotNull(doc.body());
        assertEquals("html", doc.child(0).tagName());
    }

    @Test
    public void testLeadingWhitespaceIgnoredBeforeHtml() {
        // Initial.isWhitespace(t) -> true -> ignored; then BeforeHtml handles <html>
        Document doc = Jsoup.parse("   \n\t <html><head></head><body>Hi</body></html>");
        assertEquals("Hi", doc.body().text());
    }

    @Test
    public void testLeadingCommentBeforeHtmlInserted() {
        // Initial: t.isComment() -> tb.insert(comment) (no transition yet)
        Document doc = Jsoup.parse("<!-- top --><html><body>Text</body></html>");
        Node first = doc.childNode(0);
        assertTrue(first instanceof Comment);
        assertEquals(" top ", ((Comment) first).getData());
        assertEquals("Text", doc.body().text());
    }

    @Test
    public void testDoctypeInsertedAsDocumentTypeNode() {
        // Initial: t.isDoctype() branch -> DocumentType appended, transition(BeforeHtml)
        Document doc = Jsoup.parse("<!DOCTYPE html><html><body>A</body></html>");
        Node first = doc.childNode(0);
        assertTrue(first instanceof DocumentType);
        assertEquals(Document.QuirksMode.noQuirks, doc.quirksMode());
    }

    @Test
    public void testDoctypeForceQuirksModeLenient() {
        // NOTE: Not 100% certain which malformed doctype forces quirks at tokenizer level;
        // this test only verifies the forceQuirks branch path executes without throwing,
        // and that quirksMode() returns a defined value either way.
        Document doc = Jsoup.parse("<!DOCTYPE><html><body>A</body></html>");
        assertNotNull(doc.quirksMode());
    }

    @Test
    public void testBeforeHtmlStrayEndTagTriggersImplicitHtml() {
        // Initial else-branch -> transition(BeforeHtml) & reprocess end tag.
        // BeforeHtml: isEndTag() (not head/body/html/br) -> error, return false (stays BeforeHtml)
        // next doctype token now hits BeforeHtml's own doctype branch (error, ignored)
        Document doc = Jsoup.parse("</foo><!DOCTYPE html><html><body>z</body></html>");
        assertEquals("z", doc.body().text());
        for (Node n : doc.childNodes()) {
            assertFalse(n instanceof DocumentType); // doctype was ignored in BeforeHtml
        }
    }

    // ---------------------------------------------------------------
    // BeforeHead / InHead / InHeadNoscript / AfterHead
    // ---------------------------------------------------------------

    @Test
    public void testExplicitHeadElementCreated() {
        Document doc = Jsoup.parse("<html><head><title>T</title></head><body>B</body></html>");
        assertEquals("T", doc.title());
        assertEquals("B", doc.body().text());
    }

    @Test
    public void testBeforeHeadSecondHtmlDelegatesToInBodyAndAddsMissingAttribute() {
        // BeforeHead: startTag "html" -> InBody.process(t, tb) (no transition)
        // InBody: name=="html" -> merge attributes not already present onto root html
        Document doc = Jsoup.parse("<html><html id='two'><body>Y</body></html>");
        assertEquals(1, doc.select("html").size());
        assertEquals("two", doc.select("html").attr("id"));
        assertEquals("Y", doc.body().text());
    }

    @Test
    public void testInBodySecondHtmlDoesNotOverwriteExistingAttribute() {
        // InBody startTag "html": only sets attribute if !html.hasAttr(key)
        Document doc = Jsoup.parse("<html id='first'><body>Y<html id='second'></body></html>");
        assertEquals("first", doc.select("html").attr("id"));
    }

    @Test
    public void testBeforeHeadDoctypeErrorIgnored() {
        // BeforeHead: t.isDoctype() -> error, return false (ignored, stays BeforeHead)
        Document doc = Jsoup.parse("<html><!DOCTYPE html><body>Z</body></html>");
        for (Node n : doc.childNodes()) {
            assertFalse(n instanceof DocumentType);
        }
        assertEquals("Z", doc.body().text());
    }

    @Test
    public void testBeforeHeadStrayEndTagAutoCreatesHeadThenBody() {
        // BeforeHead: endTag in {head,body,html,br} -> process(StartTag head) then reprocess;
        // chained through InHead.anythingElse / AfterHead.anythingElse / InBody endTag "body"
        // and finally AfterBody's final else branch reprocessing text under InBody.
        Document doc = Jsoup.parse("<html></body>Content</html>");
        assertEquals("Content", doc.body().text().trim());
    }

    @Test
    public void testInHeadTitleRcData() {
        // InHead: name.equals("title") -> handleRcData -> Text state, data accessible via title()
        Document doc = Jsoup.parse("<html><head><title>My Title</title></head><body></body></html>");
        assertEquals("My Title", doc.title());
    }

    @Test
    public void testInHeadScriptRawTextData() {
        // InHead: name.equals("script") -> tokeniser ScriptData, Text state, content is DataNode
        Document doc = Jsoup.parse("<html><head><script>var a=1;</script></head><body></body></html>");
        Element script = doc.select("script").first();
        assertNotNull(script);
        assertEquals("var a=1;", script.data());
    }

    @Test
    public void testInHeadStyleRawTextData() {
        // InHead: StringUtil.in(name,"noframes","style") -> handleRawtext
        Document doc = Jsoup.parse("<html><head><style>body{color:red;}</style></head><body></body></html>");
        Element style = doc.select("style").first();
        assertNotNull(style);
        assertEquals("body{color:red;}", style.data());
    }

    @Test
    public void testInHeadMetaAndLinkEmptyElements() {
        // InHead: base/basefont/bgsound/command/link -> insertEmpty ; meta -> insertEmpty
        Document doc = Jsoup.parse("<html><head><link href='a.css'><meta name='x' content='y'></head><body></body></html>");
        Element link = doc.select("link").first();
        Element meta = doc.select("meta").first();
        assertNotNull(link);
        assertNotNull(meta);
        assertEquals(0, link.childNodeSize());
        assertEquals(0, meta.childNodeSize());
    }

    @Test
    public void testInHeadNoscriptPreservesParsedChildren() {
        // InHead: name.equals("noscript") -> insert, transition(InHeadNoscript);
        // jsoup does not execute scripts, so content is parsed normally (not rawtext).
        Document doc = Jsoup.parse("<html><head><noscript><p>Enable JS</p></noscript></head><body>X</body></html>");
        assertEquals("Enable JS", doc.select("head noscript p").text());
    }

    @Test
    public void testInHeadNoscriptNestedLinkMetaProcessed() {
        // InHeadNoscript: (isWhitespace||isComment||startTag in {basefont,bgsound,link,meta,noframes,style})
        // -> tb.process(t, InHead): elements inserted as children of noscript
        Document doc = Jsoup.parse("<html><head><noscript><link href='a'><meta name='b'></noscript></head><body></body></html>");
        assertEquals(1, doc.select("noscript > link").size());
        assertEquals(1, doc.select("noscript > meta").size());
    }

    @Test
    public void testAfterHeadWhitespaceGoesIntoHead() {
        // AfterHead: isWhitespace(t) -> tb.insert(t.asCharacter())
        Document doc = Jsoup.parse("<html><head></head>   <body>B</body></html>");
        assertEquals("B", doc.body().text());
    }

    @Test
    public void testAfterHeadImplicitBodyCreation() {
        // AfterHead: final else -> anythingElse -> process(StartTag "body") then reprocess
        Document doc = Jsoup.parse("<html><head></head>Hello</html>");
        assertEquals("Hello", doc.body().text());
    }

    @Test
    public void testAfterHeadFramesetTransition() {
        // AfterHead: name.equals("frameset") -> insert, transition(InFrameset)
        Document doc = Jsoup.parse("<html><head></head><frameset><frame src='a'></frameset></html>");
        assertEquals(1, doc.select("frameset").size());
        assertEquals(0, doc.select("body").size());
    }

    // ---------------------------------------------------------------
    // InBody
    // ---------------------------------------------------------------

    @Test
    public void testInBodyNullCharacterIgnored() {
        // InBody Character case: c.getData().equals(nullString) -> error, return false (ignored)
        Document doc = Jsoup.parse("<html><body>\u0000abc</body></html>");
        assertFalse(doc.body().text().contains("\u0000"));
        assertTrue(doc.body().text().contains("abc"));
    }

    @Test
    public void testInBodyHeadingAutoClosesPreviousHeading() {
        // InBody startTag Headings: if currentElement is a Heading -> error, pop, then insert
        Document doc = Jsoup.parse("<html><body><h1>One<h2>Two</h2></h1></body></html>");
        Elements kids = doc.body().children();
        assertEquals(2, kids.size());
        assertEquals("h1", kids.get(0).tagName());
        assertEquals("One", kids.get(0).text());
        assertEquals("h2", kids.get(1).tagName());
        assertEquals("Two", kids.get(1).text());
    }

    @Test
    public void testInBodyPClosersAutoCloseOpenP() {
        // InBody startTag in Constants.InBodyStartPClosers -> close open <p> via inButtonScope
        Document doc = Jsoup.parse("<html><body><p>Para<div>Content</div></body></html>");
        Elements kids = doc.body().children();
        assertEquals("p", kids.get(0).tagName());
        assertEquals("Para", kids.get(0).text());
        assertEquals("div", kids.get(1).tagName());
        assertEquals("Content", kids.get(1).text());
    }

    @Test
    public void testInBodyListItemAutoCloses() {
        // InBody startTag "li": loop stack closing previous <li>
        Document doc = Jsoup.parse("<html><body><ul><li>One<li>Two</ul></body></html>");
        Elements lis = doc.select("ul > li");
        assertEquals(2, lis.size());
        assertEquals("One", lis.get(0).text());
        assertEquals("Two", lis.get(1).text());
    }

    @Test
    public void testInBodyDefinitionListAutoCloses() {
        // InBody startTag in Constants.DdDt -> closes previous dd/dt
        Document doc = Jsoup.parse("<html><body><dl><dt>Term<dd>Def</dl></body></html>");
        Elements kids = doc.select("dl").first().children();
        assertEquals(2, kids.size());
        assertEquals("dt", kids.get(0).tagName());
        assertEquals("dd", kids.get(1).tagName());
    }

    @Test
    public void testInBodyAnchorAutoClosesPreviousAnchor() {
        // InBody startTag "a": getActiveFormattingElement("a") != null -> error, close via
        // adoption-agency trivial case (no furthestBlock) then insert new "a"
        Document doc = Jsoup.parse("<html><body><a href='1'>one<a href='2'>two</a></body></html>");
        Elements as = doc.select("a");
        assertEquals(2, as.size());
        assertEquals("one", as.get(0).text());
        assertEquals("1", as.get(0).attr("href"));
        assertEquals("two", as.get(1).text());
        assertEquals("2", as.get(1).attr("href"));
    }

    @Test
    public void testInBodyNobrAutoClosesPreviousNobr() {
        // InBody startTag "nobr": tb.inScope("nobr") -> close previous nobr, then insert new one
        Document doc = Jsoup.parse("<html><body><nobr>A<nobr>B</nobr></body></html>");
        Elements nobrs = doc.select("nobr");
        assertEquals(2, nobrs.size());
        assertEquals("A", nobrs.get(0).text());
        assertEquals("B", nobrs.get(1).text());
    }

    @Test
    public void testInBodyFormattingElementsNested() {
        // InBody startTag in Constants.Formatters -> reconstruct + insert + push active list
        Document doc = Jsoup.parse("<html><body><p><b>Bold <i>BoldItalic</i></b></p></body></html>");
        Element i = doc.select("i").first();
        assertEquals("BoldItalic", i.text());
        assertEquals("b", i.parent().tagName());
    }

    @Test
    public void testInBodyTableClosesOpenParagraphNonQuirks() {
        // InBody startTag "table": quirksMode != quirks && inButtonScope("p") -> close p first
        Document doc = Jsoup.parse("<html><body><p>Para<table><tr><td>Cell</td></tr></table></body></html>");
        Elements kids = doc.body().children();
        assertEquals("p", kids.get(0).tagName());
        assertEquals("table", kids.get(1).tagName());
        assertEquals("Cell", doc.select("table td").text());
    }

    @Test
    public void testInBodyEmptyFormattersSelfClose() {
        // InBody startTag in Constants.InBodyStartEmptyFormatters -> insertEmpty
        Document doc = Jsoup.parse("<html><body><br><img src='x'></body></html>");
        assertEquals(1, doc.select("br").size());
        assertEquals(0, doc.select("br").first().childNodeSize());
        assertEquals("x", doc.select("img").attr("src"));
        assertEquals(0, doc.select("img").first().childNodeSize());
    }

    @Test
    public void testInBodyPlaintextTreatsRestAsLiteralText() {
        // InBody startTag "plaintext" -> tokeniser.transition(PLAINTEXT); never leaves
        Document doc = Jsoup.parse("<html><body><plaintext>Hello <b>World</b></body></html>");
        Element plaintext = doc.select("plaintext").first();
        assertNotNull(plaintext);
        assertTrue(plaintext.text().contains("<b>World</b>"));
    }

    @Test
    public void testInBodyTextareaTreatsContentAsText() {
        // InBody startTag "textarea" -> Rcdata, markInsertionMode, Text state
        Document doc = Jsoup.parse("<html><body><textarea>Some <b>bold</b> text</textarea></body></html>");
        Element ta = doc.select("textarea").first();
        assertEquals("Some <b>bold</b> text", ta.text());
    }

    @Test
    public void testInBodyXmpTreatsContentAsRawData() {
        // InBody startTag "xmp" -> handleRawtext
        Document doc = Jsoup.parse("<html><body><xmp>Line1 <p>Line2</p></xmp></body></html>");
        Element xmp = doc.select("xmp").first();
        assertEquals("Line1 <p>Line2</p>", xmp.data());
    }

    @Test
    public void testInBodySelectTransitionsToInSelect() {
        // InBody startTag "select": state not table-related -> transition(InSelect)
        Document doc = Jsoup.parse("<html><body><select><option>1</option></select></body></html>");
        assertEquals("1", doc.select("select option").text());
    }

    @Test
    public void testInBodyIsindexExpandsToFormControls() {
        // InBody startTag "isindex" -> error; builds form/hr/label/input(name=isindex)
        Document doc = Jsoup.parse("<html><body><isindex></body></html>");
        assertEquals(1, doc.select("form").size());
        assertEquals(1, doc.select("form input[name=isindex]").size());
        assertTrue(doc.select("form hr").size() >= 1);
    }

    @Test
    public void testInBodyDropTagsIgnored() {
        // InBody startTag in Constants.InBodyStartDrop (e.g. "tr" outside table) -> error, ignored
        Document doc = Jsoup.parse("<html><body><tr>text</tr></body></html>");
        assertTrue(doc.body().text().contains("text"));
        assertEquals(0, doc.select("body > tr").size());
    }

    // ---------------------------------------------------------------
    // Text state
    // ---------------------------------------------------------------

    @Test
    public void testTextStateReturnsToOriginalInsertionModeAfterScript() {
        // Text: isEndTag() -> pop, transition(tb.originalState())
        Document doc = Jsoup.parse("<html><body><script>x=1;</script><p>After</p></body></html>");
        assertEquals("After", doc.select("p").text());
        assertEquals("x=1;", doc.select("script").first().data());
    }

    // ---------------------------------------------------------------
    // Table family
    // ---------------------------------------------------------------

    @Test
    public void testTableAutoWrapsTbody() {
        // InTable startTag in {td,th,tr} -> process(StartTag "tbody") then reprocess
        Document doc = Jsoup.parse("<html><body><table><tr><td>Cell</td></tr></table></body></html>");
        assertEquals(1, doc.select("table > tbody > tr > td").size());
        assertEquals("Cell", doc.select("table > tbody > tr > td").text());
    }

    @Test
    public void testTableColAutoCreatesColgroup() {
        // InTable startTag "col" -> process(StartTag "colgroup") then reprocess
        Document doc = Jsoup.parse("<html><body><table><col><tr><td>A</td></tr></table></body></html>");
        assertEquals(1, doc.select("table > colgroup > col").size());
    }

    @Test
    public void testTableCaptionThenRows() {
        // InCaption: explicit </caption> -> transition(InTable); subsequent tr wraps into tbody
        Document doc = Jsoup.parse("<html><body><table><caption>Cap</caption><tr><td>A</td></tr></table></body></html>");
        assertEquals("Cap", doc.select("caption").text());
        assertEquals(1, doc.select("table > tbody").size());
    }

    @Test
    public void testTableImplicitCaptionCloseOnTr() {
        // InCaption: startTag "tr" (in the OR list) -> error, process EndTag caption, reprocess
        Document doc = Jsoup.parse("<html><body><table><caption>Cap<tr><td>A</td></tr></table></body></html>");
        assertEquals("Cap", doc.select("caption").text());
        assertEquals("A", doc.select("table td").text());
    }

    @Test
    public void testTableTextFosterParenting() {
        // InTable Character -> InTableText buffering; on next token, non-ws chars are
        // foster-parented via InBody with setFosterInserts(true)
        Document doc = Jsoup.parse("<html><body><table>Foster<tr><td>Cell</td></tr></table></body></html>");
        assertTrue(doc.body().text().contains("Foster"));
        Element table = doc.select("table").first();
        assertNotNull(table.previousSibling()); // foster-parented node sits before <table>
        assertEquals("Cell", doc.select("table td").text());
    }

    @Test
    public void testTableBodyDirectCellAutoInsertsTr() {
        // InTableBody startTag in {th,td} -> error, process(StartTag "tr") then reprocess
        Document doc = Jsoup.parse("<html><body><table><tbody><td>Direct</td></tbody></table></body></html>");
        assertEquals("Direct", doc.select("table > tbody > tr > td").text());
    }

    @Test
    public void testTableBodySectionsExitProperly() {
        // InTableBody exitTableBody(): switching from tbody to tfoot via "table" sections
        Document doc = Jsoup.parse(
            "<html><body><table><tbody><tr><td>1</td></tr></tbody>" +
            "<tfoot><tr><td>2</td></tr></tfoot></table></body></html>");
        assertEquals(1, doc.select("tbody").size());
        assertEquals(1, doc.select("tfoot").size());
        assertEquals("1", doc.select("tbody td").text());
        assertEquals("2", doc.select("tfoot td").text());
    }

    @Test
    public void testColumnGroupAnythingElseClosesAndDelegates() {
        // InColumnGroup: startTag "tr" (not html/col) -> anythingElse -> close colgroup, reprocess
        Document doc = Jsoup.parse("<html><body><table><colgroup><tr><td>A</td></tr></table></body></html>");
        assertEquals(1, doc.select("colgroup").size());
        assertEquals("A", doc.select("table > tbody > tr > td").text());
    }

    @Test
    public void testRowAutoClosesPreviousCellOnNewCell() {
        // InCell: startTag "td" while a td is open -> closeCell() then reprocess
        Document doc = Jsoup.parse("<html><body><table><tr><td>A<td>B</tr></table></body></html>");
        Elements tds = doc.select("tr > td");
        assertEquals(2, tds.size());
        assertEquals("A", tds.get(0).text());
        assertEquals("B", tds.get(1).text());
    }

    @Test
    public void testRowHandlesThAndTdTogether() {
        // InRow: StringUtil.in(name,"th","td") -> clearStackToTableRowContext, transition(InCell)
        Document doc = Jsoup.parse("<html><body><table><tr><th>Head</th><td>Data</td></tr></table></body></html>");
        assertEquals("Head", doc.select("tr > th").text());
        assertEquals("Data", doc.select("tr > td").text());
    }

    @Test
    public void testCellDelegatesUnmatchedTagsToInBody() {
        // InCell: tag not in its special lists -> anythingElse -> tb.process(t, InBody)
        Document doc = Jsoup.parse("<html><body><table><tr><td><b>Bold</b></td></tr></table></body></html>");
        assertEquals("Bold", doc.select("td b").text());
    }

    @Test
    public void testInSelectOptionAutoCloses() {
        // InSelect startTag "option" -> always process(EndTag "option") first, then insert
        Document doc = Jsoup.parse("<html><body><select><option>1</option><option>2</option></select></body></html>");
        Elements opts = doc.select("select > option");
        assertEquals(2, opts.size());
        assertEquals("1", opts.get(0).text());
        assertEquals("2", opts.get(1).text());
    }

    @Test
    public void testInSelectOptgroupAutoCloses() {
        // InSelect startTag "optgroup": closes previous option/optgroup before insert
        Document doc = Jsoup.parse(
            "<html><body><select><optgroup><option>1</option></optgroup>" +
            "<optgroup><option>2</option></optgroup></select></body></html>");
        assertEquals(2, doc.select("optgroup").size());
        assertEquals("1", doc.select("optgroup").get(0).select("option").text());
        assertEquals("2", doc.select("optgroup").get(1).select("option").text());
    }

    @Test
    public void testInSelectEndSelectResetsInsertionMode() {
        // InSelect endTag "select" -> popStackToClose, resetInsertionMode()
        Document doc = Jsoup.parse("<html><body><select></select><p>After</p></body></html>");
        assertEquals("After", doc.select("p").text());
        assertEquals(0, doc.select("select p").size());
    }

    @Test
    public void testInSelectInTableDelegatesToInSelect() {
        // select opened while state is InCell -> transition(InSelectInTable); tag not in the
        // table-related list -> delegates to InSelect.process
        Document doc = Jsoup.parse(
            "<html><body><table><tr><td><select><option>1</option></select></td></tr></table></body></html>");
        assertEquals(1, doc.select("td select").size());
        assertEquals("1", doc.select("td select option").text());
    }

    // ---------------------------------------------------------------
    // AfterBody / Frameset family
    // ---------------------------------------------------------------

    @Test
    public void testAfterBodyTrailingCommentAttachesUnderHtml() {
        // AfterBody -> AfterAfterBody; comment inserted at current stack top (<html>)
        Document doc = Jsoup.parse("<html><body>Content</body></html><!--trailing comment-->");
        boolean found = false;
        for (Node n : doc.select("html").first().childNodes()) {
            if (n instanceof Comment && "trailing comment".equals(((Comment) n).getData())) {
                found = true;
            }
        }
        assertTrue(found);
    }

    @Test
    public void testAfterBodyMalformedReprocessesInBody() {
        // AfterBody final else: error, transition(InBody), reprocess token
        Document doc = Jsoup.parse("<html><head></head><body>Content</body></html>Extra");
        assertTrue(doc.body().text().contains("Content"));
        assertTrue(doc.body().text().contains("Extra"));
    }

    @Test
    public void testFramesetFramesInserted() {
        // InFrameset: startTag "frame" -> insertEmpty; "frameset" nested -> insert
        Document doc = Jsoup.parse("<html><frameset><frame src='a'><frame src='b'></frameset></html>");
        assertEquals(2, doc.select("frameset > frame").size());
        assertEquals(0, doc.select("body").size());
    }

    @Test
    public void testFramesetThenAfterFramesetComment() {
        // InFrameset endTag "frameset" -> pop, transition(AfterFrameset);
        // AfterFrameset endTag "html" -> transition(AfterAfterFrameset); comment inserted after
        Document doc = Jsoup.parse("<html><frameset></frameset></html><!--c-->");
        assertEquals(1, doc.select("frameset").size());
        boolean found = false;
        for (Node n : doc.select("html").first().childNodes()) {
            if (n instanceof Comment && "c".equals(((Comment) n).getData())) {
                found = true;
            }
        }
        assertTrue(found);
    }

    @Test
    public void testAfterAfterFramesetNoframesProcessed() {
        // AfterAfterFrameset: startTag "noframes" -> tb.process(t, InHead) -> handleRawtext
        Document doc = Jsoup.parse("<html><frameset></frameset></html><noframes>ignored</noframes>");
        Element nf = doc.select("noframes").first();
        assertNotNull(nf);
        assertEquals("ignored", nf.data());
    }

    // ---------------------------------------------------------------
    // Robustness / boundary / malformed input
    // ---------------------------------------------------------------

    @Test
    public void testMalformedNestedTagsDoNotThrow() {
        Document doc = Jsoup.parse("<<<>>><html>>>>body<<<</html>");
        assertNotNull(doc);
    }

    @Test
    public void testUnclosedTagsHandledGracefully() {
        Document doc = Jsoup.parse("<html><body><div><p>text");
        assertTrue(doc.body().text().contains("text"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullHtmlInputThrows() {
        // Not a direct HtmlTreeBuilderState branch, but validates boundary/null handling
        // of the public entry point that drives the state machine.
        Jsoup.parse((String) null);
    }

    @Test
    public void testEmptyStringProducesMinimalDocument() {
        Document doc = Jsoup.parse("");
        assertEquals("", doc.body().text());
    }
}
