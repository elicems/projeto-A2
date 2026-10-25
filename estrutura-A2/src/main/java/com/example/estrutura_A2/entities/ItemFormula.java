package com.example.estrutura_A2.entities;

import com.example.estrutura_A2.arvore.No;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemFormula {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private ItemFormula pai;
    private Integer qtd;
    private Double preco;
    private List<No<ItemFormula>> filhos = new ArrayList<>();

}
