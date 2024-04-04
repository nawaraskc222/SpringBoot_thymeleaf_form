package com.SpringBoot_thymeleaf_6.SpringBoot_thymeleaf_6;

import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
	
	
	@GetMapping("/")
	public String index(Model m) {
		
		
		Employe employee = new Employe();
        m.addAttribute("employee", employee);
		return "index";
	}
	
	
	   @PostMapping("/saveEmployee")
	    public String saveEmployee(@ModelAttribute("employee") Employe employee) {
	      
		   String name=employee.getName();
		   int id=employee.getId();		   
		   System.out.println("Running");   
		   
		   System.out.println("The name is"+name);		   
		   System.out.println("The id is"+id);
	        return "successful";
	    }

}
