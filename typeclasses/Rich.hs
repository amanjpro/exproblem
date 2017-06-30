module Rich(Mul(..)) where

import Simple

data Mul l r = Mul l r


instance (Stringify l, Stringify r) => Stringify (Mul l r) where
  stringify (Mul l r) = stringify l ++ " * " ++ stringify r
