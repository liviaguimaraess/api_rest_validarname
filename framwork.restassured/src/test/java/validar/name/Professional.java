package validar.name;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Professional {

	
	Response response;
	
	@Test
	public void validarCampoName() {
	response = RestAssured.get("https://api.trello.com/1/actions/592f11060f95a3d3d46a987a/list");
	String nome = response.getBody().path("name","name do empregado");
	assertTrue(nome.contains("Professional"));
	

	}
	
}
