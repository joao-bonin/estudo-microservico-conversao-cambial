package com.manolo.microservico.conversormoeda;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="forex-servico")
@RibbonClient(name="forex-servico")
public interface ConversorMoedaServiceProxy {
	
	@GetMapping("/conversor-cambial/de/{de}/para/{para}")
	public ConversorMoedaBean consultaValorCambial(@PathVariable String de, @PathVariable String para);
}
