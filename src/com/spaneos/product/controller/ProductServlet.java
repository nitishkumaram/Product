package com.spaneos.product.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.spaneos.product.pojo.Product;
import com.spaneos.product.service.ProductService;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("*.do")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ProductService productService;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
       productService=new ProductService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
					String uri=request.getRequestURI();
					
					if(uri.endsWith("viewProducts.do")){
							System.out.println("Soon ! i will give you product list");
					
					}else if(uri.endsWith("deleteProduct.do")){
						
					}else if(uri.endsWith("updateProduct.do")){
						
					}else if(uri.endsWith("addProduct.do")){
							
							int pid=Integer.parseInt(request.getParameter("pid"));
							String pname=request.getParameter("pname");
							String description=request.getParameter("description");
							double price=Double.parseDouble(request.getParameter("price"));
							String instock=request.getParameter("instock");
							Product product=productService.setAndGetProduct(pid,pname,description,price,instock);
							String message=productService.addProduct(product);
							request.setAttribute("message", message);
							response.sendRedirect("viewMessage?message="+message);
							return;
							
					}else if(uri.endsWith("getProduct.do")){
						
					}else{
						throw new IllegalArgumentException("Sorry ! invalid uri");
					}
	}

}
