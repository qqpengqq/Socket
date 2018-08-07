package com.peng.socket;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SocketController {
	
	@RequestMapping(value = "/socket" , method = RequestMethod.GET)
	public String socket(ModelMap model) {
		
		model.addAttribute("message", "start socket sccuess");
		
		new Server().start();  
		
		return "startsocket";
	}

}
