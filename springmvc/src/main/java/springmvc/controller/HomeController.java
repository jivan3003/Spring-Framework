package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {
//	BY using model object
	@RequestMapping(path="/home",method = RequestMethod.GET) 
	public String home(Model model) {
		System.out.println("this is home url");
		model.addAttribute("name","jivan kharat"); // add attribute method to set data
		model.addAttribute("prn",2021000733);
		
		List<String> fri = new ArrayList<String>();
		fri.add("harshal");
		fri.add("Samar");
		fri.add("vishal");
		fri.add("prasad");
		fri.add("Renuka");
		model.addAttribute("friend", fri);
		return "index"; // write  jsp file name here
	}
	
	@RequestMapping("/about") // write name which you have to use in url
	public String about() {
		System.out.println("this is about url");
		return "about"; // write  jsp file name here
	}
	
	
	// By using ModelAndView Object
	@RequestMapping("/help") // write name which you have to use in url
	public ModelAndView help() {
		System.out.println("this is help url");
		// Creating Model And View Object
		ModelAndView modelAndView = new ModelAndView();
		// Setting the data
		modelAndView.addObject("name", "Mota bhai");
		modelAndView.addObject("business", "chole bhature");
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time",now);
		
		//marks list
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(22);
		marks.add(33);
		marks.add(44);
		marks.add(55);
		modelAndView.addObject("marks", marks);
		
		
		// Setting the view name
		modelAndView.setViewName("help"); 
		return modelAndView; 
	}

}
