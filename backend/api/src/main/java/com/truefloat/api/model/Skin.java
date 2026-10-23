package com.truefloat.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity // Avisa a base de dados que esta classe se vai transformar numa tabela
public class Skin {
    
    @Id // Define que este campo é a Chave Primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // O PostgreSQL vai gerar o número do ID automaticamente
    private Long id;
    
    private String arma;
    private String nomeSkin;
    private String condicao;
    private double floatValue;
    private double precoDolar;
}