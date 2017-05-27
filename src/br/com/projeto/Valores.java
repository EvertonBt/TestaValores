package br.com.projeto;

import java.util.ArrayList;
import java.util.List;

public class Valores implements ValoresITF{

	List<Integer> valores = new ArrayList<Integer>();
	
	@Override
	public boolean ins(int valor) {
		
		if(valor > 0  && valores.size() < 10){
			valores.add(valor);
			return true;
		}
		return false;
	}

	@Override
	public int del(int indice) {
	   
		
		
	if(valores.size() <= indice || valores.isEmpty()){
		
		return -1;
	}


	int valor = valores.get(indice);
	valores.remove(indice);
	return valor;
	
}
	@Override
	public int size() {
		int quantidade = valores.size();
	    return quantidade;
	}

	@Override
	public double mean() {

	if(valores.isEmpty()){
			
			return 0;
		}
	
	double media = 0;
    double soma = 0;
	
     for(int valor : valores){
    	 
    	  soma += valor;
     }
	
	 media = soma / valores.size();
	 return media;
	}

	@Override
	public int greater() {
		
		if(valores.isEmpty()){
			return -1;
		}
		
		int maior = valores.get(0); 
		for(int valor : valores){
		
			if(valor > maior){
				maior = valor;
			}
		}
		
		return maior;
	}

	@Override
	public int lower() {
	
		if(valores.isEmpty()){
			return -1;
		}
		
		int menor = valores.get(0); 
		for(int valor : valores){
		
			if(valor < menor){
				menor = valor;
			}
		}
		
		return menor;
		
	}

	
}
