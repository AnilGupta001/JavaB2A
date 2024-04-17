package com.anilgupta001.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
	public List<Product> list=new ArrayList<>();
	public float  ItemValue;
	public int cartitem=list.size();
	
	
}
