package edu.ifmt.cobrancaifmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.ifmt.cobrancaifmt.model.Titulo;

@Repository
public interface Titulos extends JpaRepository<Titulo, Long>{

}
