import java.util.*;

class ItemF {
  public static void main(String args[]) {
    TesteHash2 testeHash2 = new TesteHash2();

    Set<String> hashSet = new HashSet<>();
    hashSet.add("Janeiro");
    hashSet.add("Fevereiro");
    hashSet.add("Março");
    hashSet.add("Abril");
    hashSet.add("Maio");
    hashSet.add("Fevereiro");
    System.out.println("HashSet:");
    testeHash2.listar(hashSet);
    System.out.println("\n");

    Set<String> treeSet = new TreeSet<>();
    treeSet.add("Janeiro");
    treeSet.add("Fevereiro");
    treeSet.add("Março");
    treeSet.add("Abril");
    treeSet.add("Maio");
    treeSet.add("Fevereiro");
    System.out.println("TreeSet:");
    testeHash2.listar(treeSet);
    System.out.println("\n");

    Set<String> linkedHashSet = new LinkedHashSet<>();
    linkedHashSet.add("Janeiro");
    linkedHashSet.add("Fevereiro");
    linkedHashSet.add("Março");
    linkedHashSet.add("Abril");
    linkedHashSet.add("Maio");
    linkedHashSet.add("Fevereiro");
    System.out.println("LinkedHashSet:");
    testeHash2.listar(linkedHashSet);
    System.out.println("\n");

    List<String> arrayList = new ArrayList<>();
    arrayList.add("Janeiro");
    arrayList.add("Fevereiro");
    arrayList.add("Março");
    arrayList.add("Abril");
    arrayList.add("Maio");
    arrayList.add("Fevereiro");
    System.out.println("ArrayList:");
    testeHash2.listar(arrayList);
  }
}