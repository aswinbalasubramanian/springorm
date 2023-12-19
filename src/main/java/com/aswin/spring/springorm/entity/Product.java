package com.aswin.spring.springorm.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@Column(name = "name")
	private String id;
	@Column(name = "description")
	private String desc;
	@Column(name = "name")
	private String name;
	@Column(name = "name")
	private double price;

	@Override
	public String toString() {
		return "Product [id=" + id + ", desc=" + desc + ", name=" + name + ", price=" + price + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
