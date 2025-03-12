package lista3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercicio8 {
    public void lerArquivo(String nomeArquivo) {
        BufferedReader leitor = null;
        try {
            leitor = new BufferedReader(new FileReader(nomeArquivo));
            String linha;
            while ((linha = leitor.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        } finally {
            try {
                if (leitor != null) {
                    leitor.close();
                }
            } catch (IOException e) {
                System.out.println("Erro ao fechar o arquivo: " + e.getMessage());
            }
        }
    }
}