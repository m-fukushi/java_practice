package practice;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
    	//通常try-catch
//    	FileWriter fw = null;
//    	try {
//    		fw = new FileWriter("rpgsave.dat",true);
//    		fw.write('A');
//    		fw.flush();
//    	}catch(IOException e){
//    		System.out.println("ファイル書き込みエラーです");
//    	}finally {
//    		if(fw != null) {
//    			try {
//    				fw.close();
//    			}catch(IOException e2) {}
//    		}
//    	}
    	
    	//try-with-resourse
    	try (
    			FileWriter fw = new FileWriter("rpgsave.dat",true);
    		)
    	{    		
    		fw.write('A');
    		fw.flush();
    	}    	
    	catch(IOException e){
    		System.out.println("ファイル書き込みエラーです");
    	}
    	
    	
//    	FileOutputStream fos = new FileOutputStream("rpgsave.dat",true);
//    	fos.write(65);
//    	fos.flush();
//    	fos.close();
//       FileWriter fw = new FileWriter("G:\\rpgsave.dat",true);
//       fw.write('A');
//       fw.flush();
//       fw.close();
//       FileReader fr = new FileReader("G:\\rpgsave.dat");
//       System.out.println("すべてのデータを読んで表示します");
//       int i = fr.read();
//       while(i != -1) {
//    	   char c = (char)i;
//    	   System.out.println(c);
//    	   i= fr.read();
//       }
//       System.out.println("データの末尾に到達しました");
//       fr.close();
    }
}


	
