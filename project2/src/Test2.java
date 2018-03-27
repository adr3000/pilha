

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class Test2 {

	ArrayList al = new ArrayList();
	@Test
	void test() {
		al.inserir("a");
		al.inserir("b");
		al.inserir("c");
		
		assertEquals(3, al.tamanho());
	}

}
