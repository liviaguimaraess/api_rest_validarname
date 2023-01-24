package validar.name;

import org.junit.Test;

import metodos.Metodos;

public class ValidarFuncionario {
	
	Metodos metodos = new Metodos();
	
@Test
public void validarStatusCode() {
metodos.validarStatusCode(200);
}

@Test
public void validarName() {
	metodos.validarName("Professional");
}
}