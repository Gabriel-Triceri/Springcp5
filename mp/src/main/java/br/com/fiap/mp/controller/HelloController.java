//Rm 97121 Gabriel Tricerri
package br.com.fiap.mp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String hello(Model model) {
		model.addAttribute("nome", "Berisvaldo");
		return "hello";
	}
	
}
