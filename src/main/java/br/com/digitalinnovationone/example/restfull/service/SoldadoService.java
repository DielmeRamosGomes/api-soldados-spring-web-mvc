package br.com.digitalinnovationone.example.restfull.service;

import br.com.digitalinnovationone.example.restfull.dto.Soldado;
import br.com.digitalinnovationone.example.restfull.request.SoldadoEditRequest;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class SoldadoService {

    public Soldado buscarSoldado(String cpf) {
        Soldado soldado = new Soldado();
        soldado.setCpf(cpf);
        soldado.setNome("Legolas");
        soldado.setRaca("Elfo");
        soldado.setArma("Arco e Flecha");
        return soldado;
    }

    public void criarSoldado(Soldado soldado) {

    }

    public void alterarSoldado(String cpf, SoldadoEditRequest soldadoEditRequest) {

    }

    public void deletarSoldado(String cpf) {

    }

    public List<Soldado> buscarTodosOsSoldados() {
        Soldado soldado1 = new Soldado();
        soldado1.setCpf("12345");
        soldado1.setNome("Legolas");
        soldado1.setRaca("Elfo");
        soldado1.setArma("Arco e Flecha");

        Soldado soldado2 = new Soldado();
        soldado2.setCpf("123456789");
        soldado2.setNome("Dielme");
        soldado2.setRaca("Humano");
        soldado2.setArma("Metralhadora");

        return Arrays.asList(soldado1, soldado2);
    }
}
