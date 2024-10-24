package edu.com.cjc.smsapp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {
	@RequestMapping("/")
	public String perLogin()
	{
		return "login";
		
	}
	
	@RequestMapping("/Log")
	public String Login(@RequestParam("uname")String uname, @RequestParam("password")String password)
	{
		return "AdminScreen";
		
	}
	

}
