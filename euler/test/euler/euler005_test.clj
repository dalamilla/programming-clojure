(ns euler.euler005-test
  (:require [clojure.test :refer [deftest testing are]]
            [euler.euler005 :refer [solution]]))

(deftest euler005-test
  (testing "The smallest positive number that is evenly divisible by all of the numbers from 1 to"
    (are [input expect] (= (solution input) expect)
      5 60
      7 420
      10 2520
      13 360360
      20 232792560)))
