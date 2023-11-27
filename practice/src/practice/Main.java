package practice;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
//       FileWriter fw = new FileWriter("G:\\rpgsave.dat",true);
//       fw.write('A');
//       fw.flush();
//       fw.close();
       FileReader fr = new FileReader("G:\\rpgsave.dat");
       System.out.println("すべてのデータを読んで表示します");
       int i = fr.read();
       while(i != -1) {
    	   char c = (char)i;
    	   System.out.println(c);
    	   i= fr.read();
       }
       System.out.println("データの末尾に到達しました");
       fr.close();
    }
}


	
