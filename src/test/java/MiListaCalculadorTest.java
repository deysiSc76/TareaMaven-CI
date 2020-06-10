import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MiListaCalculadorTest {
	private List<Integer>lista= new ArrayList<>();
	private MiListaCalculador miLista;
	@BeforeEach
	void setUp() throws Exception {
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		miLista=new MiListaCalculador(lista);
	}

	@Test
	void testSumarTodo() {
		Assertions.assertEquals(15, miLista.sumarTodo());
	}
	@Test
	void testnumMayor() {
		Assertions.assertEquals(3, miLista.numMayor());
	}
	@Test
	void testnumMenor() {
		Assertions.assertEquals(5, miLista.numMenor());
	}
	

}
