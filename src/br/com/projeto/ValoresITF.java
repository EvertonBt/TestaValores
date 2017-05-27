package br.com.projeto;

public interface ValoresITF {

	
	boolean ins(int v); // insere valor
	int del(int i); // remove e retorna valor pelo indice
	int size (); // retorna media de valores armazenados;
	double mean(); //retorna media de valores armazenados;
	int greater(); // retorna maior  valor armazenado
	int lower(); // retorna o menor valor armazenado
}
