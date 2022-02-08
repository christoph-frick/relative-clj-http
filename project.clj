(defproject net.ofnir/relative-clj-http "0.1.4"
  :description "Helpers to provide defaults and relative modifications around clj-http"
  :url "https://github.com/christoph-frick/relative-clj-http"
  :license {:name "MIT"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [clj-http/clj-http "3.12.3"]]
  :deploy-repositories {"releases" {:url "https://clojars.org/repo/" :creds :gpg}})
