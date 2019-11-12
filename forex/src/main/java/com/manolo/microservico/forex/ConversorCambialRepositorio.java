package com.manolo.microservico.forex;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConversorCambialRepositorio extends JpaRepository<Conversor, Long>{
	
	Conversor findByDeAndPara(String de, String para);

}
