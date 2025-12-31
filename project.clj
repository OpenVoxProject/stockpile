(defproject org.openvoxproject/stockpile "0.1.0-SNAPSHOT"
  :description "Simple, durable Clojure queuing library"
  :url "https://github.com/openvoxproject/stockpile"
  :license {:name "Apache License Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.openvoxproject/i18n "0.9.4"]
                 [org.clojure/clojure "1.8.0"]]
  :plugins [[org.openvoxproject/i18n "0.9.4"]]
  :profiles {:dev {:dependencies [[org.apache.commons/commons-lang3 "3.4"]]}}

  :deploy-repositories [["releases" {:url "https://clojars.org/repo"
                                     :username :env/CLOJARS_USERNAME
                                     :password :env/CLOJARS_PASSWORD
                                     :sign-releases false}]])
