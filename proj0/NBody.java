public class NBody {
  public static double readRadius(String fileName) {
    In in = new In(fileName);
    int count = in.readInt();
    return in.readDouble();
  }

  public static Body[] readBodies(String fileName) {
    In in = new In(fileName);
    int count = in.readInt();
    double radius = in.readDouble();
    Body[] bodies = new Body[count];
    int i = 0;
    while (i < count) {
      double xP = in.readDouble();
      double yP = in.readDouble();
      double xV = in.readDouble();
      double yV = in.readDouble();
      double m = in.readDouble();
      String img = in.readString();
      bodies[i] = new Body(xP, yP, xV, yV, m, img);
      i += 1;
    }
    return bodies;
  }

  public static void main(String[] args) {
    double T = args[0].parseDouble();
    double dt = args[1].parseDouble();
    String filename = args[2];
    Body[] bodies = readBodies(filename);
    double radius = readRadius(filename);

    StdDraw.enableDoubleBuffering();
    StdDraw.setScale(-radius, radius);
    StdDraw.clear();
    StdDraw.picture(1, -1, "images/starfield.jpg");
  }

}