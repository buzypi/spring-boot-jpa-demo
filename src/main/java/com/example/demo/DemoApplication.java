package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.entities.Experience;
import com.example.demo.entities.Profile;
import com.example.demo.entities.Website;
import com.example.demo.repositories.ProfileRepository;
import com.example.demo.repositories.WebsiteRepository;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		ProfileRepository repository = context.getBean(ProfileRepository.class);
		WebsiteRepository wRepository = context.getBean(WebsiteRepository.class);
		Profile p = new Profile();
		p.setName("John Doe");
		Experience e1 = new Experience();
		e1.setDesignation("Software Engineer");
		e1.setCompany("Google");
		p.addExperience(e1);
		Experience e2 = new Experience();
		e2.setDesignation("Senior Software Engineer");
		e2.setCompany("Facebook");
		p.addExperience(e2);
		Website w1 = new Website();
		w1.setUrl("https://johndoe.example.com/");
		wRepository.save(w1);
		Website w2 = new Website();
		w2.setUrl("https://johndoe.example.org/");
		wRepository.save(w2);
		p.addWebsite(w1);
		p.addWebsite(w2);
		repository.save(p);
	}

}