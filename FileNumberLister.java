/* 
* @author  AlvD
* @version 1.0
* @since   31/07/2024

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileNumberLister {

    public static void main(String[] args) {
        // Caminho para o arquivo com a lista de números
        String filePath = "C:\\Users\\Asturias\\Downloads\\arquivo.txt";

        List<String> fourteenDigitNumbers = new ArrayList<>();
        List<String> lessThanFourteenDigitNumbers = new ArrayList<>();
        int totalFourteenDigitCodes = 0;
        int totalLessThanFourteenDigitCodes = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.length() == 14) {
                    fourteenDigitNumbers.add(line);
                    totalFourteenDigitCodes++;
                } else if (line.length() != 14) {
                    lessThanFourteenDigitNumbers.add(line);
                    totalLessThanFourteenDigitCodes++;
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        // Exibindo os resultados
        System.out.println("Números com 14 dígitos:");
        for (String number : fourteenDigitNumbers) {
            System.out.println(number);
        }
        System.out.println("Total de números com 14 dígitos: " + totalFourteenDigitCodes);

        System.out.println("\nNúmeros com menos de 14 dígitos:");
        for (String number : lessThanFourteenDigitNumbers) {
            System.out.println(number);
        }
        System.out.println("Total de números com menos de 14 dígitos: " + totalLessThanFourteenDigitCodes);
    }
}
*/