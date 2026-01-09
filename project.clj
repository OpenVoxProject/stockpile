(def i18n-version "1.0.2")

(defproject org.openvoxproject/stockpile "1.0.1-SNAPSHOT"
  :description "Simple, durable Clojure queuing library"
  :url "https://github.com/openvoxproject/stockpile"
  :license {:name "Apache License Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.openvoxproject/i18n ~i18n-version]
                 [org.clojure/clojure "1.12.4"]]
  :plugins [[org.openvoxproject/i18n ~i18n-version]]
  :profiles {:dev {:dependencies [[org.apache.commons/commons-lang3 "3.18.0"]]}}

  :deploy-repositories [["releases" {:url "https://clojars.org/repo"
                                     :username :env/CLOJARS_USERNAME
                                     :password :env/CLOJARS_PASSWORD
                                     :sign-releases false}]])
