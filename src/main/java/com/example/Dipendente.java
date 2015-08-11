package com.example;

public class Dipendente {
	private String nome;
	private String cognome;
	
	public Dipendente(String nome, String cognome) {		
		this.setNome(nome);
		this.setCognome(cognome);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public void fn(LDummy ld) {
		ld.elabora(this);
	}
	
	public String toString() {
		return this.getNome() + " " + this.getCognome();
	}
}