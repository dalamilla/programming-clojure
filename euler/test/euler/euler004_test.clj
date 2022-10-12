(ns euler.euler004-test
  (:require [clojure.test :refer [deftest testing are]]
            [euler.euler004 :refer [solution]]))

(deftest euler004-test
  (testing "The largest palindrome made from the product of two n-digit numbers:"
    (are [input expect] (= (solution input) expect)
      2 9009
      3 906609)))
