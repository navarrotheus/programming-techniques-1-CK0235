import java.util.*;
import java.io.*;

public class FileManipulation {
  Set<String> readFile() {
    Scanner scanner = new Scanner(System.in);

    String nome = scanner.nextLine();

    Set<String> nodes = new HashSet<String>();

    try {
      FileReader file = new FileReader(nome);
      BufferedReader readFile = new BufferedReader(file);

      String line = readFile.readLine();
      String[] nodesArr = line.split(" ");

      for (String node : nodesArr) {
        nodes.add(node);
      }
      file.close();
    } catch (IOException e) {
        System.err.printf("Erro na abertura do arquivo: %s.\n",
          e.getMessage());
    }

    return nodes;
  }

  void writeFile(Set<String> nodes) {
    try {
      File file = new File("filteredGraph.txt");
      file.createNewFile();

      FileWriter fw = new FileWriter(file);

      BufferedWriter bw = new BufferedWriter(fw);

      String text = "";

      Iterator iterator = nodes.iterator();

      while (iterator.hasNext()) {
        text = text + " " + iterator.next().toString();
      }
  
      bw.write(text);
      bw.newLine();
      bw.close();
      fw.close();

      System.out.println("Grafo filtrado salvo com sucesso em: filteredGraph.txt");
    } catch (IOException e) {
      System.err.printf("Erro na abertura do arquivo: %s.\n",
        e.getMessage());
    }
  }
}
