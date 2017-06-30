


trait BaseMul extends Base {
  class Mul(left: exp, right: exp) extends Exp {
    def stringify = s"${left.stringify} + ${right.stringify}"
  }
}
