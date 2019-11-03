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
 * @author Angela
 */
public class LeitorArquivo {

    private String nome;

    public LeitorArquivo(String nome) {
        this.nome = nome;
    }
    Scanner ler = new Scanner(System.in);

    public String ReadFile() {
        String arquivoTodo = "";
        System.out.println("\nConteúdo do arquivo texto:\n");
        try {
            FileReader arq = new FileReader(nome);
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine(); // lê a primeira linha
            // a variável "linha" recebe o valor "null" quando o processo
            // de repetição atingir o final do arquivo texto
            while (linha != null) {
                //System.out.printf("%s\n", linha);
                arquivoTodo+= "\n"+linha;
                linha = lerArq.readLine(); // lê da segunda até a última linha
                return linha;
            }

            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }

        System.out.println();
        return ""/*arquivoTodo*/;
    }
}
