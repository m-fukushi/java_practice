package practice;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
  public static void main(String[] args) throws IOException {
	 try {
		 Class.forName("org.h2.Driver");		
	 } catch(ClassNotFoundException e) {
		 throw new IllegalStateException("ドライバのロードに失敗しました");		
	 }
	 Connection con = null;
	 try {
		 //DB情報
		 con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/*","*","*");	 
		 
		 //ここから実際のSQL送信処理
		PreparedStatement pstmt = con.prepareStatement("DELETE FROM MONSTERS WHERE HP<= ? OR NAME = ?");
		pstmt.setInt(1, 10);
		pstmt.setString(2, "ゾンビ");
		int r = pstmt.executeUpdate();
		if (r !=0) {
			System.out.println(r+"件のモンスターを削除しました");
		}else {
			System.out.println("該当するモンスターはありませんでした");
		}
		pstmt.close();
		 
	 }catch(SQLException e){
		 e.printStackTrace();
	 }finally {
		 if(con != null) {
			 try {
				 con.close();				 
			 }catch(SQLException e) {
				 e.printStackTrace();
			 }
		 }
	 }
 }
	   
}
