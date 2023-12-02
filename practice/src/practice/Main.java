package practice;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
//    	String msg = "第一土曜日は資源ごみの回収です";
//    	Reader sr =new StringReader(msg);
//    	System.out.print((char)sr.read());
//    	System.out.print((char)sr.read());
    	
//    	ByteArrayOutputStream baos = new ByteArrayOutputStream();
//    	baos.write(65);
//    	baos.write(66);
//    	byte[] data = baos.toByteArray();
//    	for(byte b: data) {
//    		System.out.println(b);
//    	}
    	
    	//フィルタの例
//    	FileOutputStream fos = new FileOutputStream("data.txt");
//    	CipherOutputStream cos = new CipherOutputStream(fos,algo);
//    	OutputStreamWriter osw = new OutputStreamWriter(cos);
//    	osw.write("AB");
    	FileReader fr = new FileReader("rpgsave.dat");
    	BufferedReader br = new BufferedReader(fr);
    	String line = null;
    	while((line = br.readLine()) != null) {
    		System.out.println(line);    		
    	};
    	br.close();
    	
    	
    }
}


	
