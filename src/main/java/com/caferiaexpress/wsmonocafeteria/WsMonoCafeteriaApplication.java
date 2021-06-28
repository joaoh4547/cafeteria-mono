package com.caferiaexpress.wsmonocafeteria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.caferiaexpress.wsmonocafeteria.repositories.ProductRepository;

@SpringBootApplication
public class WsMonoCafeteriaApplication implements CommandLineRunner{
	
	@Autowired
	private ProductRepository productRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(WsMonoCafeteriaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Product p1 = new Product(null,"Café Expresso","Café Expresso Feito na hora",5.50,"https://cafeteria-images.s3.amazonaws.com/caf%C3%A9-expresso.png");
//		Product p2 = new Product(null,"Cappuccino","Cappucino de chocolate",12.50,"https://cafeteria-images.s3.amazonaws.com/cappuccino.jpg");
//		Product p3 = new Product(null,"Café Duplo","Café Expresso em dobro",11.00,"https://cafeteria-images.s3.amazonaws.com/cafe-duplo.jpg");
//		Product p4 = new Product(null,"Café Latte","Café com leite",10.50,"https://cafeteria-images.s3.amazonaws.com/cafe-latte.jpg");
//		Product p5 = new Product(null,"Café Comum","Café comum",10.50,"https://cafeteria-images.s3.amazonaws.com/cafe-comum.jpg");
//		productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));
	}

}
