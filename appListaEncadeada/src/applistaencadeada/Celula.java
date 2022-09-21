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
public class Celula {
    private int valor;
    private Celula proximo;
    
    public Celula(){}
    
    public Celula(int valor){
        this.valor = valor;
        this.proximo = null;
    }
    
    public int getValor(){
        return this.valor;
    }
    
    public void setValor(int valor){
        this.valor = valor;
    }
    
    public Celula getProximo(){
        return this.proximo;
    }
    
    public void setProximo (Celula proximo){
        this.proximo = proximo;
    }
}
