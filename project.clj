(defproject org.openvoxproject/stockpile "1.0.1-SNAPSHOT"
  :description "Simple, durable Clojure queuing library"
  :url "https://github.com/openvoxproject/stockpile"
  :license {:name "Apache License Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.openvoxproject/i18n "1.0.1"]
                 [org.clojure/clojure "1.11.2"]] ;; Match what is used in clj-parent
  :plugins [[org.openvoxproject/i18n "1.0.1"]]
  :profiles {:dev {:dependencies [[org.apache.commons/commons-lang3 "3.18.0"]]}}

  :deploy-repositories [["releases" {:url "https://clojars.org/repo"
                                     :username :env/CLOJARS_USERNAME
                                     :password :env/CLOJARS_PASSWORD
                                     :sign-releases false}]])
