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
public class Item {

    public Item(String name) {
		super();		
		this.name = name;
	}

	@Id
    @GeneratedValue
    private Long id;

    private String name;
    
    protected Item(){}
}
