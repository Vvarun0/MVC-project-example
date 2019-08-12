package com.project.foodcart;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;





public class Foodcartdbutil {
	
	public static List<Food> getFoodlist() throws ClassNotFoundException, SQLException{
		
		String url="jdbc:mysql://localhost:3306/food?useSSL=false";
		String username="root";
		String password="varun";
		
		
		
		ArrayList<Food> food=new ArrayList<>();
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,username,password);
		
	Statement st = con.createStatement();
		
		ResultSet rs =st.executeQuery("select * from foodcart");
		while(rs.next()) {
			int id=rs.getInt(3);
			String item=rs.getString(1);
			String price=rs.getString(2);
			Food f=new Food(id,item,price);
			food.add(f);
		}
		return food;
	}

}
