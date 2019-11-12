package com.manolo.microservico.forex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ForexControlador {
	
	@Autowired
	private Environment ambiente;
	
	@Autowired
	private ConversorCambialRepositorio repositorio;
	
	@GetMapping("conversor-cambial/de/{de}/para/{para}")
	public Conversor fazConversaoMoeda(@PathVariable String de, @PathVariable String para) {
		
		Conversor findByDePara = repositorio.findByDeAndPara(de, para);
		
		findByDePara.setPorta(Integer.parseInt(ambiente.getProperty("local.server.port")));
		
		return findByDePara;
		
	}
}
