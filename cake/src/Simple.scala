
trait Base {

  type exp <: Exp

  trait Exp {
    def stringify: String
  }

  class Lit(val value: Int) extends Exp {
    def stringify = value.toString
  }

  class Add(val left: exp, val right: exp) extends Exp {
    def stringify = s"${left.stringify} + ${right.stringify}"
  }
}
