import java.util.*;
import java.util.Map.Entry;

class WordFrequency4 {
  Map<String,Integer> words = new TreeMap<String,Integer>();

  WordFrequency4(String text) {
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
    
    WordFrequency4 wordFrequency4 = new WordFrequency4(text);

    SortByValueComparator comparator = new SortByValueComparator(wordFrequency4.words);

    Map<String, Integer> orderedWordFrequency4 = new TreeMap<String, Integer>(comparator);

    orderedWordFrequency4.putAll(wordFrequency4.words);

    for (String key : orderedWordFrequency4.keySet()) {
      Integer value = wordFrequency4.words.get(key);
      System.out.println(key + ": " + (value + 1));
    }
  }
}

class SortByValueComparator implements Comparator<Object> {

  Map<String, Integer> map;

  public SortByValueComparator(Map<String, Integer> map) {
      this.map = map;
  }

  public int compare(Object o1, Object o2) {
    if (map.get(o2) == map.get(o1)) {
      return 1;
    } else {
      return ((Integer) map.get(o2)).compareTo((Integer)map.get(o1));
    }
  }
}
