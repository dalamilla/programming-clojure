;; The prime factors of 13195 are 5, 7, 13 and 29.
;; What is the largest prime factor of the number 600851475143 ?

(ns euler.euler003)

(defn- prime-factors-of
  "Helper function for third Euler problem:
   Get Prime factors of a number"
  ([n] (prime-factors-of 2 n))
  ([f n]
   (if (> n 1)
     (if (= 0 (mod n f))
       (cons f (prime-factors-of f (/ n f)))
       (recur (inc f) n))
     [])))

(defn solution
  "Solution of third Euler problem.
  Computes the largest prime factor of n."
  [n]
  (last (prime-factors-of n)))

