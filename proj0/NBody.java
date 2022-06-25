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
    double T = Double.parseDouble(args[0]);
    double dt = Double.parseDouble(args[1]);
    String filename = args[2];
    Body[] bodies = readBodies(filename);
    double radius = readRadius(filename);
    int count = bodies.length;

    StdDraw.setScale(-radius, radius);
    StdDraw.picture(0, 0, "images/starfield.jpg");

    for (Body b: bodies) {
      b.draw();
    }

    StdDraw.enableDoubleBuffering();

    double t = 0;

    while (t < T) {
      double[] xForces = new double[count];
      double[] yForces = new double[count];

      int i = 0;
      while (i < count) {
        xForces[i] = bodies[i].calcNetForceExertedByX(bodies);
        yForces[i] = bodies[i].calcNetForceExertedByY(bodies);
        i += 1;
      }

      int j = 0;
      while (j < count) {
        bodies[j].update(dt, xForces[j], yForces[j]);
        j += 1;
      }

      StdDraw.picture(0, 0, "images/starfield.jpg");
      for (Body b: bodies) {
       b.draw();
      }

      StdDraw.show();
      StdDraw.pause(10);

      t += dt;
    }
  }
}