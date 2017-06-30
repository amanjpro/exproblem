
class StringifyVisitor implements Visitor<String> {
  public String visit(Lit lit) { return String.valueOf(lit.getValue()); }
  public String visit(Add add) { return add.getLeft().accept(this) + " + " + add.getRight().accept(this); }
}
