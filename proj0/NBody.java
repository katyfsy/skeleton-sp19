public class NBody {
  public static double readRadius(String fileName) {
    In in = new In(fileName);
    int count = in.readInt();
    return in.readDouble();
  }

}