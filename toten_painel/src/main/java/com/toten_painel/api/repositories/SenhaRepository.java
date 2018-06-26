package com.toten_painel.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.toten_painel.api.model.Senha;

@Repository
public interface SenhaRepository extends JpaRepository<Senha, Long>{

	@Transactional(readOnly = true)
	Senha findTop2ByOrderBySenhaDesc();
}
