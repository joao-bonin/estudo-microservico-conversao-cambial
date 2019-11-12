package com.manolo.microservico.conversormoeda;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversorMoedaController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private ConversorMoedaServiceProxy proxy;

	@GetMapping("/converte-moeda/de/{de}/para/{para}/quantidade/{quantidade}")
	public ConversorMoedaBean converteMoeda(@PathVariable String de, @PathVariable String para,
			@PathVariable BigDecimal quantidade) {
		
		ConversorMoedaBean resposta = proxy.consultaValorCambial(de, para);

		logger.info("{}", resposta);

		return new ConversorMoedaBean(resposta.getId(), de, para, resposta.getMultiploConversor(), quantidade,
				quantidade.multiply(resposta.getMultiploConversor()), resposta.getPorta());
	}

}
