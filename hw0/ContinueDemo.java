public class ContinueDemo {
  public static void main(String[] args) {
    String[] a={"cat", "dog", "laser horse", "ketchup", "horse", "horbse"};

    for (int i = 0; i < a.length; i += 1) {
      if (a[i].contains("horse")) {
        continue;
      }
      for (int j = 0; j < 3; j += 1) {
        System.out.println(a[i]);
      }
    }
  }
}

/**skips the current iteration of the loop once the condition fulfills,
jumps straight into the next iteration*/