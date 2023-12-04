package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
  public static void main(String[] args) throws Exception {
	   Hero hero1 = new Hero("ミナト",75,18);
	   //①インスタンスの直列化と保存
	   FileOutputStream fos = new FileOutputStream("rpgsave.dat");
	   ObjectOutputStream oos = new ObjectOutputStream(fos);
	   oos.writeObject(hero1);
	   oos.flush();
	   oos.close();
	   //②ファイルからインスタンス復元
	   FileInputStream fis = new FileInputStream("rpgsave.dat");
	   ObjectInputStream ois = new ObjectInputStream(fis);
	   Hero hero2 = (Hero)ois.readObject();
	   ois.close();
	   System.out.println(hero2.getName());
	   System.out.println(hero2.getHp());
	   System.out.println(hero2.getMp());
  }
	   
}
