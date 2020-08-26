import java.util.*;

class TesteHash2 {
  void listar(Collection colecao) {
    System.out.println("*** Listar 1 ***");
    Iterator iterator = colecao.iterator();
    String message = "[";
    while(iterator.hasNext()) {
      message = message + iterator.next() + ", ";
    }
    message = message + "]";
    message = message.replace(", ]", "]");
    System.out.println(message);
  }

  static void listar2 (Collection c) {
    System.out.println("*** Listar 2 ***");

    for (Object o : c) {
      System.out.println(o);
    }
  }

  public static void main(String args[]) {
    Set<String> mesesHash = new HashSet<>();

    mesesHash.add("Janeiro");
    mesesHash.add("Fevereiro");
    mesesHash.add("Março");
    mesesHash.add("Abril");
    mesesHash.add("Maio");
    mesesHash.add("Fevereiro");

    TesteHash2 TesteHash2 = new TesteHash2();

    System.out.println("HashSet: ");
    TesteHash2.listar(mesesHash);
    TesteHash2.listar2(mesesHash);

    System.out.println("\n");

    Set<String> mesesHashTreeSet = new TreeSet<>();

    mesesHashTreeSet.add("Janeiro");
    mesesHashTreeSet.add("Fevereiro");
    mesesHashTreeSet.add("Março");
    mesesHashTreeSet.add("Abril");
    mesesHashTreeSet.add("Maio");
    mesesHashTreeSet.add("Fevereiro");

    System.out.println("TreeSet: ");
    TesteHash2.listar(mesesHashTreeSet);
    TesteHash2.listar2(mesesHashTreeSet);

    System.out.println("\n");

    Set<String> mesesHashLinkedHashSet = new LinkedHashSet<>();

    mesesHashLinkedHashSet.add("Janeiro");
    mesesHashLinkedHashSet.add("Fevereiro");
    mesesHashLinkedHashSet.add("Março");
    mesesHashLinkedHashSet.add("Abril");
    mesesHashLinkedHashSet.add("Maio");
    mesesHashLinkedHashSet.add("Fevereiro");

    System.out.println("LinkedHashSet: ");
    TesteHash2.listar(mesesHashLinkedHashSet);
    TesteHash2.listar2(mesesHashLinkedHashSet);
  }
}