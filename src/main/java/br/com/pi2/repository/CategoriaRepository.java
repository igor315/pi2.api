package br.com.pi2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pi2.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	//Categoria findOne(Long codigo);

}
