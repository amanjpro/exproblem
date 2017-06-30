
interface Visitor<T> {
  public T visit(final Lit lit);
  public T visit(final Add add);
}
