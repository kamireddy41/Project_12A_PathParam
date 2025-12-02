package com.telusko.QueryParam.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DemoController 
{
	//http://localhost:8080/info/Shola
	@GetMapping("/info/{name}")
	public String getSomeInfo(@PathVariable("name")String n,Map<String, Object> map)
	{
		System.out.println(n);
		map.put("name", "Hello "+ n + " I hope you're fine and this is Path param ex");
		return "index";
	}
	//http://localhost:8080/info/Naser/SpringBoot

	@GetMapping("/info2/{name}/{course}")
	public String getSomeInfo2(@PathVariable("name")String name,@PathVariable String course, Map<String, Object> map)
	{
		
		map.put("name", "Hello "+ name + " I hope you're enjoying "+course+ " every weekend");
		return "index";
	}

}
