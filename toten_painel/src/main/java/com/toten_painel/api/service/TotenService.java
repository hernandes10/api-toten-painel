package com.toten_painel.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toten_painel.api.model.Senha;
import com.toten_painel.api.repositories.SenhaRepository;

@Service
public class TotenService {

	
	@Autowired
	private SenhaRepository SenhaRepository;
	
	
	public Senha findTop1ByOrderBySenhaDesc() {
		return this.SenhaRepository.findTop2ByOrderBySenhaDesc();
	}
}
