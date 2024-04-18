package com.anilgupta001.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity(name = "User")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
public String name;
public String email;
@Column(length = 10)
public String mobile;
@OneToMany
public List<Transaction> list=new ArrayList<>();
@OneToMany
public  List<Cart> carts=new ArrayList<>();
@OneToMany
public List<Address> addresses=new ArrayList<>();
@OneToOne
public UserRole userRole;

}
