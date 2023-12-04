package practice;

import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
  public static void main(String[] args) throws Exception {
	    ObjectMapper mapper = new ObjectMapper();
	    JsonNode root = mapper.readTree(new File("hero.json"));
	    JsonNode hero = root.get("hero");
	    JsonNode weapon = hero.get("weapon");
	    System.out.println("名前:" + hero.get("name").textValue());
	    System.out.println("武器:" + weapon.get("name").textValue());
  }
//    InputStream is = new FileInputStream("rpgsave.xml");
//    Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(is);  // (1)
//    Element hero = doc.getDocumentElement();            // (2)
//    Element weapon = findChildByTag(hero, "weapon");    // (3)
//    Element power = findChildByTag(weapon, "power");    // (4)
//    String value = power.getTextContent();              // (5)
//  }
//  // 指定された名前を持つタグの最初の子タグを返す
//  static Element findChildByTag(Element self, String name) throws Exception {
//    NodeList children = self.getChildNodes();           // すべての子を取得
//    for (int i = 0; i < children.getLength(); i++) {
//      if (children.item(i) instanceof Element) {
//        Element e = (Element)children.item(i);
//        if (e.getTagName().equals(name)) {              // タグ名を照合
//          return e;
//        }
//      }
//    }
//    return null;
//  }
}
