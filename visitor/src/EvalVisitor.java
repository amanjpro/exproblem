
class EvalVisitor implements Visitor<Integer> {
  public Integer visit(Lit lit) { return lit.getValue(); }
  public Integer visit(Add add) { return add.getLeft().accept(this) + add.getRight().accept(this); }
}
