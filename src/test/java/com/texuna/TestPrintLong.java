package com.texuna;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.texuna.parser.TsvParser;
import com.texuna.parser.XmlParser;
import com.texuna.print.PrintReport2File;

public class TestPrintLong {

	@Test
	public void testConfig() {
		String testName = "Test Config Long";
		System.out.println(testName);
		
    	// get settings
    	
    	XmlParser xmlParser = new XmlParser();
        xmlParser.parse("src/test/resources/settingsLong.xml");
        
        assertTrue(xmlParser.getSettings().getPage().getHeight() == 12);
        assertTrue(xmlParser.getSettings().getPage().getWidth() == 53);
        assertTrue(xmlParser.getSettings().getColumns().get(0).getWidth() == 5 );
        assertTrue(xmlParser.getSettings().getColumns().get(0).getTitle().equalsIgnoreCase("Номер"));
        assertTrue(xmlParser.getSettings().getColumns().get(1).getWidth() == 7 );
        assertTrue(xmlParser.getSettings().getColumns().get(1).getTitle().equalsIgnoreCase("Дата"));
        assertTrue(xmlParser.getSettings().getColumns().get(2).getWidth() == 8 );
        assertTrue(xmlParser.getSettings().getColumns().get(2).getTitle().equalsIgnoreCase("ФИО"));
        assertTrue(xmlParser.getSettings().getColumns().get(3).getWidth() == 20 );
        assertTrue(xmlParser.getSettings().getColumns().get(3).getTitle().equalsIgnoreCase("Особые приметы"));

//		source input data
        
        TsvParser tsvParser = new TsvParser();
        tsvParser.parse("src/test/resources/source-dataLong.tsv");
        
        assertTrue(tsvParser.getTsvParserResult().size() == 5 );

	}
	
	@Test
	public void testPrint2FileLong01() {
		String testName = "testLong";
		System.out.println(testName);
		XmlParser xmlParser = new XmlParser();
		xmlParser.parse("src/test/resources/settingsLong.xml");
		TsvParser tsvParser = new TsvParser();
		tsvParser.parse("src/test/resources/source-dataLong.tsv");
		
		PrintReport2File txtReportGenerator = new PrintReport2File();
		txtReportGenerator.setSettings(xmlParser.getSettings());
		txtReportGenerator.setInput(tsvParser.getTsvParserResult());
		txtReportGenerator.print2File("testLong.txt");
	}
	
}
