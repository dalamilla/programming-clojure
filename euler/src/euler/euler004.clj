;; A palindromic number reads the same both ways. The largest palindrome made from
;; the product of two 2-startDigit numbers is 9009 = 91 × 99.
;; Find the largest palindrome made from the product of two 3-startDigit numbers.

(ns euler.euler004)

(defn- is_palindrome?
  "Helper function for fourth Euler problem:
   Verify if argument its a palindrome"
  [n]
  (= (seq (str n)) (reverse (str n))))

(defn- pow
  "Helper function for fourth Euler problem:
   Exponential of number"
  [x n]
  (reduce * (repeat n x)))

(defn solution
  "Solution of fourth Euler problem.
  Computes the largest palindrome made from the product of two n-startDigit numbers."
  [n]
  (def n-start-digits (range
                       (pow 10 (- n 1)) (pow 10 n)))
  (reduce max (filter #(is_palindrome? %)
                      (for [a n-start-digits b n-start-digits]
                        (* a b)))))
