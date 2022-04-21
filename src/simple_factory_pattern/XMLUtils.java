package simple_factory_pattern;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtils {
    //该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
    public static Object getShapeType() {
        try {
            //创建DOM文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("src/simple_factory_pattern/config.xml"));

            //获取包含类名的文本结点
            NodeList nl = doc.getElementsByTagName("shapeType");
            Node classNode = nl.item(0).getFirstChild();
            String shapeType = classNode.getNodeValue().trim();

            return shapeType;
        }
        catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}