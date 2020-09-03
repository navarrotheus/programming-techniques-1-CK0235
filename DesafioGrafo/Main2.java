import java.util.*;
import java.io.*;

public class Main2 {
  public static void main(String args[]) {
    FileManipulation fileManipulation = new FileManipulation();

    System.out.println("Informe o nome do arquivo texto dos vértices do grafo: ");
    Set<String> nodes = fileManipulation.readFile();
    Graph graph = new Graph(nodes);

    System.out.println("\nGraph: ");
    graph.printNodes();
    System.out.println("");

    System.out.println("Informe o nome do arquivo texto dos vértices a serem removidos: ");
    Set<String> nodesToRemove = fileManipulation.readFile();
    Graph filteredGraph = graph.removeNodes(nodesToRemove);

    System.out.println("\nFiltered graph: ");
    filteredGraph.printNodes();
    System.out.println("");

    fileManipulation.writeFile(filteredGraph.getNodes());
  }
}
