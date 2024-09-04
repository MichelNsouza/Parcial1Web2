package br.com.ApiLivraria.service;

import br.com.ApiLivraria.entities.Livro;
import br.com.ApiLivraria.exceptions.ResourceNotFoundException;
import br.com.ApiLivraria.repository.LivroRepository;
import br.com.ApiLivraria.requests.LivroRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;


    public List<Livro> getAll(){
        return livroRepository.findAll();
    }

    public  Livro getById(Long id) throws ResourceNotFoundException {
        Optional<Livro> optionalLivro =  livroRepository.findById(id);

        if (optionalLivro.isEmpty()){
            throw new ResourceNotFoundException("Infelizmente o livro que você procura não foi encontrado. :(");
        }

        return optionalLivro.get();

    }
   /* public Livro getByTitulo(String titulo) throws ResourceNotFoundException {
        return livroRepository.findByTituloContaining(titulo)
                .orElseThrow(() -> new ResourceNotFoundException("Livro não encontrado com o título: " + titulo));
    }*/


    public Livro insert(LivroRequest livroRequest) throws ResourceNotFoundException {
        Livro livro = new Livro();
        livro.setTitulo(livroRequest.getTitulo());
        livro.setResumo(livroRequest.getResumo());
        livro.setCategoria(livroRequest.getCategoria());
        livro.setAutor(livroRequest.getAutor());
        livro.setQtdpaginas(livroRequest.getQtdpaginas());

        return livroRepository.save(livro);
    }



}
