package com.manolo.microservico.forex;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Conversor {
	
	@Id
	private Long id;

	@Column(name="conversor_de")
	private String de;
	
	@Column(name="conversor_para")
	private String para;
	
	private BigDecimal multiploConversor;
	
	private int porta;
	
	public Conversor() {
		
	}
	
	public Conversor(Long id, String de, String para, BigDecimal mutiploConversor) {
		super();
		this.id = id;
		this.de = de;
		this.para = para;
		this.multiploConversor = mutiploConversor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDe() {
		return de;
	}

	public void setDe(String de) {
		this.de = de;
	}

	public String getPara() {
		return para;
	}

	public void setPara(String para) {
		this.para = para;
	}

	public BigDecimal getMultiploConversor() {
		return multiploConversor;
	}

	public void setMultiploConversor(BigDecimal multiploConversor) {
		this.multiploConversor = multiploConversor;
	}

	public int getPorta() {
		return porta;
	}

	public void setPorta(int porta) {
		this.porta = porta;
	}
}
