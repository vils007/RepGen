package com.texuna.parser;

import com.texuna.config.Settings;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import java.io.FileInputStream;
import java.io.IOException;

public class XmlParser {

	private Settings settings;

	public void parse(String fileName) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Settings.class);
			XMLStreamReader xmlsr = XMLInputFactory.newFactory()
					.createXMLStreamReader(new FileInputStream(fileName));
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			xmlsr.nextTag();
			settings = (Settings) unmarshaller.unmarshal(xmlsr);
		} catch (XMLStreamException | JAXBException | IOException e) {
			e.printStackTrace();
		}
	}

	public Settings getSettings() {
		return settings;
	}

	public void setSettings(Settings parsedSettings) {
		this.settings = parsedSettings;
	}
}
