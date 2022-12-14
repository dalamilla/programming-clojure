;; If we list all the natural numbers below 10 that are multiples of 3 or 5,
;; we get 3, 5, 6 and 9. The sum of these multiples is 23.
;; Find the sum of all the multiples of 3 or 5 below 1000.

(ns euler.euler001)

(defn solution
  "Solution of first Euler problem.
  Computes the summatory of natural numbers that are multiples of 3 or 5 below n."
  [n]
  (reduce + (filter #(or (= 0 (rem % 3)) (= 0 (rem % 5))) (range 1 n))))
