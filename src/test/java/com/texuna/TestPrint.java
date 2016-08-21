package com.texuna;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.texuna.parser.TsvParser;
import com.texuna.parser.XmlParser;
import com.texuna.print.PrintReport2File;

public class TestPrint {

	@Test
	public void testConfig() {
		String testName = "testConfig";
		System.out.println(testName);
		
    	// get settings
    	
    	XmlParser xmlParser = new XmlParser();
        xmlParser.parse("src/test/resources/settingsTest.xml");
        
        assertTrue(xmlParser.getSettings().getPage().getHeight() == 12);
        assertTrue(xmlParser.getSettings().getPage().getWidth() == 32);
        assertTrue(xmlParser.getSettings().getColumns().get(0).getWidth() == 8 );
        assertTrue(xmlParser.getSettings().getColumns().get(0).getTitle().equalsIgnoreCase("Номер"));
        assertTrue(xmlParser.getSettings().getColumns().get(1).getWidth() == 7 );
        assertTrue(xmlParser.getSettings().getColumns().get(1).getTitle().equalsIgnoreCase("Дата"));
        assertTrue(xmlParser.getSettings().getColumns().get(2).getWidth() == 7 );
        assertTrue(xmlParser.getSettings().getColumns().get(2).getTitle().equalsIgnoreCase("ФИО"));

//		source input data
        
        TsvParser tsvParser = new TsvParser();
        tsvParser.parse("src/test/resources/source-dataTest.tsv");
        
        assertTrue(tsvParser.getTsvParserResult().size() == 5 );

	}
	@Test
	public void testPrint2File00() {
		String testName = "test00";
		System.out.println(testName);
		
//      get settings
		
		XmlParser xmlParser = new XmlParser();
		xmlParser.parse("settings.xml");
		
//		source input data
		
		TsvParser tsvParser = new TsvParser();
		tsvParser.parse("source-data.tsv");
		
//		Print a report
		
		PrintReport2File txtReportGenerator = new PrintReport2File();
		txtReportGenerator.setSettings(xmlParser.getSettings());
		txtReportGenerator.setInput(tsvParser.getTsvParserResult());
		txtReportGenerator.print2File("test.txt");
	}

	@Test
	public void testPrint2File01() {
		String testName = "test01";
		System.out.println(testName);
		
//      get settings
		
		XmlParser xmlParser = new XmlParser();
		xmlParser.parse("src/test/resources/settingsTest.xml");
		
//		source input data
		
		TsvParser tsvParser = new TsvParser();
		tsvParser.parse("src/test/resources/source-data1.tsv");
		
//		Print a report
		
		PrintReport2File txtReportGenerator = new PrintReport2File();
		txtReportGenerator.setSettings(xmlParser.getSettings());
		txtReportGenerator.setInput(tsvParser.getTsvParserResult());
		txtReportGenerator.print2File("test1.txt");
	}
	
	@Test
	public void testPrint2File02() {
		String testName = "test02";
		System.out.println(testName);
		
//      get settings
		
		XmlParser xmlParser = new XmlParser();
		xmlParser.parse("src/test/resources/settingsTest.xml");
		
//		source input data
		
		TsvParser tsvParser = new TsvParser();
		tsvParser.parse("src/test/resources/source-data2.tsv");
		
//		Print a report
		
		PrintReport2File txtReportGenerator = new PrintReport2File();
		txtReportGenerator.setSettings(xmlParser.getSettings());
		txtReportGenerator.setInput(tsvParser.getTsvParserResult());
		txtReportGenerator.print2File("test2.txt");
	}
	@Test
	public void testPrint2File03() {
		String testName = "test03";
		
		System.out.println(testName);
		
//      get settings
		
		XmlParser xmlParser = new XmlParser();
		xmlParser.parse("src/test/resources/settingsTest.xml");
		
//		source input data
		
		TsvParser tsvParser = new TsvParser();
		tsvParser.parse("src/test/resources/source-data3.tsv");
		
//		Print a report
		
		PrintReport2File txtReportGenerator = new PrintReport2File();
		txtReportGenerator.setSettings(xmlParser.getSettings());
		txtReportGenerator.setInput(tsvParser.getTsvParserResult());
		txtReportGenerator.print2File("test3.txt");
	}
	@Test
	public void testPrint2File04() {
		String testName = "test04";
		System.out.println(testName);
		XmlParser xmlParser = new XmlParser();
		xmlParser.parse("src/test/resources/settingsTest.xml");
		TsvParser tsvParser = new TsvParser();
		tsvParser.parse("src/test/resources/source-data4.tsv");
		PrintReport2File txtReportGenerator = new PrintReport2File();
		txtReportGenerator.setSettings(xmlParser.getSettings());
		txtReportGenerator.setInput(tsvParser.getTsvParserResult());
		txtReportGenerator.print2File("test4.txt");
	}
	@Test
	public void testPrint2File05() {
		String testName = "test05";
		System.out.println(testName);
		XmlParser xmlParser = new XmlParser();
		xmlParser.parse("src/test/resources/settingsTest.xml");
		TsvParser tsvParser = new TsvParser();
		tsvParser.parse("src/test/resources/source-data5.tsv");
		PrintReport2File txtReportGenerator = new PrintReport2File();
		txtReportGenerator.setSettings(xmlParser.getSettings());
		txtReportGenerator.setInput(tsvParser.getTsvParserResult());
		txtReportGenerator.print2File("test5.txt");
	}
	@Test
	public void testPrint2File06() {
		String testName = "test06";
		System.out.println(testName);
		XmlParser xmlParser = new XmlParser();
		xmlParser.parse("src/test/resources/settingsTest.xml");
		TsvParser tsvParser = new TsvParser();
		tsvParser.parse("src/test/resources/source-data6.tsv");
		PrintReport2File txtReportGenerator = new PrintReport2File();
		txtReportGenerator.setSettings(xmlParser.getSettings());
		txtReportGenerator.setInput(tsvParser.getTsvParserResult());
		txtReportGenerator.print2File("test6.txt");
	}
	@Test
	public void testPrint2File07() {
		String testName = "test07";
		System.out.println(testName);
		XmlParser xmlParser = new XmlParser();
		xmlParser.parse("src/test/resources/settingsTest.xml");
		TsvParser tsvParser = new TsvParser();
		tsvParser.parse("src/test/resources/source-data7.tsv");
		PrintReport2File txtReportGenerator = new PrintReport2File();
		txtReportGenerator.setSettings(xmlParser.getSettings());
		txtReportGenerator.setInput(tsvParser.getTsvParserResult());
		txtReportGenerator.print2File("test7.txt");
	}
	@Test
	public void testPrint2File08() {
		String testName = "test08";
		System.out.println(testName);
		XmlParser xmlParser = new XmlParser();
		xmlParser.parse("src/test/resources/settingsTest.xml");
		TsvParser tsvParser = new TsvParser();
		tsvParser.parse("src/test/resources/source-data8.tsv");
		PrintReport2File txtReportGenerator = new PrintReport2File();
		txtReportGenerator.setSettings(xmlParser.getSettings());
		txtReportGenerator.setInput(tsvParser.getTsvParserResult());
		txtReportGenerator.print2File("test8.txt");
	}
	@Test
	public void testPrint2File09() {
		String testName = "test09";
		System.out.println(testName);
		XmlParser xmlParser = new XmlParser();
		xmlParser.parse("src/test/resources/settingsTest.xml");
		TsvParser tsvParser = new TsvParser();
		tsvParser.parse("src/test/resources/source-data9.tsv");
		PrintReport2File txtReportGenerator = new PrintReport2File();
		txtReportGenerator.setSettings(xmlParser.getSettings());
		txtReportGenerator.setInput(tsvParser.getTsvParserResult());
		txtReportGenerator.print2File("test9.txt");
	}
	@Test
	public void testPrint2File10() {
		String testName = "test10";
		System.out.println(testName);
		XmlParser xmlParser = new XmlParser();
		xmlParser.parse("src/test/resources/settingsTest.xml");
		TsvParser tsvParser = new TsvParser();
		tsvParser.parse("src/test/resources/source-data10.tsv");
		PrintReport2File txtReportGenerator = new PrintReport2File();
		txtReportGenerator.setSettings(xmlParser.getSettings());
		txtReportGenerator.setInput(tsvParser.getTsvParserResult());
		txtReportGenerator.print2File("test10.txt");
	}
	
}
