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
public class Fila {

    private int posicaoAtual = 0;
    private int inicio = 0;
    private int fim = 0;
    private Object[] objeto = new Object[10];

    public void Enfileirar(Object obj) {
        if (inicio == 0 && fim == 0) {
            objeto[inicio] = obj;
            fim++;
        } else if (!cheia()) {
            objeto[fim] = obj;
            fim++;
        
        }
    }

    public void Desenfileirar() {
        if (!this.vazia()) {
            inicio++;
        } else {
            System.out.println("Erro!");
        }
    }

    public Object Frente() {
        return this.objeto[inicio];
    }

    public boolean vazia() {
        return inicio == fim && fim == 0;
    }

    public boolean cheia() {
        return this.fim == this.objeto.length;
    }

    public int Tamanho() {
        System.out.println(this.posicaoAtual);
        return this.posicaoAtual;
    }

}