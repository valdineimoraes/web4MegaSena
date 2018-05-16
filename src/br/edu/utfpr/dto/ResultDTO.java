package br.edu.utfpr.dto;

import java.util.List;

public class ResultDTO {
	private int acertos;
	private String frase;
	private List<Integer> apostaMega;
	private List<Integer> cartaoSorteado;
	
	public ResultDTO() {
		// TODO Auto-generated constructor stub
	}

	public ResultDTO(int acertos, String frase, List<Integer> apostaMega, List<Integer> cartaoSorteado) {
		super();
		this.acertos = acertos;
		this.frase = frase;
		this.apostaMega = apostaMega;
		this.cartaoSorteado = cartaoSorteado;
	}



	public int getAcertos() {
		return acertos;
	}

	public void setAcertos(int acertos) {
		this.acertos = acertos;
	}

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

	public List<Integer> getApostaMega() {
		return apostaMega;
	}

	public void setApostaMega(List<Integer> apostaMega) {
		this.apostaMega = apostaMega;
	}

	public List<Integer> getCartaoSorteado() {
		return cartaoSorteado;
	}

	public void setCartaoSorteado(List<Integer> cartaoSorteado) {
		this.cartaoSorteado = cartaoSorteado;
	}
	
	
	
	
}
