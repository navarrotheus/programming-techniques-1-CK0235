import java.util.*;

class Graph {
  Set<String> nodes = new HashSet<String>();

  Graph(Set<String> nodes) {
    this.nodes = nodes;
  }

  Set<String> getNodes() {
    return this.nodes;
  }

  void setNodes(Set<String> nodes) {
    this.nodes = nodes;
  }

  void printNodes() {
    System.out.println(nodes);
  }

  Graph removeNodes(Set<String> nodesToRemove) {
    Set<String> nodesCopy = new HashSet<String>();
    nodesCopy.addAll(this.nodes);

    Iterator iterator = nodesToRemove.iterator();

    while(iterator.hasNext()) {
      nodesCopy.remove(iterator.next());
    }

    Graph filteredGraph = new Graph(nodesCopy);

    return filteredGraph;
  }
}
