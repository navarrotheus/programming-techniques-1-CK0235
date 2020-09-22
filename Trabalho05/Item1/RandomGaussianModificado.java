import java.util.*;
import java.util.stream.Stream;
import java.io.*;

/**
 * Foram criados dois metodos estaticos:
 * writeFile: escreve o arquivo .txt recebendo o conjunto dos valores da distribuicao Gaussiana
 * readFileAndShow: le o arquivo com o nome da string recebida como parametro e printa na tela os valores da distribuicao Gaussiana
 */

public final class RandomGaussianModificado {
  public static void main(String[] args) {
    Set<String> values = new HashSet<String>();
    RandomGaussianModificado gaussian = new RandomGaussianModificado();

    double MEAN = 100.0f;
    double VARIANCE = 5.0f;

    for (int idx = 1; idx <= 10; ++idx) {
      values.add("Generated : " + gaussian.getGaussian(MEAN, VARIANCE));
    }

    writeFile(values);
    readFileAndShow("randomGaussian.txt");
  }

  private Random fRandom = new Random();

  private double getGaussian(double aMean, double aVariance) {
    return aMean + fRandom.nextGaussian() * aVariance;
  }

  private static void readFileAndShow(String name) {

    try {
      FileReader file = new FileReader(name);
      BufferedReader readFile = new BufferedReader(file);

      Stream<String> lines = readFile.lines();

      Iterator iterator = lines.iterator();

      while(iterator.hasNext()) { 
        System.out.println(iterator.next());
      }

      file.close();
    } catch (IOException e) {
        System.err.printf("Erro na abertura do arquivo: %s.\n",
          e.getMessage());
    }
  }

  private static void writeFile(Set<String> values) {
    try {
      File file = new File("randomGaussian.txt");
      file.createNewFile();

      FileWriter fw = new FileWriter(file);

      BufferedWriter bw = new BufferedWriter(fw);

      Iterator iterator = values.iterator();

      while (iterator.hasNext()) {
        bw.write(iterator.next().toString());
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