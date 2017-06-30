public class Add implements Exp {
  private Exp left, right;

  public Add(final Exp left, final Exp right) {
    this.left = left;
    this.right = right;
  }

  public Exp getLeft() { return this.left; }
  public Exp getRight() { return this.right; }

  public void setRight(final Exp right) { this.right = right; }
  public void setLeft(final Exp left) { this.left = left; }

  public <T> T accept(Visitor<T> visitor) {
    return visitor.visit(this);
  }
}
