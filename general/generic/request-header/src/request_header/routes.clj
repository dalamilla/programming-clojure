(ns request-header.routes
  (:require [compojure.core :refer [GET context defroutes]]
            [compojure.route :as route]
            [request-header.handlers :as handlers]))

(defroutes app
  (context "/api" []
    (GET "/whoami" [] handlers/whoami))
  (route/not-found "Not Found"))
