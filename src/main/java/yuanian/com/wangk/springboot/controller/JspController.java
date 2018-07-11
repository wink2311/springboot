package yuanian.com.wangk.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspController {

	@RequestMapping("/jsphello")
	public String hello(Model model) {
		model.addAttribute(s:"now", arg1)
		return "jsphello";
	}
}
