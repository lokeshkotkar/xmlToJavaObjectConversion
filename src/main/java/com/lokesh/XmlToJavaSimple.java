package com.lokesh;
import org.json.JSONObject;
import org.json.XML;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

public class XmlToJavaSimple {

//    java object to xml - Marshalling
//    xml to java object - Unmarshalling

    public void convert() throws JAXBException {
        String xmlStr = "<student>\r\n" +
                "	<firstName>John</firstName>\r\n" +
                "	<id>1</id>\r\n" +
                "	<lastName>Smith</lastName>\r\n" +
                "</student>";

        //convert xml to json object added org.json dependency in build.gradle file
        JSONObject json = XML.toJSONObject(xmlStr);

        System.out.println(json);

        //convert xml to java object //
        JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Student student = (Student) unmarshaller.unmarshal(new StringReader(xmlStr));
        System.out.println(student.getFirstName());


    }
}
