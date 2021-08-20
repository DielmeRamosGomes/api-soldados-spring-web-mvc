package br.com.digitalinnovationone.example.restfull.request;

import lombok.Data;

@Data
public class SoldadoEditRequest {
    private String nome;
    private String raca;
    private String arma;
}
