public class EnhancedForBreakDemo {
  public static void main(String[] args) {
    String[] a = {"cat", "dog", "laser horse", "ketchup", "horse", "horbse"};

    for (String s : a) {
      for (int j = 0; j < 3; j += 1) {
        System.out.println(s);
        if (s.contains("horse")) {
          break;
        }
      }
    }
  }
}
//string s takes on the identity of each string in a exactly once
