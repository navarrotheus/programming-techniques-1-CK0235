import java.util.*;

class WordFrequency3 {
  Map<String,Integer> words = new TreeMap<String,Integer>(Collections.reverseOrder());

  WordFrequency3(String text) {
    String word = "";
    for (int i = 0; i < text.length(); i++) {
      if (text.charAt(i) == ' ') {
        if (words.get(word) instanceof Integer) {
          words.replace(word, words.get(word) + 1);
        } else {
          this.words.put(word, 0);
        }
        word = "";
      } else {
        word += text.charAt(i);
      }
    }

    if (words.get(word) instanceof Integer) {
      words.replace(word, words.get(word) + 1);
    } else {
      this.words.put(word, 0);
    }
  }

  void printFrequencies() {
    for (String key : this.words.keySet()) {
      Integer value = this.words.get(key);
      System.out.println(key + ": " + (value + 1));
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter text");
    String text = scanner.nextLine();
    
    WordFrequency3 wordFrequency3 = new WordFrequency3(text);

    wordFrequency3.printFrequencies();
  }
}