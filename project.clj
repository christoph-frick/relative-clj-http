(defproject net.ofnir/relative-clj-http "0.1.2-SNAPSHOT"
  :description "Helpers to provide defaults and relative modifications around clj-http"
  :url "https://github.com/christoph-frick/relative-clj-http"
  :license {:name "MIT"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [clj-http "3.9.1"]]
  :plugins [[lein-codox "0.10.3"]]
  :deploy-repositories [["releases" :clojars]]
  :codox {:output-path "docs"})
