package com.anilgupta001.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class ProductVariant {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
}
