/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forestfire;

/**
 *
 * @author Angela
 */
public class Bloco {
    Queimada valor;
    Bloco prox;
    
    public Bloco(Queimada valorInicial){
        this.valor = valorInicial;
        this.prox = null;
    }
}
