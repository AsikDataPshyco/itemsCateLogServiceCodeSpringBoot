package com.example.demo;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;


@RepositoryRestResource

interface ItemRepository extends JpaRepository<Item, Long> {}

@Component
public class ItemInitializer implements CommandLineRunner  {
		
	@Autowired
	private final ItemRepository ItemRepository;

    public ItemRepository getItemRepository() {
		return ItemRepository;
	}
  

	ItemInitializer(ItemRepository itemRepository) {
        this.ItemRepository = itemRepository;
    }

    @Override  
    public void run(String... args) throws Exception {
        Stream.of("Lining", "PUMA", "Bad Boy", "Air Jordan", "Nike", "Adidas", "Reebok")
                .forEach(item -> ItemRepository.save(new Item(item)));

        ItemRepository.findAll().forEach(System.out::println);
    }
}
