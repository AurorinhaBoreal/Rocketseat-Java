package com.aurora.javarocketseat.user;

import org.hibernate.annotations.CreationTimestamp;

import java.util.UUID;
import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data // Configura automaticamente os Getters e Setters para todos os atributos da classe
// @Getter Configura automaticamente os Getter para todos os atributos da classe
// @Setter Configura automaticamente os Setter para todos os atributos da classe

// Criando uma tabela usuários através do H2
@Entity(name ="tb_users")
public class UserModel {
    
    @Id // Identificar como chave primária
    @GeneratedValue(generator = "UUID") // Gerar automaticamente
    private UUID id;

    private String username;
    private String name;
    private String password;

    // Setter - Quando precisamos buscar alguma informação que mudou dentro de um atributo, atualizar o atributo
    // Getter - Quando queremos puxar o valor de determinado atributo
    // Utilizando a lib Lombok, é possivel colocar um getter/setter em um único atributo, apenas posicione o componente logo acima do mesmo

    @CreationTimestamp // Marca o horário de criação de determinado dado
    private LocalDateTime createdAt;

    
}
