/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forestfire;

/**
 *
 * @author aluno
 */
public class Pilha implements PilhaTAD{
    public Bloco topo;
    private int quantidade;
    
    public Pilha(){
        topo = null;
        quantidade = 0;
    }
    
    @Override
    public void Empilhar(Queimada elemento){
        Bloco novo;
        novo = new Bloco(elemento);
        novo.prox = topo;
        topo = novo;
        quantidade++;
    }
    
    @Override
    public Queimada Desempilhar(){
        Queimada valorDesempilhado = null;
        try {
            if(quantidade != 0){
                Bloco aux = topo;
                topo = topo.prox;
                valorDesempilhado = aux.valor;
                quantidade--; 
            }else
                System.out.println("Não é possível desempilhar uma pilha vazia.");
        } catch (Exception e) {
            throw e;
        }

        return valorDesempilhado;
    }    
    
    @Override
    public void Esvaziar(){
        while(topo != null)
            Desempilhar();
    }
    
    @Override
    public void Imprimir(){
        Bloco aux = topo;
        while(aux != null){
            aux.valor.Relatorio();
            aux = aux.prox;
        }

    }
}
