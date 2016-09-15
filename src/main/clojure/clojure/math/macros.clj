(ns clojure.math.macros)

(defmacro reify-bool
  [statement]
  `(if ~statement 1 0))

