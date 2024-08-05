/*
* @author  AlvD
* @version 1.0
* @since   31/07/2024

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileNumberLister2 {

    public static void main(String[] args) {
        // Caminho para o arquivo com a lista de números
        String filePath = "C:\\Users\\Asturias\\Downloads\\arquivo.txt";
        String fourteenDigitFilePath = "C:\\Users\\Asturias\\Downloads\\códigos_13_dígitos.txt";
        String lessThanFourteenDigitFilePath = "C:\\Users\\Asturias\\Downloads\\códigos_menos_de_13_dígitos.txt";

        List<String> fourteenDigitNumbers = new ArrayList<>();
        List<String> lessThanFourteenDigitNumbers = new ArrayList<>();
        int totalFourteenDigitCodes = 0;
        int totalLessThanFourteenDigitCodes = 0;
        int totalCodes = 0;

        // Contar o total de linhas no arquivo
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                totalCodes++;
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        // Processar o arquivo para separar os números com base no comprimento
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.length() == 13) {
                    fourteenDigitNumbers.add(line);
                    totalFourteenDigitCodes++;
                } else {
                    lessThanFourteenDigitNumbers.add(line);
                    totalLessThanFourteenDigitCodes++;
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        // Gravar os números com 13 dígitos em um arquivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fourteenDigitFilePath))) {
            for (String number : fourteenDigitNumbers) {
                writer.write(number);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao gravar o arquivo de códigos com 13 dígitos: " + e.getMessage());
        }

        // Gravar os números com menos de 13 dígitos em um arquivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(lessThanFourteenDigitFilePath))) {
            for (String number : lessThanFourteenDigitNumbers) {
                writer.write(number);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao gravar o arquivo de códigos com menos de 13 dígitos: " + e.getMessage());
        }

        // Exibindo os resultados
        System.out.println("Total de códigos no arquivo: " + totalCodes);
        System.out.println("Total de números com 13 dígitos: " + totalFourteenDigitCodes);
        System.out.println("Total de números com menos de 13 dígitos: " + totalLessThanFourteenDigitCodes);
    }
}
*/