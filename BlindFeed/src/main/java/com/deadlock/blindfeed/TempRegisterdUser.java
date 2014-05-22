package com.deadlock.blindfeed;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TempRegisterdUser {

	@RequestMapping(value="/Nuserindex")
	public String TrustIndex(){
		return "RegisterdUser/index";
	}
	
	@RequestMapping(value="/Nuserabout",method=RequestMethod.GET)
	public String name2(){
		return "RegisterdUser/about";
	}
	
	@RequestMapping(value="/Nusercontact",method=RequestMethod.GET)
	public String name3(){
		return "RegisterdUser/contact";
	}
	
	@RequestMapping(value="/Nuserhelp",method=RequestMethod.GET)
	public String name4(){
		return "RegisterdUser/help";
	}

	@RequestMapping(value="/Nusercontribute",method=RequestMethod.GET)
	public String name5(){
		return "RegisterdUser/contribute";
	}

}
