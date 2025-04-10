(defproject request-header "0.1.0-SNAPSHOT"
  :description "Request Header"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.12.0"]
                 [compojure "1.6.1"]
                 [ring/ring-defaults "0.3.2"]
                 [org.clojure/data.json "2.5.1"]]
  :plugins [[lein-ring "0.12.5"]
            [dev.weavejester/lein-cljfmt "0.13.0"]
            [com.github.clj-kondo/lein-clj-kondo "0.2.5"]]
  :ring {:handler request-header.core/app}
  :cljfmt {:load-config-file? true}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.2"]]}})
