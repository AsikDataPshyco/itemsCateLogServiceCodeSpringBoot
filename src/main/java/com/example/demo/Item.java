package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.context.annotation.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
class Item {

    public Item(String name) {
		//super();		
		this.name = name;
	}

	@Id
    @GeneratedValue
    public Long id;

    public String name;
    
    public Item(){}
}
