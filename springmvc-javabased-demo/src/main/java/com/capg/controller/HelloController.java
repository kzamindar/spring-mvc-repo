package com.capg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.capg.model.Employee;

@Controller
public class HelloController {
	@RequestMapping("/greet")
	public ModelAndView showView()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("retrieve");
		
		Employee emp = new Employee();
		emp.setEmpid(100);
		emp.setFirstName("Krishna");
		emp.setLastName("Yadav");
		
		mv.addObject("res", emp);
		return mv;
	}
}
