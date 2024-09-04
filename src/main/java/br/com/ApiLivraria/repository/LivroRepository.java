package br.com.ApiLivraria.repository;

import br.com.ApiLivraria.entities.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
