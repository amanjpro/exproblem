public class Mul implements Exp {
  private Exp left, right;

  public Mul(final Exp left, final Exp right) {
    this.left = left;
    this.right = right;
  }

  public Exp getLeft() { return this.left; }
  public Exp getRight() { return this.right; }

  public void setRight(final Exp right) { this.right = right; }
  public void setLeft(final Exp left) { this.left = left; }

  public String stringify() {
    StringBuilder builder = new StringBuilder();
    builder.append(this.left.stringify());
    builder.append(" * ");
    builder.append(this.right.stringify());
    return builder.toString();
  }
}
