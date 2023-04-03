package com.lokesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.bind.JAXBException;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws JAXBException {
		SpringApplication.run(DemoApplication.class, args);
		XmlToJavaSimple xmlToJsonConvert = new XmlToJavaSimple();
		xmlToJsonConvert.convert();
	}

}
