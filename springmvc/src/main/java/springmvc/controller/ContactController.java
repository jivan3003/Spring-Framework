package springmvc.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/contact")
	public String showForm(Model model) {
		model.addAttribute("header", "Learn code with jivan");

		return "contact"; // write jsp file name here
	}
	
	@RequestMapping(path="/processform", method =RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model){
		System.out.println(user);
		if(user.getUserName().isBlank()) {
			return "redirect:/contact";
		}
		//process
		this.userService.createUser(user);
		System.out.println("User Created Successfully.........");
		return "success";
	}
	
	
	// flow of user create
	//user ----> create user ---->userService---->userDao---->hibernateTemplate----> user save
	
	
	
	// This is old method to get data
//	public String handleForm(HttpServletRequest request) {
//		String email = request.getParameter("email");
//		System.out.println("user email is " + email);
//		return "";
//	}
}



// by using @RequestMapping


/*
@RequestMapping(path="/processform", method =RequestMethod.POST)
public String handleForm(
		@RequestParam("email") String email,
		@RequestParam("userName") String userName, 
		@RequestParam("password") String password, Model model){
	System.out.println("user email is " + email);
	System.out.println("user userName is " + userName);
	System.out.println("user password is " + password);
	
	User user = new User();
	user.setEmail(email);
	user.setUserName(userName);
	user.setPassword(password);
	System.out.println(user);
	model.addAttribute("user",user);
	
	
	model.addAttribute("userName", userName);
	model.addAttribute("password", password);
	model.addAttribute("email", email);
	return "success";
}



 This is old method to get data
public String handleForm(HttpServletRequest request) {
	String email = request.getParameter("email");
	System.out.println("user email is " + email);
	return "";
}
}
*/