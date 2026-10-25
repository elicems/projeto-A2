package com.example.estrutura_A2.arvore;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class No<T> {
    private T dado;
    private List<No<T>> filhos;

    public No(T dado){
        this.dado = dado;
        this.filhos = new ArrayList<>();
    }
    public void adicionar(No<T> filho){
        filhos.add(filho);
    }

}
