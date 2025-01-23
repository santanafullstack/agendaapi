package br.com.cotiinformatica.infrastructure.controllers;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.cotiinformatica.application.dtos.CriarPessoaRequest;
import br.com.cotiinformatica.application.dtos.CriarPessoaResponse;
@RestController
@RequestMapping("/api/v1/pessoas")
public class PessoaController {
	@PostMapping("cadastrar")
	public ResponseEntity<CriarPessoaResponse> cadastrar(@RequestBody CriarPessoaRequest request) {
		// TODO
		return null;
	}
}



