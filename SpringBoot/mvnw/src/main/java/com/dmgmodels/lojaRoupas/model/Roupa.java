package com.dmgmodels.lojaRoupas.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "roupa")
@Entity(name = "Roupa")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Roupa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome_produto;
    private String marca;
    private double preco;
    @Enumerated(EnumType.STRING)
    private Tamanho tamanho;
    private int quantidade;

    public Roupa(DadosCadastroRoupa dados) {
        this.nome_produto = dados.nomeProduto();
        this.marca = dados.marca();
        this.preco = dados.preco();
        this.tamanho = dados.tamanho();
        this.quantidade = dados.quantidade();
    }
}
