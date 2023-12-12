package practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class Main {
  public static void main(String[] args) throws IOException {
	  //8-1
	  URL url = new URL("https://dokojava.jp/favicon.ico");
	  InputStream is = url.openStream();
	  OutputStream os = new FileOutputStream("dj.ico");
	  int i = is.read();	  
	 while(i !=0) {
		 os.write((byte)i);
		 i = is.read();
	 }
	  is.close();
	  os.flush();
	  os.close();
	  
	  
//	 //8-2
//	  Socket sock = new Socket("smtp.example.com",60025);
//	  InputStream is = sock.getInputStream();
//	  OutputStream os = sock.getOutputStream();
//	  os.write("HELO smtp.example.com".getBytes());
//	  os.write("MAIL FROM: asaka@example.com".getBytes());
//	  os.write("RCPT TO: minato@example.com".getBytes());
//	  os.write("DATA".getBytes());
//	  os.write("From: asaka@example.com".getBytes());
//	  os.write("Subject: Please send me your RPG".getBytes());
//	  os.write("Hello minato. I would like to play your RPG.\r\n".getBytes());
//	  os.write("Could you please send it to me ?".getBytes());
//	  os.write("QUIT".getBytes());
//	  os.flush();
//	  
//	  sock.close();
 }
	   
}
