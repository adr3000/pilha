package project3;

public class Pilha {

	private static final int TAMANHO_INICIAL = 3;
	private Object[] arrayInterno = new Object[TAMANHO_INICIAL];
	private int inseridos;
	

	public void push(Object objeto) {
		if (arrayInterno.length == inseridos) {
			Object[] arrayMaior = new Object[arrayInterno.length + TAMANHO_INICIAL];
			for (int i = 0; i < arrayInterno.length; i++) {
				arrayMaior[i] = arrayInterno[i];
			}

			arrayInterno = arrayMaior;
		}

		arrayInterno[inseridos] = objeto;
		inseridos++;
	}

	public Object pop() {
		Object topo= top();
		arrayInterno[inseridos-1]=null;
		inseridos--;
		return topo;
	
	}

	public Object top() {
		return arrayInterno[inseridos-1];
	}

	public int size() {
		return inseridos;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public void imprimir() {
		for (int i = 0 ; i <inseridos; i++);

	}

}