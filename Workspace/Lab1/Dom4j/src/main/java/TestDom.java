import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class TestDom {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Document doc = DocumentFactory.getInstance().createDocument();
		Element root = doc.addElement("root");
		root.addAttribute("myAttribute", "myValue");
		Element elem = root.addElement("myElem");
		elem.addText("Hello World");
		
		FileOutputStream fos = new FileOutputStream("simple.xml");
		OutputFormat format = OutputFormat.createPrettyPrint();
		XMLWriter writer = new XMLWriter(fos, format);
		writer.write(doc);
		writer.flush();
		writer.close();
		fos.close();
		

	}

}
