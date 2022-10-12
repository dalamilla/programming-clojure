;; 2520 is the smallest number that can be divided by each of  the numbers from
;; 1 to 10 without any remainder.
;; What is the smallest positive number that is evenly divisible by all of the
;; numbers from 1 to 20?

(ns euler.euler005)

(defn- high-common-fact
  "Helper function for fifth Euler problem:
   Get Highest Common Factor of two numbers"
  [a b]
  (if (zero? a)
    b
    (high-common-fact (rem b a) a)))

(defn solution
  "Solution of fifth Euler problem.
   Computes the smallest positive number that is evenly divisible by all of the numbers from 1 to n."
  [n]
  (reduce #(/ (* %1 %2) (high-common-fact %1 %2)) 1 (vec (range 1 (inc n)))))
