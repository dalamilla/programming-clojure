(ns request-header.core
  (:gen-class)
  (:require [clojure.pprint]
            [request-header.routes :as routes]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(def app
  (wrap-defaults routes/app site-defaults))
