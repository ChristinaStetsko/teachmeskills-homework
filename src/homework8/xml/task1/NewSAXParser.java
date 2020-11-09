package homework8.xml.task1;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class NewSAXParser {

    private static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();

        XMLHandler handler = new XMLHandler();
        parser.parse(new File("/home/christina/IdeaProjects/teachmeskills-homework/src/homework8/xml/task1/medicine.xml"), handler);

        for (Employee employee : employees) {
            System.out.printf("Employee name: %s %s, position: %s, department: %s, experience: %d",
                    employee.getFirstName(), employee.getLastName(), employee.getPosition(), employee.getDepartment(), employee.getExperience());
            System.out.println();
        }

        System.out.println("\nCheck name method: ");
        checkEmployee("John Carmack"); //true
        checkEmployee("Marie Curie"); //true
        checkEmployee("Ivan Ivanov"); //false
    }

    private static class XMLHandler extends DefaultHandler {
        @Override
        public void startDocument() throws SAXException {
            super.startDocument();
        }

        @Override
        public void endDocument() throws SAXException {
            super.endDocument();
        }

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            if (qName.equals("employee")) {
                String first_name = attributes.getValue("first_name");
                String last_name = attributes.getValue("last_name");
                String position = attributes.getValue("position");
                String department = attributes.getValue("department");
                int experience = Integer.parseInt(attributes.getValue("experience"));
                employees.add(new Employee(first_name, last_name, position, department, experience));
            }
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            super.endElement(uri, localName, qName);
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            super.characters(ch, start, length);
        }

        @Override
        public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {
            super.ignorableWhitespace(ch, start, length);
        }
    }


    public static void checkEmployee(String firstName_lastName) {
        String[] name = firstName_lastName.split(" ");
        String firstName = name[0];
        String lastName = name[1];
        for (Employee employee : employees) {
            if (firstName.equals(employee.getFirstName()) && lastName.equals(employee.getLastName())) {
                System.out.printf("Employee name: %s %s, position: %s, department: %s, experience: %d\n",
                        employee.getFirstName(), employee.getLastName(), employee.getPosition(), employee.getDepartment(), employee.getExperience());
            }
        }
    }
}