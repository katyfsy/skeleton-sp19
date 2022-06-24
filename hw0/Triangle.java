public class Triangle {
  public static void drawTriangle(int N) {
    String star = "*";
    while (star.length() < N + 1) {
      System.out.println(star);
      star += "*";
    }
  }
  public static void main(String[] args) {
    drawTriangle(10);
  }
}