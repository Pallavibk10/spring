package com.project.springboot2.springbootcotroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class BootController {
	public BootController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@RequestMapping("textme")
	public String onClick() {
		System.out.println("Invoked textme");
		return "signin.jsp";
	}

	@RequestMapping("signin")
	public String WelcomeMessage(String from, String message, String to, Model model) {
		try {
			System.out.println("Invoked welcome page and redirecting to signout.jsp");

			model.addAttribute("from", from);
			model.addAttribute("message", message);
			model.addAttribute("to", to);
		} catch (Exception e) {
			System.err.println("Exception in welcome controller " + e);
		}
		return "signout.jsp";
	}
	
}







