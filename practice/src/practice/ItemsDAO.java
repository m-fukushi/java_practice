package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ItemsDAO{		
	public static ArrayList<Item> findByMinimumPrice(Integer i){
		ArrayList<Item> list =  new ArrayList<Item>();
		
		try {
			 Class.forName("org.h2.Driver");		
		 } catch(ClassNotFoundException e) {
			 throw new IllegalStateException("ドライバのロードに失敗しました");		
		 }
		 Connection con = null;
		 try {
			 //DB情報
			 con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","*","*");
			 PreparedStatement pstmt = con.prepareStatement("SELECT *FROM ITEMS WHERE PRICE >=?");
			 pstmt.setInt(1,i);
			 
			 ResultSet rs = pstmt.executeQuery();
			 
			 while(rs.next()){
				 Item item = new Item();
				 item.setName(rs.getString("NAME"));
				 item.setPrice(rs.getInt("PRICE"));
				 item.setWeight(rs.getInt("WEIGHT"));
				 list.add(item);
			 }

		} catch(SQLException e){
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
	


		return list;
		
		
	}

}
