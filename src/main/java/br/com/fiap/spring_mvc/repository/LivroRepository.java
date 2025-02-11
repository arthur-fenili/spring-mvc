package br.com.fiap.spring_mvc.repository;

import br.com.fiap.spring_mvc.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
