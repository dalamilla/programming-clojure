(ns euler.euler002-test
  (:require [clojure.test :refer [deftest testing are]]
            [euler.euler002 :refer [solution]]))

(deftest euler002-test
  (testing "The sum of even Fibonacci numbers below"
    (are [input expect] (= (solution input) expect)
      8 10
      10 10
      34 44
      60 44
      1000 798
      100000 60696
      4000000, 4613732)))
