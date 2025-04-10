(ns request-header.core-test
  (:require [clojure.test :refer [deftest is testing]]
            [ring.mock.request :as mock]
            [request-header.core :refer [app]]))

(deftest test-app
  (testing "whoami route"
    (let [response (app (->
                         (mock/request :get "/api/whoami")
                         (mock/header "user-agent" "Mozilla/5.0 (X11; Linux x86_64)")
                         (mock/header "accept-language" "en-US")))]
      (is (= (:status response) 200))
      (is (= (slurp (:body response)) "{\"ipaddress\":\"localhost\",\"language\":\"Mozilla\\/5.0 (X11; Linux x86_64)\",\"software\":\"en-US\"}"))))

  (testing "not-found route"
    (let [response (app (mock/request :get "/invalid"))]
      (is (= (:status response) 404)))))
