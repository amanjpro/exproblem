public class Lit implements Exp {
  private int value;

  public Lit(final int value) {
    this.value = value;
  }

  public int getValue() { return value; }
  public void setValue(final int value) { this.value = value; }

  public String stringify() {
    return String.valueOf(this.value);
  }
}
