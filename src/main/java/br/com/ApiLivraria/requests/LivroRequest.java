package br.com.ApiLivraria.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LivroRequest {

    private String titulo;
    private String resumo;
    private int qtdpaginas;
    private String categoria;
    private String autor;


}
