package org.mghilardi.model;

import javax.xml.bind.annotation.XmlElement;
// import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

// @XmlRootElement(name = "product") did not work. Instead I've to use @WebResult(name = "Product") on the method at IProductCatalog
@XmlType(propOrder = { "price", "sku", "name" })
public class Product {

	private String name;
	private String sku;
	private double price;

	public Product() {
		super();
	}

	public Product(String name, String sku, double price) {
		super();
		this.name = name;
		this.sku = sku;
		this.price = price;
	}

	@XmlElement(name = "ProductName", nillable = false)
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getSku() {
		return sku;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

}
