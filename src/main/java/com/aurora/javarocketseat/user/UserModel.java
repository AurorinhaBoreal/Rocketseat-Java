package com.aurora.javarocketseat.user;

import lombok.Data;

@Data // Configura automaticamente os Getters e Setters para todos os atributos da classe
// @Getter Configura automaticamente os Getter para todos os atributos da classe
// @Setter Configura automaticamente os Setter para todos os atributos da classe
public class UserModel {
    
    private String username;
    private String name;
    private String password;

    // Setter - Quando precisamos buscar alguma informação que mudou dentro de um atributo, atualizar o atributo
    // Getter - Quando queremos puxar o valor de determinado atributo
    // Utilizando a lib Lombok, é possivel colocar um getter/setter em um único atributo, apenas posicione o componente logo acima do mesmo
    

    
}
