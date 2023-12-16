package practice;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
		 con.setAutoCommit(false);
		 
		 //ここから実際のSQL送信処理
		//更新系
//		PreparedStatement pstmt = con.prepareStatement("DELETE FROM MONSTERS WHERE HP<= ? OR NAME = ?");
//		pstmt.setInt(1, 10);
//		pstmt.setString(2, "ゾンビ");
//		int r = pstmt.executeUpdate();
//		if (r !=0) {
//			System.out.println(r+"件のモンスターを削除しました");
		 
//		}else {
//			System.out.println("該当するモンスターはありませんでした");
//		}
		//検索系
		 PreparedStatement pstmt = con.prepareStatement("SELECT * FROM MONSTERS WHERE HP>= ?");
		 pstmt.setInt(1, 10);
		 ResultSet rs = pstmt.executeQuery();
		 while(rs.next()) {
			 System.out.println(rs.getString("NAME"));
		 }
		 
		 
		pstmt.close();
		
		con.commit();
		
	 }catch(SQLException e){
		 try {
			 con.rollback();
		 }catch(SQLException e2) {
			 e2.printStackTrace();
		 }		 
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
