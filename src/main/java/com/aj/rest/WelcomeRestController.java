package com.aj.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.aj.feign.GreetFeignClient;

@RestController
public class WelcomeRestController {
	
	@Autowired
	private GreetFeignClient greetClient;
	
	
	@GetMapping("/welcome")
	public String getWelcomekMsg() {
//		
//		// by us RestTemplate we need to hardcode the url of the api i.e problem therefore fegn is erq
//		RestTemplate rt = new RestTemplate();
//		ResponseEntity<String> forEntity = rt.getForEntity("http://localhost:8081/", String.class);
//		
//		String greetResponse = forEntity.getBody();
//		return greetResponse + "Morning ";
		
		
		//by using FC
		//implementation will be provided in the runtime by Spring Cloud
		String greetResp = greetClient.invokeGreetApi();
		
		return greetResp +  "morning";
	}

}
