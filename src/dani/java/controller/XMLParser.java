package dani.java.controller;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import dani.java.model.ProgramacioAula;

public class XMLParser {
	
	@SuppressWarnings("unused")
	private static ProgramacioAula readXML(File file) {
		ProgramacioAula programacioAula = null;
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(ProgramacioAula.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			programacioAula = (ProgramacioAula) jaxbUnmarshaller.unmarshal(file);
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return programacioAula;
	}
}
