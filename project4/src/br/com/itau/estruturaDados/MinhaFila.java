package br.com.itau.estruturaDados;

public class MinhaFila {

	private static final int ALOCACAO = 3;
	
	private Object[] arrayInterno = new Object[ALOCACAO];

	private int inseridos;
	
	public void enqueue(Object objeto) {
		if(arrayInterno.length == inseridos) {
			Object[] arrayMaior = new Object[arrayInterno.length + ALOCACAO];
			for(int i = 0; i < arrayInterno.length; i++) {
				arrayMaior[i] = arrayInterno[i];
			}
			
			arrayInterno = arrayMaior;
		}
		
		arrayInterno[inseridos] = objeto;
		inseridos++;
					
		}
	
	
	public Object dequeue() {
		 Object valor = arrayInterno[0];
		
		for(int i = 0; i < inseridos - 2; i++) {
			arrayInterno[i] = arrayInterno[i + 1];
		}
		
		inseridos--;
		return valor;
	}
	
	
	public boolean isEmpty() {
		return inseridos == 0;
	}
	
	public int tamanho() {
		return inseridos;
	}
}