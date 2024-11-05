package jwa.utils;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class LoadArquivo {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o caminho"); 
        String caminhoArquivo = scanner.nextLine();
        scanner.close();

        //Criar arquivo como objeto 
        File arquivo = new File (caminhoArquivo);

        // verificar se esse arquivo existe 
        // Verificar se o arquivo existe
   // Verificar se o arquivo existe
    if (arquivo.exists()) {
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            // Ler e imprimir cada linha do arquivo
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    } else {
        System.out.println("O arquivo não existe.");
    }
 }
}

        
    
