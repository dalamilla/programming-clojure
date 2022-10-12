(ns euler.euler001-test
  (:require [clojure.test :refer [deftest testing are]]
            [euler.euler001 :refer [solution]]))

(deftest euler001-test
  (testing "The sum of multiples of 3 or 5 below"
    (are [input expect] (= (solution input) expect)
      1000 233168
      49 543
      8456 16687353
      19564 89301183)))
