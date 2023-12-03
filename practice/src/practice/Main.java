package practice;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class Main {
    public static void main(String[] args) throws IOException{
    	//
    	//コピー元ファイル:args[0]
    	//コピー先ファイル：args[1]
    	FileInputStream fi = null;
    	FileOutputStream fo =null;
    	GZIPOutputStream zip =null;
    	try {
	    		fi = new FileInputStream(args[0]);
		    	fo = new FileOutputStream(args[1]);
		    	
		    	BufferedOutputStream bw = new BufferedOutputStream(fo);
		    	zip = new GZIPOutputStream(bw);
		    	
//		    	byte[] readData = fi.readAllBytes();
		    	
//		    	for(byte b : readData) {
//		    		fo.write(b);    		
//		    	}
		    	int readData = fi.read();
		    	while(readData != -1){
			    	zip.write(readData);
			    	readData = fi.read();
		    	}
		    	zip.flush();
    	}catch(IOException e) {    		
    		System.out.println("エラーでやんす");
    	}finally {
    		try {
		    	fi.close();
		    	zip.close();
	    	}catch(IOException e) { 
	    		
	    	}
    		
    	}
    }
}


	
