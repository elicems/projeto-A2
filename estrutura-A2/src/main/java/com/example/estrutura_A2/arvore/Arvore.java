package com.example.estrutura_A2.arvore;

import lombok.Getter;

@Getter
public class Arvore<T> {
    private No<T> raiz;

    public Arvore(T dado){
        raiz = new No<>(dado);
    }

    public void imprimir(){
        imprimirRecursivo(raiz,0);
    }
    private void imprimirRecursivo(No<T> no,int nivel){
        if(no == null){
            return;
        }
        System.out.println(" ".repeat(nivel) + no.getDado());
        for(No<T> filho: no.getFilhos()){
            imprimirRecursivo(filho,nivel+1);
        }
    }
}
