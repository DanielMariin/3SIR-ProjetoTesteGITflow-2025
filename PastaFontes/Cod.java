import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Cod {
	
	CodigoPessoaFisica codigo = new CodigoPessoaFisica();
	
	@Test
	void testValido() {
		
		boolean retorno = codigo.validaCPF("674.772.484-42");
		assertTrue(retorno);
	
	}
	
	@Test
	void testNaoValido() {
		
		boolean retorno = codigo.validaCPF("111.444.27-15");
		assertFalse(retorno);
	
	}
	
		
}
