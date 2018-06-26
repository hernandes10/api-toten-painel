package com.toten_painel.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.toten_painel.api.model.Senha;
import com.toten_painel.api.repositories.SenhaRepository;
import com.toten_painel.api.response.Response;
import com.toten_painel.api.service.TotenService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@RestController
@RequestMapping("/api")
@Controller
public class ApiService {


	@Autowired
	private TotenService totenService;
	

	@ApiOperation(value = "Retorna a proxima senha a ser chamada", 
			notes = "Retorna o objeto Json Senha", 
			response = Senha.class, tags={ "Toten", })
	  @ApiResponses(value = { 
		        	@ApiResponse(code = 200, message = "Senha obtida com sucesso.", response = Senha.class),
		        	@ApiResponse(code = 404, message = "Nenhuma senha gerada no momento.", response = Void.class) 
		        })
	@GetMapping(value = "/proximaSenha")
	public  ResponseEntity<Response<Senha>> persistir() {
		Response<Senha> response = new Response<Senha>();
		Senha senha = totenService.findTop1ByOrderBySenhaDesc();
		//senha.setId(900L);
		//senha.setSenha("teste dos testes");
		
		response.setData(senha);
		List<String> s = new ArrayList<String>();
		s.add("Erro muito errado..");
		response.setErrors(s);
		return ResponseEntity.ok(response);
	}


}
