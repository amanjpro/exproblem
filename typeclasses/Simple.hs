module Simple(Lit(..), Add(..), Stringify(stringify)) where

data Lit = Lit Int
data Add l r = Add l r


class Stringify x where
  stringify :: x -> String

instance Stringify Lit where
  stringify (Lit x) = show x

instance (Stringify l, Stringify r) => Stringify (Add l r) where
  stringify (Add l r) = stringify l ++ " + " ++ stringify r
