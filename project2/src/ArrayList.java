
public class ArrayList {
	public static final int TAMANHO_INICIAL = 3;
	private Object[] arrayInterno = new Object[TAMANHO_INICIAL];
	private int inseridos;
	
	public int tamanho() {
		return inseridos;
	}
	
	public void inserir(Object objeto) {
		if(arrayInterno.length == inseridos) {
			Object[] arrayMaior = new Object[arrayInterno.length + TAMANHO_INICIAL];
			for(int i = 0; i < arrayInterno.length; i++) {
				arrayMaior[i] = arrayInterno[i];
			}
			
			arrayInterno = arrayMaior;
		}
		
		arrayInterno[inseridos] = objeto;
		inseridos++;
	}
	
	public void removerPorValor(Object valor) {
		int posValorEncontrado = -1;
		
		for(int i = 0; i < arrayInterno.length; i++) {
			if(valor.equals(arrayInterno[i])) {
				posValorEncontrado = i;
				break;
			}
		}
		
		for(int i = posValorEncontrado; i < inseridos - 1; i++) {
			arrayInterno[i] = arrayInterno[i + 1];
		}

		inseridos--;
		arrayInterno[inseridos] = null;		
	}
	
	public void removerPorPosicao(int  valor) {
		arrayInterno[valor] = null;
		
		for(int i = valor; i < inseridos - 1; i++) {
			arrayInterno[i] = arrayInterno[i + 1];
		}
		
		inseridos--;
		arrayInterno[inseridos] = null;
	}
}
