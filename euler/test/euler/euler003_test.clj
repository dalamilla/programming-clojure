(ns euler.euler003-test
  (:require [clojure.test :refer [deftest testing are]]
            [euler.euler003 :refer [solution]]))

(deftest euler003-test
  (testing "The largest prime factor of"
    (are [input expect] (= (solution input) expect)
      2 2
      3 3
      5 5
      7 7
      8 2
      13195 29
      600851475143, 6857)))
