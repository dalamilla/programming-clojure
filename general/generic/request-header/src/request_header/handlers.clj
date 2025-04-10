(ns request-header.handlers
  (:require [clojure.data.json :refer [json-str]]
            [ring.util.io :refer [string-input-stream]]
            [ring.util.response :refer [get-header]]))

(defn whoami
  [request]
  {:status 200
   :headers {"Content-Type" "application/json; charset=utf-8"}
   :body (string-input-stream
          (json-str
           {:ipaddress (:remote-addr request)
            :language (get-header request "user-agent")
            :software (get-header request "accept-language")}))})
