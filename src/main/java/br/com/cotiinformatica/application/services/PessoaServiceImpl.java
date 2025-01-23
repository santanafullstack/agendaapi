package br.com.cotiinformatica.application.services;

import org.springframework.stereotype.Service;
import br.com.cotiinformatica.application.dtos.AutenticarPessoaRequest;
import br.com.cotiinformatica.application.dtos.AutenticarPessoaResponse;
import br.com.cotiinformatica.application.dtos.CriarPessoaRequest;
import br.com.cotiinformatica.application.dtos.CriarPessoaResponse;
import br.com.cotiinformatica.application.ports.in.PessoaService;

@Service
public class PessoaServiceImpl implements PessoaService {
	@Override
	public CriarPessoaResponse criar(CriarPessoaRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AutenticarPessoaResponse autenticar(AutenticarPessoaRequest request) {
		// TODO Auto-generated method stub
		return null;
	}
}
