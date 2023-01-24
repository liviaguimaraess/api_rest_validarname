package metodos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Metodos {

	Response response = RestAssured.get("https://api.trello.com/1/actions/592f11060f95a3d3d46a987a/list");

	public void validarStatusCode(int statusCode) {
		assertEquals(statusCode, response.getStatusCode());

	}
	
	public void validarName(String nomeDesejado) {
		String name = response.getBody().path("name", "etc");
		assertTrue(name.contains(nomeDesejado));
	}
}
