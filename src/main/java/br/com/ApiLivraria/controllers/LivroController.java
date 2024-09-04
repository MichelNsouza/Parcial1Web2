package br.com.ApiLivraria.controllers;

import br.com.ApiLivraria.entities.Livro;
import br.com.ApiLivraria.exceptions.ResourceNotFoundException;
import br.com.ApiLivraria.requests.LivroRequest;
import br.com.ApiLivraria.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/livros")
public class LivroController {

    @Autowired
    LivroService livroService;

    @GetMapping("/")
    public ResponseEntity<List<Livro>> getAll(){
        return ResponseEntity.ok(livroService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Livro> getByid(@PathVariable Long id) throws ResourceNotFoundException {

        return ResponseEntity.ok(livroService.getById(id));
    }

    /*@GetMapping("/{titulo}")
    public ResponseEntity<Livro> getbyTitulo(@PathVariable String titulo) throws ResourceNotFoundException {

        return ResponseEntity.ok(livroService.getbyTitulo(titulo));
    }*/

    @PostMapping("/cadastro")
    public ResponseEntity<Livro> insert(@RequestBody LivroRequest livroRequest) throws ResourceNotFoundException {
        Livro livro = livroService.insert(livroRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(livro);
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Map<String, String>> handleException (ResourceNotFoundException ex){
        Map<String, String> responseMessage = new HashMap<>();
        responseMessage.put("messege", ex.getMessage());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(responseMessage);
    }



}
