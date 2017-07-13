package com.spaneos.product.daoutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Daoutil {
		static{
			try{
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		public Connection getConnection(){
				Connection con=null;
				try {
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/irp3","root","spaneos");
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return con;
		}
		
		public void closeResource(ResultSet rs,Statement st,Connection con){
			try{
				if(rs!=null)
					rs.close();
				if(st!=null)
					st.close();
				if(con!=null)
					con.close();
			}catch(Exception e){
				System.out.println("While closing the resources"+e);
			}
				
		}
		public void closeResource(ResultSet rs,PreparedStatement st,Connection con){
			try{
				if(rs!=null)
					rs.close();
				if(st!=null)
					st.close();
				if(con!=null)
					con.close();
			}catch(Exception e){
				System.out.println("While closing the resources"+e);
			}
				
		}
		
		public void closeResource(PreparedStatement st,Connection con){
			try{
				if(st!=null)
					st.close();
				if(con!=null)
					con.close();
			}catch(Exception e){
				System.out.println("While closing the resources"+e);
			}
				
		}
}
