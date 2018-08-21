package com.mancheng.corolla.controller;


@RestController
public class IndexController {

	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String hello() {
		return "hello world!";
	}
	public IndexController() {
		// TODO Auto-generated constructor stub
	}

}
