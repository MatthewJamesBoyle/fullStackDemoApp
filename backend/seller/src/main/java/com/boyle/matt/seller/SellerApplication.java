package com.boyle.matt.seller;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.boyle.matt.seller.dao.SellerDao;
import com.boyle.matt.seller.domain.Seller;

@SpringBootApplication
@EnableDiscoveryClient
public class SellerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SellerApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(SellerDao sellerDao) {
		return args -> {
			sellerDao.save(new Seller(1L, "mrBean", "01/01/1986", "Single",
					"https://www.comedy.co.uk/images/library/comedies/900x450/m/mr_bean.jpg"));
			sellerDao.save(new Seller(2L, "Matt Boyle", "01/01/1986", "Single",
					"https://pbs.twimg.com/profile_images/640760380034293760/3NlnmX7U.jpg"));
			sellerDao.save(new Seller(1L, "Josh Falter", "01/01/1986", "Single",
					"http://www.etdconsultingllc.com/images/bigstockphoto/bigstock_Portrait_Of_A_Happy_Guy_Relaxi_6639408.jpgg"));

		};
	}
}
