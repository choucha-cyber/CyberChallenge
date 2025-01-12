package com.cyber.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

//import javax.servlet.http.Cookie;
//import javax.servlet.http.HttpServletResponse;

@Controller
public class CookieController {
	@GetMapping("/")
	public ModelAndView index(HttpServletResponse response) {
		// Création d'un cookie avec le mot de passe caché
		Cookie passwordCookie = new Cookie("hiddenPassword", "CyberChallenge123");
		passwordCookie.setHttpOnly(false);
		passwordCookie.setMaxAge(3600); // 1 heure
		response.addCookie(passwordCookie);

		return new ModelAndView("index");
	}

	@GetMapping("/challenge")
	public ModelAndView challenge() {
		return new ModelAndView("challenge");
	}

	@GetMapping("/verify")
	public ModelAndView verify(@CookieValue(value = "hiddenPassword", defaultValue = "") String hiddenPassword) {
		ModelAndView modelAndView = new ModelAndView();

		if ("CyberChallenge123".equals(hiddenPassword)) {
			modelAndView.setViewName("success");
		} else {
			modelAndView.setViewName("challenge");
			modelAndView.addObject("error", "Mot de passe incorrect. Vérifiez les cookies !");
		}

		return modelAndView;
	}

}
