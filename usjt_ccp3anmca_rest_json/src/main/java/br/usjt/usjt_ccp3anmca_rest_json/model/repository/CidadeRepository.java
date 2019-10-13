package br.usjt.usjt_ccp3anmca_rest_json.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.usjt.usjt_ccp3anmca_rest_json.model.beans.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository <Cidade, Long>{

	
}
