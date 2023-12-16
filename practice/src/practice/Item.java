package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Item {
	private String name;
	private Integer price;
	private Integer weight;
	
	public Item(String name) {
		getItemData(name);
	}
	public Item() {
	}
	
	
	public void getItemData(String name){
		 try {
			 Class.forName("org.h2.Driver");		
		 } catch(ClassNotFoundException e) {
			 throw new IllegalStateException("ドライバのロードに失敗しました");		
		 }
		 Connection con = null;
		 try {
			 //DB情報
			 con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","*","*");
			 PreparedStatement pstmt = con.prepareStatement("SELECT *FROM ITEMS WHERE NAME = ?");
			 pstmt.setString(1,name);
			 ResultSet rs = pstmt.executeQuery();
			 
			 if(rs.next()){
				 this.setName(rs.getString("NAME"));
				 this.setPrice(rs.getInt("PRICE"));
				 this.setWeight(rs.getInt("WEIGHT"));
			 }else {
				 System.out.print("データが存在しません");
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
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getPrice() {
		return price;
	}


	public void setPrice(Integer price) {
		this.price = price;
	}


	public Integer getWeight() {
		return weight;
	}


	public void setWeight(Integer weight) {
		this.weight = weight;
	}

}
