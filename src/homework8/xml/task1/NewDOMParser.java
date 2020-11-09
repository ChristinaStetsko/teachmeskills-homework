package homework8.xml.task1;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class NewDOMParser {

    private static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newDefaultInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("/home/christina/IdeaProjects/teachmeskills-homework/src/homework8/xml/task1/medicine.xml"));

        NodeList employeeElements = document.getDocumentElement().getElementsByTagName("employee");
        for (int i = 0; i < employeeElements.getLength(); i++) {
            Node employee = employeeElements.item(i);
            NamedNodeMap attributes = employee.getAttributes();
            employees.add(new Employee(attributes.getNamedItem("first_name").getNodeValue(),
                    attributes.getNamedItem("last_name").getNodeValue(),
                    attributes.getNamedItem("position").getNodeValue(),
                    attributes.getNamedItem("department").getNodeValue(),
                    Integer.parseInt(attributes.getNamedItem("experience").getNodeValue())
            ));
        }

        for (Employee employee : employees) {
            System.out.printf("Employee name: %s %s, position: %s, department: %s, experience: %d",
                    employee.getFirstName(), employee.getLastName(), employee.getPosition(), employee.getDepartment(), employee.getExperience());
            System.out.println();
        }
    }
}