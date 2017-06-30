module Simple(Exp(..), stringify) where

data Exp = Add Exp Exp | Lit Int

stringify :: Exp -> String
stringify (Lit value)      = show value
stringify (Add left right) = stringify left ++ " + " ++ stringify right
