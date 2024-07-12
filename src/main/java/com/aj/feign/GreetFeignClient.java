package com.aj.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="32-GREETAPI")
public interface GreetFeignClient {
	
	@GetMapping("/greet")
	public String invokeGreetApi();
}
