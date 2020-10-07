import java.util.*;
import java.util.stream.Stream;

import java.io.*;

/**
 * Foram criados dois metodos estaticos:
 * readFileAndReturn: le o arquivo no padrao da questao anterior e retorna apenas os valores em uma lista
 * orderList: ordena a lista recebida
 * writeFile: escreve o arquivo recebendo uma lista de double
 */

public final class Sort {
  public static void main(String[] args) {

    List<Double> values = readFileAndReturn("randomGaussian.txt");
    orderList(values);
    writeFile(values);
  }
  
  private static List<Double> readFileAndReturn(String name) {
    List<Double> values = new ArrayList<>();
    try {
      FileReader file = new FileReader(name);
      BufferedReader readFile = new BufferedReader(file);

      Stream<String> lines = readFile.lines();

      Iterator iterator = lines.iterator();

      while(iterator.hasNext()) { 
        values.add(Double.parseDouble(iterator.next().toString().substring(11)));
      }

      file.close();
    } catch (IOException e) {
        System.err.printf("Erro na abertura do arquivo: %s.\n",
          e.getMessage());
    }
    return values;
  }

  private static void orderList(List<Double> values) {
    Collections.sort(values);
  };

  private static void writeFile(List<Double> values) {
    try {
      File file = new File("randomGaussian.txt");
      file.createNewFile();

      FileWriter fw = new FileWriter(file);

      BufferedWriter bw = new BufferedWriter(fw);

      Iterator iterator = values.iterator();

      while (iterator.hasNext()) {
        bw.write("Generated : " + iterator.next().toString());
        bw.newLine();
      }
  
      bw.close();
      fw.close();

      System.out.println("Arquivo salvo com sucesso em: randomGaussian.txt");
    } catch (IOException e) {
      System.err.printf("Erro na abertura do arquivo: %s.\n",
        e.getMessage());
    }
  }
}