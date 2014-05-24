package com.deadlock.blindfeed;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TempTrustedUserController {
	
	@RequestMapping(value="/userindex")
	public String TrustIndex(){
		return "TrustedUser/index";
	}
	
	@RequestMapping(value="/uservalidate",method=RequestMethod.GET)
	public String name1(){
		return "TrustedUser/validate";
	}
	
	@RequestMapping(value="/userabout",method=RequestMethod.GET)
	public String name2(){
		return "TrustedUser/about";
	}
	
	@RequestMapping(value="/usercontact",method=RequestMethod.GET)
	public String name3(){
		return "TrustedUser/contact";
	}
	
	@RequestMapping(value="/userhelp",method=RequestMethod.GET)
	public String name4(){
		return "TrustedUser/help";
	}

	@RequestMapping(value="/usercontribute",method=RequestMethod.GET)
	public String name5(){
		return "TrustedUser/contribute";
	}
}
