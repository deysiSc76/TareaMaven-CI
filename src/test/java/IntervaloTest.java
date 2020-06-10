import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IntervaloTest {
	private Intervalo intervalo;
	private Intervalo intervaloNegativo;
	@BeforeEach
	void setUp() throws Exception {
		intervalo=new Intervalo(2, 6);
		
	}
	
	@Test
	void testMinMaxNegativos() {
		Assertions.assertThrows(Exception.class, ()->{
			intervaloNegativo=new Intervalo(-4, -6);
			});
	}
	@Test
	void testMinMayorMax() {
		Assertions.assertThrows(Exception.class, ()->{
			intervaloNegativo=new Intervalo(4, 2);
			});
	}
	@Test
	void testReduceMinNegative() throws Exception {
		Assertions.assertThrows(Exception.class, ()->{
		intervalo.reduce(-1, (a,b)->a+b);
		});
	}
	@Test
	void testSumatoria() throws Exception {
		Assertions.assertNotNull(intervalo.sumatoria());
		Assertions.assertEquals(14, intervalo.sumatoria());
		
		
	}
	@Test
	void testProducto() throws Exception {
		Assertions.assertEquals(120, intervalo.producto());
	}
	
	
	

}
