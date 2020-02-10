package br.com.cielo.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.cielo.api.entity.MovimentacaoEntity;
import br.com.cielo.api.exception.MovimentacaoException;
import br.com.cielo.api.model.MovimentacaoModel;

@Controller
public class MovimentacaoController {
	
	@GetMapping("/movimentacao")
	@ResponseBody
	public MovimentacaoEntity obterMovimentacao() {
	    MovimentacaoModel movimentacao = new MovimentacaoModel();
	    MovimentacaoEntity result = movimentacao.obterDados();
	    if (result != null) {
	      return movimentacao.obterDados();
	    } else {
	    	throw new MovimentacaoException("Nenhuma movimentacção encontrada");
	    }
	  }
}