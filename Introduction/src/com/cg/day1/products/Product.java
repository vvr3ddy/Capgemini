package com.cg.day1.products;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQuery;

@Entity
@Table(name = "Products2021")
@NamedQuery(name = "Product.abcd", query = "select p1 from Product p1 where p1.pId>:id")
public class Product {

	@Id
	private int pId;

	private String pName;

	private String pCat;

	private float pPrice;

	public Product() {
		super();
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpCat() {
		return pCat;
	}

	public void setpCat(String pCat) {
		this.pCat = pCat;
	}

	public float getpPrice() {
		return pPrice;
	}

	public void setpPrice(float pPrice) {
		this.pPrice = pPrice;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pCat=" + pCat + ", pPrice=" + pPrice + "]";
	}

}
