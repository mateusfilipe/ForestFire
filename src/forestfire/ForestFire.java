/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package forestfire;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;



/**
 *
 * @author aluno
 */
public class ForestFire {
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {

        /**
         * Declarando pilhas de meses a serem utilizadas;
         */
        Pilha Janeiro = new Pilha();
        Pilha Fevereiro = new Pilha();
        Pilha Marco = new Pilha();
        Pilha Abril = new Pilha();
        Pilha Maio = new Pilha();
        Pilha Junho = new Pilha();
        Pilha Julho = new Pilha();
        Pilha Agosto = new Pilha();
        Pilha Setembro = new Pilha();
        Pilha Outubro = new Pilha();
        Pilha Novembro = new Pilha();
        Pilha Dezembro = new Pilha();
        
        /**
         * Lendo arquivo no diretório
         * Fazendo comparações e empilhando nos meses
         * Requisitando ao usuário o mês a ser impresso
         */
        try {
            //NO FILEREADER DEVERÁ SER COLOCADO O DIRETÓRIO COMPLETO DE ONDE O ARQUIVO A SER LIDO SE LOCALIZA
            FileReader arq = new FileReader("forestfires.csv");
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = lerArq.readLine();
            Queimada queimadaAux = null;
            while (linha != null) {
                String[] aux = linha.split(",");
                //Comparações dos Meses para empilha-los de acordo com a coordenada de cada queimada.
                if (linha.contains("jan")){
                    if(Integer.parseInt(aux[0]) <= 3){
                        queimadaAux = new QueimadaX1a3(linha);
                        Janeiro.Empilhar(queimadaAux);
                    }else if(Integer.parseInt(aux[0]) >= 4  && Integer.parseInt(aux[0]) <= 6){
                        queimadaAux = new QueimadaX4a6(linha);
                        Janeiro.Empilhar(queimadaAux);
                    }else if(Integer.parseInt(aux[0]) >= 7  && Integer.parseInt(aux[0]) <= 9){
                        queimadaAux = new QueimadaX7a9(linha);
                        Janeiro.Empilhar(queimadaAux);
                    }                
                }
                else if(linha.contains("feb")){
                    if(Integer.parseInt(aux[0]) <= 3){
                        queimadaAux = new QueimadaX1a3(linha);
                        Fevereiro.Empilhar(queimadaAux);
                    }else if(Integer.parseInt(aux[0]) >= 4  && Integer.parseInt(aux[0]) <= 6){
                        queimadaAux = new QueimadaX4a6(linha);
                        Fevereiro.Empilhar(queimadaAux);
                    }else if(Integer.parseInt(aux[0]) >= 7  && Integer.parseInt(aux[0]) <= 9){
                        queimadaAux = new QueimadaX7a9(linha);
                        Fevereiro.Empilhar(queimadaAux);
                    }
                }
                else if(linha.contains("mar")){
                    if(Integer.parseInt(aux[0]) <= 3){
                        queimadaAux = new QueimadaX1a3(linha);
                        Marco.Empilhar(queimadaAux);
                    }else if(Integer.parseInt(aux[0]) >= 4  && Integer.parseInt(aux[0]) <= 6){
                        queimadaAux = new QueimadaX4a6(linha);
                        Marco.Empilhar(queimadaAux);
                    }else if(Integer.parseInt(aux[0]) >= 7  && Integer.parseInt(aux[0]) <= 9){
                        queimadaAux = new QueimadaX7a9(linha);
                        Marco.Empilhar(queimadaAux);
                    }
                }
                else if(linha.contains("apr")){
                    if(Integer.parseInt(aux[0]) <= 3){
                        queimadaAux = new QueimadaX1a3(linha);
                        Abril.Empilhar(queimadaAux);
                    }else if(Integer.parseInt(aux[0]) >= 4  && Integer.parseInt(aux[0]) <= 6){
                        queimadaAux = new QueimadaX4a6(linha);
                        Abril.Empilhar(queimadaAux);
                    }else if(Integer.parseInt(aux[0]) >= 7  && Integer.parseInt(aux[0]) <= 9){
                        queimadaAux = new QueimadaX7a9(linha);
                        Abril.Empilhar(queimadaAux);
                    }
                }
                else if(linha.contains("may")){
                    if(Integer.parseInt(aux[0]) <= 3){
                        queimadaAux = new QueimadaX1a3(linha);
                        Maio.Empilhar(queimadaAux);
                    }else if(Integer.parseInt(aux[0]) >= 4  && Integer.parseInt(aux[0]) <= 6){
                        queimadaAux = new QueimadaX4a6(linha);
                        Maio.Empilhar(queimadaAux);
                    }else if(Integer.parseInt(aux[0]) >= 7  && Integer.parseInt(aux[0]) <= 9){
                        queimadaAux = new QueimadaX7a9(linha);
                        Maio.Empilhar(queimadaAux);
                    }
                }
                else if(linha.contains("jun")){
                    if(Integer.parseInt(aux[0]) <= 3){
                        queimadaAux = new QueimadaX1a3(linha);
                        Junho.Empilhar(queimadaAux);
                    }else if(Integer.parseInt(aux[0]) >= 4  && Integer.parseInt(aux[0]) <= 6){
                        queimadaAux = new QueimadaX4a6(linha);
                        Junho.Empilhar(queimadaAux);
                    }else if(Integer.parseInt(aux[0]) >= 7  && Integer.parseInt(aux[0]) <= 9){
                        queimadaAux = new QueimadaX7a9(linha);
                        Junho.Empilhar(queimadaAux);
                    }
                }
                else if(linha.contains("jul")){
                    if(Integer.parseInt(aux[0]) <= 3){
                        queimadaAux = new QueimadaX1a3(linha);
                        Julho.Empilhar(queimadaAux);
                    }else if(Integer.parseInt(aux[0]) >= 4  && Integer.parseInt(aux[0]) <= 6){
                        queimadaAux = new QueimadaX4a6(linha);
                        Julho.Empilhar(queimadaAux);
                    }else if(Integer.parseInt(aux[0]) >= 7  && Integer.parseInt(aux[0]) <= 9){
                        queimadaAux = new QueimadaX7a9(linha);
                        Julho.Empilhar(queimadaAux);
                    }
                }
                else if(linha.contains("aug")){
                    if(Integer.parseInt(aux[0]) <= 3){
                        queimadaAux = new QueimadaX1a3(linha);
                        Agosto.Empilhar(queimadaAux);
                    }else if(Integer.parseInt(aux[0]) >= 4  && Integer.parseInt(aux[0]) <= 6){
                        queimadaAux = new QueimadaX4a6(linha);
                        Agosto.Empilhar(queimadaAux);
                    }else if(Integer.parseInt(aux[0]) >= 7  && Integer.parseInt(aux[0]) <= 9){
                        queimadaAux = new QueimadaX7a9(linha);
                        Agosto.Empilhar(queimadaAux);
                    }
                }
                else if(linha.contains("sep")){
                    if(Integer.parseInt(aux[0]) <= 3){
                        queimadaAux = new QueimadaX1a3(linha);
                        Setembro.Empilhar(queimadaAux);
                    }else if(Integer.parseInt(aux[0]) >= 4  && Integer.parseInt(aux[0]) <= 6){
                        queimadaAux = new QueimadaX4a6(linha);
                        Setembro.Empilhar(queimadaAux);
                    }else if(Integer.parseInt(aux[0]) >= 7  && Integer.parseInt(aux[0]) <= 9){
                        queimadaAux = new QueimadaX7a9(linha);
                        Setembro.Empilhar(queimadaAux);
                    }
                }
                else if(linha.contains("oct")){
                    if(Integer.parseInt(aux[0]) <= 3){
                        queimadaAux = new QueimadaX1a3(linha);
                        Outubro.Empilhar(queimadaAux);
                    }else if(Integer.parseInt(aux[0]) >= 4  && Integer.parseInt(aux[0]) <= 6){
                        queimadaAux = new QueimadaX4a6(linha);
                        Outubro.Empilhar(queimadaAux);
                    }else if(Integer.parseInt(aux[0]) >= 7  && Integer.parseInt(aux[0]) <= 9){
                        queimadaAux = new QueimadaX7a9(linha);
                        Outubro.Empilhar(queimadaAux);
                    }
                }
                else if(linha.contains("nov")){
                    if(Integer.parseInt(aux[0]) <= 3){
                        queimadaAux = new QueimadaX1a3(linha);
                        Novembro.Empilhar(queimadaAux);
                    }else if(Integer.parseInt(aux[0]) >= 4  && Integer.parseInt(aux[0]) <= 6){
                        queimadaAux = new QueimadaX4a6(linha);
                        Novembro.Empilhar(queimadaAux);
                    }else if(Integer.parseInt(aux[0]) >= 7  && Integer.parseInt(aux[0]) <= 9){
                        queimadaAux = new QueimadaX7a9(linha);
                        Novembro.Empilhar(queimadaAux);
                    }
                }
                else if(linha.contains("dec")){
                    if(Integer.parseInt(aux[0]) <= 3){
                        queimadaAux = new QueimadaX1a3(linha);
                        Dezembro.Empilhar(queimadaAux);
                    }else if(Integer.parseInt(aux[0]) >= 4  && Integer.parseInt(aux[0]) <= 6){
                        queimadaAux = new QueimadaX4a6(linha);
                        Dezembro.Empilhar(queimadaAux);
                    }else if(Integer.parseInt(aux[0]) >= 7  && Integer.parseInt(aux[0]) <= 9){
                        queimadaAux = new QueimadaX7a9(linha);
                        Dezembro.Empilhar(queimadaAux);
                    }
                }
                linha = lerArq.readLine();
            }
            arq.close();
            System.out.println("Qual mês gostaria de receber o relatório? (Não utilize acentos ou símbolos)");
            String opcao;
            Scanner sc = new Scanner(System.in);
            opcao = sc.next();
            opcao = opcao.toLowerCase();
            System.out.println("X, Y, month, day, FFMC, DMC, DC, ISI, temp, RH, wind, rain, area");
            switch (opcao) {
                case "janeiro":
                    Janeiro.Imprimir();
                    break;
                case "fevereiro":
                    Fevereiro.Imprimir();
                    break;
                case "marco":
                    Marco.Imprimir();
                    break;
                case "abril":
                    Abril.Imprimir();
                    break;
                case "maio":
                    Maio.Imprimir();
                    break;
                case "junho":
                    Junho.Imprimir();
                    break;
                case "julho":
                    Julho.Imprimir();
                    break;
                case "agosto":
                    Agosto.Imprimir();
                    break;
                case "setembro":
                    Setembro.Imprimir();
                    break;
                case "outubro":
                    Outubro.Imprimir();
                    break;
                case "novembro":
                    Novembro.Imprimir();
                    break;
                case "dezembro":
                    Dezembro.Imprimir();
                    break;
                default:
                    System.out.println("MÊS DIGITADO INVÁLIDO!!!");
            }
  
        } catch (IOException e) {
            System.err.printf("Não foi possível abrir o arquivo.\n",
            e.getMessage());
        }

        System.out.println();
    }
}

