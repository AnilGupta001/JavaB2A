package com.anilgupta001.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
	public String name;
	
	public String email;
	@Column(length = 10)
	public String mobile;
	public List<Transaction> list=new ArrayList<>();
	public  List<Cart> carts=new ArrayList<>();
	public List<Product> products=new ArrayList<>();
	public List<ProductCategory> productCategories=new ArrayList<>();
	public List<Address> addresses=new ArrayList<>();
	public UserRole userRole;
}
