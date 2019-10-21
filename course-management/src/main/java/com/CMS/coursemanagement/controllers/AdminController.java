package com.CMS.coursemanagement.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/admin")
public class AdminController {

@RequestMapping(value="/",method=RequestMethod.GET)
 public String adminLogin() {
return "admin";

}
@RequestMapping(value="/adminLoginProcess",method = RequestMethod.GET)
public String  adminRegister(@RequestParam("username") String username,@RequestParam("password") String password) {

	if(username.equals("durga") && password.equals("1234"))
	{
return "adminhome";
	}else
	{
		return "admin";
	}
}


}

