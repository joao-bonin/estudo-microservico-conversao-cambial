package com.manolo.microservico.conversormoeda;

import java.math.BigDecimal;

public class ConversorMoedaBean {
	
	private Long id;
	private String de;
	private String para;
	private BigDecimal multiploConversor;
	private BigDecimal quantidade;
	private BigDecimal totalCalculado;
	private int porta;
	
	
	public ConversorMoedaBean() {
	}


	public ConversorMoedaBean(Long id, String de, String para, BigDecimal multiploConversor, BigDecimal quantidade,
			BigDecimal totalCalculado, int porta) {
		super();
		this.id = id;
		this.de = de;
		this.para = para;
		this.multiploConversor = multiploConversor;
		this.quantidade = quantidade;
		this.totalCalculado = totalCalculado;
		this.porta = porta;
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


	public BigDecimal getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}


	public BigDecimal getTotalCalculado() {
		return totalCalculado;
	}


	public void setTotalCalculado(BigDecimal totalCalculado) {
		this.totalCalculado = totalCalculado;
	}


	public int getPorta() {
		return porta;
	}


	public void setPorta(int porta) {
		this.porta = porta;
	}

	
}