package yuanian.com.wangk.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import yuanian.com.wangk.springboot.bean.StudentProperties;

@RestController
public class TestController {
	
	@Value("${name}")
	private String name;
	
	@Value("${content}")
	private String content;
	
	@Autowired
	private StudentProperties studentProperties;
	
	@GetMapping("/helloworld")
	public String helloworld() {
		return "helloworld";
	}
	@GetMapping("/helloworld22")
	public String helloworld22() {
		return "helloworld22";
	}
	@GetMapping("/name")
	public String name() {
		return "name: "+ name;
	}
	@GetMapping("/yml_test")
	public String yml_test() {
		return content;
	}
	@GetMapping("/student")
	public String student() {
		return "name: " + studentProperties.getName() + "  age: " + studentProperties.getAge();
	}
	
	
}
