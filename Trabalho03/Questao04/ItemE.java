import java.util.*;

class ItemE {
  ItemE(Collection<String> colecao, String[] arr) {
    for(int i = 0; i < arr.length; i++) {
      colecao.add(arr[i]);
    }
  }

  void verificar(Collection<String> colecao) {
    colecao.clear();

    // Teste de elementos duplicados
    colecao.add("Elemento Teste 1");
    colecao.add("Elemento Teste 1");

    if (colecao.size() == 1) {
      System.out.println("Permite elementos duplicados: falso");
    } else {
      System.out.println("Permite elementos duplicados: verdadeiro");
    }

    colecao.clear();

    // Teste de ordenacao automatica
    colecao.add("Elemento B");
    colecao.add("Elemento A");
    colecao.add("Elemento C");

    Iterator iterator = colecao.iterator();

    if (iterator.next() == "Elemento A") {
      System.out.println("Ordena automaticamente: verdadeiro");
    } else {
      System.out.println("Ordena automaticamente: falso");
    }

    // Teste de ordem de entrada
    iterator = colecao.iterator();

    if (iterator.next() == "Elemento B") {
      if (iterator.next() == "Elemento A") {
        System.out.println("Garante a ordem de entrada: verdadeiro");
      } else {
        System.out.println("Garante a ordem de entrada: falso");
      }
    } else {
      System.out.println("Garante a ordem de entrada: falso");
    }
   }

  void printElements(Collection<String> colecao) {
    Iterator iterator = colecao.iterator();

    while(iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }

  public static void main(String args[]) {
    String[] vetor = {"Elemento B", "Elemento A", "Elemento C", "Elemento C"};

    Set<String> hashSet = new HashSet<>();
    System.out.println("HashSet:");
    ItemE itemEHashSet = new ItemE(hashSet, vetor);
    itemEHashSet.printElements(hashSet);
    itemEHashSet.verificar(hashSet);
    System.out.println("\n");

    Set<String> linkedHashSet = new LinkedHashSet<>();
    System.out.println("LinkedHashSet:");
    ItemE itemELinkedHashSet = new ItemE(linkedHashSet, vetor);
    itemELinkedHashSet.printElements(linkedHashSet);
    itemELinkedHashSet.verificar(linkedHashSet);
    System.out.println("\n");

    Set<String> treeSet = new TreeSet<>();
    System.out.println("TreeSet:");
    ItemE itemETreeSet = new ItemE(treeSet, vetor);
    itemETreeSet.printElements(treeSet);
    itemETreeSet.verificar(treeSet);
    System.out.println("\n");

    List<String> arrayList = new ArrayList<>();
    System.out.println("ArrayList:");
    ItemE itemEArrayList = new ItemE(arrayList, vetor);
    itemEArrayList.printElements(arrayList);
    itemEArrayList.verificar(arrayList);
    System.out.println("\n");

    List<String> vector = new Vector<>();
    System.out.println("Vector:");
    ItemE itemEVector = new ItemE(vector, vetor);
    itemEVector.printElements(vector);
    itemEVector.verificar(vector);
    System.out.println("\n");

    List<String> linkedList = new LinkedList<>();
    System.out.println("LinkedList:");
    ItemE itemELinkedList = new ItemE(linkedList, vetor);
    itemELinkedList.printElements(linkedList);
    itemELinkedList.verificar(linkedList);
    System.out.println("\n");

    Queue<String> priorityQueue = new PriorityQueue<>();
    System.out.println("PriorityQueue:");
    ItemE itemEPriorityQueue = new ItemE(priorityQueue, vetor);
    itemEPriorityQueue.printElements(priorityQueue);
    itemEPriorityQueue.verificar(priorityQueue);
  }
}