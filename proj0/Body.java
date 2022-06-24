public class Body {
  final static double G = 6.67e-11;

  public double xxPos;
  public double yyPos;
  public double xxVel;
  public double yyVel;
  public double mass;
  public String imgFileName;

  public Body(double xP, double yP, double xV, double yV, double m, String img) {
    xxPos = xP;
    yyPos = yP;
    xxVel = xV;
    yyVel = yV;
    mass = m;
    imgFileName = img;
  }

  public Body(Body b) {
    xxPos = b.xxPos;
    yyPos = b.yyPos;
    xxVel = b.xxVel;
    yyVel = b.yyVel;
    mass = b.mass;
    imgFileName = b.imgFileName;
  }

  public double calcDistance(Body b2) {
    double xxDis = Math.abs(this.xxPos - b2.xxPos);
    double yyDis = Math.abs(this.yyPos - b2.yyPos);
    return Math.pow(Math.pow(xxDis, 2) + Math.pow(yyDis, 2), 0.5);
  }

  public double calcForceExertedBy(Body b2) {
    return G * this.mass * b2.mass / Math.pow(this.calcDistance(b2), 2);
  }

  public double calcForceExertedByX(Body b2) {
    return this.calcForceExertedBy(b2) * (b2.xxPos - this.xxPos) / this.calcDistance(b2);
  }

  public double calcForceExertedByY(Body b2) {
    return this.calcForceExertedBy(b2) * (b2.yyPos - this.yyPos) / this.calcDistance(b2);
  }
}