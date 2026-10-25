package com.example.estrutura_A2.services;

import com.example.estrutura_A2.arvore.No;
import com.example.estrutura_A2.entities.ItemFormula;
import com.example.estrutura_A2.repositories.ItemFormulaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ItemFormulaService {
    public final ItemFormulaRepository repo;

    public ItemFormulaService(ItemFormulaRepository repo){
        this.repo = repo;
    }

    public List<ItemFormula> mostrarTodos(){
        return repo.findAll();
    }

    public ItemFormula mostrarPorId(Long id){
        Optional<ItemFormula> obj = repo.findById(id);
        return obj.get();
    }
    public ItemFormula criarNovoItem(ItemFormula novoItem){
        return repo.save(novoItem);
    }
    public ItemFormula atualizar(Long id,ItemFormula item){
        ItemFormula i =repo.getReferenceById(id);
        atualizarDados(i,item);
        return repo.save(i);

    }

    public List<No<ItemFormula>> explodir(Long id){
        ItemFormula raiz = mostrarPorId(id);
        List<No<ItemFormula>> lista = new ArrayList<>();
        if(!raiz.getFilhos().isEmpty()){
            for(No<ItemFormula> filhos : raiz.getFilhos()){
               lista.add(filhos);
            }
            return lista;
        }else {
            return null;
        }
    }

    private void atualizarDados(ItemFormula itemFormula, ItemFormula novoItemFormula){
        itemFormula.setPreco(novoItemFormula.getPreco());
    }
}
