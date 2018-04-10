/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed1_fila;

/**
 *
 * @author marcos
 */

public class FilaCircular {
    private int posicaoAtual=0;
    private int inicio =0;
    private int fim=0;
    private Object[] objeto = new Object[5];
    
    public void Enfileirar(Object obj){
        if(inicio == 0 && fim == 0){
            objeto[inicio]=obj;
            fim++;
        }else
        if(!cheia()){
            if(fim==objeto.length){
                fim=0;
                objeto[fim]=obj;
            }else{
                objeto[fim]=obj;
                fim++;
            }
        }
    }
    
    public void Desenfileirar(){
        if(!this.vazia()){
            if(inicio==objeto.length){
                inicio=0;
            }else
                inicio++;
        }else
            System.out.println("Erro!");
    }
    
    public boolean cheia(){
        return this.fim==this.objeto.length && inicio==0;
    }
    
    public boolean vazia(){
        return inicio==fim&&fim==0;
    }
    
    public Object Frente(){
        return this.objeto[inicio];
    }
    
}