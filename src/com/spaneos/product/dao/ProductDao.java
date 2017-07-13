package com.spaneos.product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.spaneos.product.daoutil.Daoutil;
import com.spaneos.product.pojo.Product;

public class ProductDao implements ProductDaoInf {
	private Daoutil daoutil;
	
	private final String ADD_PRODUCT="INSERT INTO PRODUCT(PID,PNAME,DESCRIPTION,PRICE,INSTOCK) VALUES (?,?,?,?,?)";
	
	public ProductDao() {
			daoutil=new Daoutil();
	}
	@Override
	public String addProduct(Product product) {
		Connection con=null;
		PreparedStatement pst=null;
		String message=null;
		try{
			con=daoutil.getConnection();
			pst=con.prepareStatement(ADD_PRODUCT);
			pst.setInt(1, product.getPid());
			pst.setString(2, product.getPname());
			pst.setString(3, product.getDescription());
			pst.setDouble(4, product.getPrice());
			pst.setString(5, product.getInstock());
			int i=pst.executeUpdate();
			message=(i>0)?"Product is added successfully":"Sorry! product is not added";
				
		
		}catch(Exception e){
			System.out.println("While inserting product :"+e);
		}finally{
				daoutil.closeResource(pst, con);
		}
		
		return message;
	}

	@Override
	public Product getProduct(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteProduct(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

}
