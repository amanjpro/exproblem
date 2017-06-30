module Eval(eval) where

import Simple

eval :: Exp -> Int
eval (Add left right) = (eval left) + (eval right)
eval (Lit value)      = value
