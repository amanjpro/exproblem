module Eval(Eval(..)) where

import Simple
import Rich

class Eval x where
  eval :: x -> Int

instance Eval Lit where
  eval (Lit x) = x

instance (Eval l, Eval r) => Eval (Add l r) where
  eval (Add l r) = eval l + eval r

instance (Eval l, Eval r) => Eval (Mul l r) where
  eval (Mul l r) = eval l * eval r
