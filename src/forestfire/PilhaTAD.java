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
public interface PilhaTAD {

    public abstract void Empilhar(Queimada elemento);
    
    public abstract Queimada Desempilhar();    
    
    public abstract void Esvaziar();
    
    public abstract void Imprimir();
}
