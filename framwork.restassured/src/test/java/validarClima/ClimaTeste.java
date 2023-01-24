package validarClima;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ClimaTeste {

	Response response = RestAssured.get("https://api.hgbrasil.com/weather/");
	
	@Test
	public void validarMaxHoje() {
		String max = response.getBody().path("max", "max de hoje");
		System.out.println(max);
	}
}
