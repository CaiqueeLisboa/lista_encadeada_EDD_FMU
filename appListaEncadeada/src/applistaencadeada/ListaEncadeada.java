/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applistaencadeada;

/**
 *
 * @author 3147236
 */
public class ListaEncadeada {
    public Celula cabeca;
    
    public ListaEncadeada(){
        this.cabeca = null;
    }
    
    public void adiciona(int valor){
        Celula novo = new Celula(valor);
        if(this.cabeca == null){
            this.cabeca = novo;
        }else{
            Celula ultimo = cabeca;
            while(ultimo.getProximo() != null){
                ultimo = ultimo.getProximo();
            }
            ultimo.setProximo(novo);
        }
    }
    
    public void remove(int valor){
        if (this.cabeca != null && this.cabeca.getValor() == valor) {
            this.cabeca = this.cabeca.getProximo();
        } else {
            Celula anterior = null;
            Celula proximo = this.cabeca;
            while (proximo != null && proximo.getValor() != valor){
                anterior = proximo;
                proximo = proximo.getProximo();
            }
            if (proximo != null){
            anterior.setProximo(proximo.getProximo());
            }
        }
    }
    
    public void mostrar(){
        Celula novo = this.cabeca;
        while(novo != null){
            System.out.print(novo.getValor());
            System.out.print(" ");
            novo = novo.getProximo();
        }
        System.out.println();
    }
    
    public void verificaVazio(){
        if(this.cabeca == null){
            System.out.println("Está vázio");
        }else{
            System.out.println("Abaixo os valores da lista");
            this.mostrar();
        }        
    }
    
    public void adicionaInicio(int valor){
        Celula novo = new Celula(valor);
        if(this.cabeca == null){
            this.cabeca = novo;
        }else{
            novo.setProximo(this.cabeca);
            this.cabeca = novo;
        }
    }
}
