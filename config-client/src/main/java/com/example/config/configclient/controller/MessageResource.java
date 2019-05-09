package com.example.config.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RequestMapping("/rest")
@RestController
public class MessageResource {
	
	@Value("${cfc: Default cfcdefaulturl}")
	private String cfc;
	
	/*
	 * @Value("${spring.profiles.cfc: Default1 cfcdefaulturl}") private String cfc1;
	 */
	
	/*
	 * @Value("${spring.cfc: Default2 cfcdefaulturl}") private String cfc2;
	 */	
	@GetMapping("/message")
	public String message() {
		return cfc;
	}

}
