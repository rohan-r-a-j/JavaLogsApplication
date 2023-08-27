package com.log.logs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.log.logs.service.LogGenerator;

@RestController
@CrossOrigin()
public class LogController {
	@Autowired
	LogGenerator logGenerator;
	
//	String arr []= new String[3];

	@SuppressWarnings("static-access")
	@GetMapping (value = "/logs")
	public Boolean getLogs(@RequestParam("action") String userAction,@RequestParam("iteration") String iterationsStr,@RequestParam("product") String product) {
		String arr []= new String[3];
		arr[0] = userAction;
		arr[1] = iterationsStr;
		arr[2] = product;
		logGenerator.main(arr);
		return true;
	}
}
