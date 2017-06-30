trait Eval extends Base with BaseMul {
  type exp <: Exp

  trait Exp extends super.Exp {
    def eval: Int
  }

  class Lit(value: Int) extends super.Lit(value) with Exp {
    def eval = value
  }

  class Add(left: exp, right: exp) extends super.Add(left, right) with Exp {
    def eval = left.eval + right.eval
  }

  class Mul(left: exp, right: exp) extends super.Mul(left, right) with Exp {
    def eval = left.eval * right.eval
  }
}
