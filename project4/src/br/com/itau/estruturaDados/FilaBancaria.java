package br.com.itau.estruturaDados;

public class FilaBancaria {

	private MinhaFila filaNaoPreferencial = new MinhaFila();
	private MinhaFila filaPreferencial = new MinhaFila();
	private int valor=1;
	public void enqueue(Object objeto, boolean ehPreferencial) {
	
		if(ehPreferencial) {
			filaPreferencial.enqueue(objeto);
		} else {
			filaNaoPreferencial.enqueue(objeto);
		}
	}
	
	public Object dequeue() {
		if (valor %3==0) {
			filaPreferencial.dequeue();
		} else {
			filaNaoPreferencial.dequeue();
		}
			
		valor++;
		return null;
	}
	
	public boolean isEmpty() {
		return filaNaoPreferencial.isEmpty() && filaPreferencial.isEmpty();
	}
	
	public int tamanho() {
		return filaNaoPreferencial.tamanho() + filaPreferencial.tamanho();
	}	
	
	
}
