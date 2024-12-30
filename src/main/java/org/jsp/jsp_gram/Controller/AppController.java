package org.jsp.jsp_gram.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	@GetMapping({"/","/login"})
	public String loadLogin() {
		return "login.html";
	}

	@GetMapping("/register")
	public String loadRegister() {
		return "register.html";
	}
}
