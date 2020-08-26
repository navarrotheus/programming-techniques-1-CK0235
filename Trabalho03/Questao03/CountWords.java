import java.util.*;

class CountWords {
  List<String> words = new ArrayList<>();

  CountWords(String text) {
    String word = "";
    for (int i = 0; i < text.length(); i++) {
      if (text.charAt(i) == ' ') {
        this.words.add(word);
        word = "";
      } else {
        word += text.charAt(i);
      }
    }
    this.words.add(word);
  }

  int total() {
    return this.words.size();
  }

  int totalDistinct() {
    Set<String> distinctWords = new HashSet<>();
    Iterator iterator = this.words.iterator();

    while(iterator.hasNext()) {
      distinctWords.add((String)iterator.next());
    }
    
    return distinctWords.size();
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter text");
    String text = scanner.nextLine();
    
    CountWords countWords = new CountWords(text);

    System.out.println("Total de Palavras: " + countWords.total());
    System.out.println("Total de Palavras Distintas: " + countWords.totalDistinct());
  }
}