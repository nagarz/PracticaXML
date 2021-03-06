package dani.java.controller;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import dani.java.model.ProgramacioAula;

public class XMLParser {
	
	public static ProgramacioAula readXML(File file) {
		ProgramacioAula programacioAula = null;
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(dani.java.model.ObjectFactory.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			programacioAula = (ProgramacioAula) ((javax.xml.bind.JAXBElement) jaxbUnmarshaller.unmarshal(file)).getValue();
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return programacioAula;
	}
}
