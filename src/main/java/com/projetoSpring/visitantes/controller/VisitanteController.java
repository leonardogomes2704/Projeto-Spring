package com.projetoSpring.visitantes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VisitanteController {

	@GetMapping("/visitantes")
	public String listar() {
		return "ListaVisitantes";
	}
	

}
