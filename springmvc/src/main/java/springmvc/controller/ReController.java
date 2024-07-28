package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller 
public class ReController {
	
	// by using Redirect Prefix
	@RequestMapping("/one")
	public String one() { 
		System.out.println("this is one handler");
		return "redirect:contact";
	}
	
	// by using Redirect View
	@RequestMapping("/two")
	public RedirectView two() {
		System.out.println("This is second handler");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("https://www.google.com");
		return redirectView;
	}

}
