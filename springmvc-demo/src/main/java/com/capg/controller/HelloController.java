package com.capg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	/*@RequestMapping("/hello")
	public ModelAndView sayHello()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("welcome");
		return mv;
	}
	
	@RequestMapping("/getStudentData")
	public ModelAndView getStudentInfo()
	{
		ModelAndView mv = new ModelAndView();
		Student obj = new Student();
		obj.setStid(100);
		obj.setStname("Krishna");
		mv.addObject("capg", obj);
		mv.setViewName("retrieve");
		return mv;
	}*/
	
	//with the use of httpservletrequest
	/*@RequestMapping("/hello")
	public String display(HttpServletRequest request, Model m)
	{
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		
		if(pass.equals("admin"))
		{
			String msg = "Hello " + name;
			m.addAttribute("message", msg);
			return "viewpage";
		}
		else
		{
			String msg = "Sorry " + name + ". You entered an incorrect password";
			m.addAttribute("message", msg);
			return "errorpage";
		}
	}*/
	
	//with the use of requestParam annotation
	@RequestMapping
	public String display(@RequestParam("name") String name, @RequestParam("pass") String pass, Model m)
	{
		if(pass.equals("admin"))
		{
			String msg = "Hello " + name;
			m.addAttribute("message", msg);
			return "viewPage";
		}
		else
		{
			String msg = "Sorry " + name + ". You entered an incorrect password";
			m.addAttribute("message", msg);
			return "errorPage";
		}
	}
}
