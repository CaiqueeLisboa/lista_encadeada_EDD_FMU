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
public class AppListaEncadeada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ListaEncadeada lista = new ListaEncadeada();
       
       lista.adiciona(1);
       lista.adiciona(2);
       lista.adiciona(3);
       
       ListaEncadeada lista2 = new ListaEncadeada();
       
       lista2.verificaVazio();
       lista.verificaVazio();
       
       lista2.adicionaInicio(5);
       lista2.mostrar();
       lista2.adicionaInicio(10);
       lista2.mostrar();
       //lista.remove(2);
       
       //lista.mostrar();
    }
    
}
