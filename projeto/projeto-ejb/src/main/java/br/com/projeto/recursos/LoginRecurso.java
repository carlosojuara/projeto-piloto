package br.com.projeto.recursos;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("login")
public class LoginRecurso {
	
	@GET
	public String testeRest() {
		return "teste Rest login";
	}

}
