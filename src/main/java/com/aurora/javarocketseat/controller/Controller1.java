package com.aurora.javarocketseat.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Uma Controller no Spring é um componente que fica entre a requisição do usuário e as outras camadas.
// É designada para ser a primeira camada de acesso entre a requisição e as outras camadas
// É possivel criar uma controller de dois jeitos:

// @Controller
// É utilizado caso seja necessário o retorno de páginas e templates inteiros, permite uma maior flexibilidade

@RestController
// Tem haver com o conceito de Restful, facilita na criação de API's
@RequestMapping("/routeOne")
// Criação da rota de acesso

public class Controller1 {
    
    /** Métodos de Acesso HTTP
     * GET - Buscar uma informação/dado
     * POST - Adicionar uma informação/dado
     * PUT - Alterar mais de informação/dado
     * DELETE - Remover uma informação/dado
     * PATCH - Alterar uma parte da informação/dado
     */



     @GetMapping("/C1")
    // Método - Funcionalidade de uma classe
    public String Classe1() {
        return "<center> <h1> Ta Rodando!! 🔁 </h1> </center>";
    }
}
