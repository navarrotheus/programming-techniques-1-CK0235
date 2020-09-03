import java.util.*;

public class Main {
  public static void main(String args[]) {
    Set<String> nodes = new HashSet<String>();

    for(String node : args) {
      nodes.add(node);
    }

    Graph graph = new Graph(nodes);

    System.out.println("Graph: ");
    graph.printNodes();

    Set<String> nodesToRemove = new HashSet<String>();

    System.out.println("Enter the nodes: ");
    Scanner scanner = new Scanner(System.in);
    String nodesToRemoveStr = scanner.nextLine();
    String[] nodesArr = nodesToRemoveStr.split(" ");
    for (String node : nodesArr) {
      nodesToRemove.add(node);
    }

    Graph filteredGraph = graph.removeNodes(nodesToRemove);
    System.out.println("Filtered graph: ");
    filteredGraph.printNodes();
  }
}
