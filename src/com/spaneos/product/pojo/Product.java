package com.spaneos.product.pojo;
/*
 * Product pojo class
 */
public class Product {
		
		private int pid;
		private String pname;
		private String description;
		private double price;
		private String instock;
		
		public int getPid() {
			return pid;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getInstock() {
			return instock;
		}
		public void setInstock(String instock) {
			this.instock = instock;
		}
		
}
