package practice;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {
  public static void main(String[] args) throws Exception {
	  //7-1
//	  Reader fr = new FileReader("G:\\OneDrive\\ドキュメント\\sukkiri-javap3-codes\\chap07\\quizans07-01\\pref.properties");
//	  Properties p = new Properties();
//	  p.load(fr);
//	  String aichi_capital = p.getProperty("aichi.capital");
//	  String aichi_food = p.getProperty("aichi.food");
//	  System.out.println(aichi_capital+":"+aichi_food);
	  
	  
	  //7-2 練習問題
	  //System.out.println("java.class.path :" + System.getProperty("java.class.path"));
//	  ResourceBundle rb = ResourceBundle.getBundle("pref");
//	  String aichi_capital = rb.getString("aichi.capital");
//	  String aichi_food = rb.getString("aichi.food");
//	  System.out.println(aichi_capital+":"+aichi_food);
//  
	  //7-3練習問題
	  Employee em = new Employee();
	  em.name = "田中太郎";
	  em.age = 41;
	  Department dm =new Department();
	  dm.name ="総務部";	  
	  dm.leader = em;
	  
	  FileOutputStream fos = new FileOutputStream("company.dat");
	  ObjectOutputStream oos = new ObjectOutputStream(fos);
	  oos.writeObject(dm);
	  oos.flush();
	  oos.close();
	  
	  
	  
	  
  }
	   
}
