(defproject com.cgore/binance "0.1.0-SNAPSHOT"
  :description "Clojure interface to the Binance.com API"
  :url "https://github.com/cgore/clojure-binance"
  :license {:name "BSD-3-Clause"
            :url "https://opensource.org/licenses/BSD-3-Clause"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [cheshire "5.8.0"] ; https://github.com/dakrone/cheshire
                 [clj-http "3.7.0"] ; https://github.com/dakrone/clj-http
                 [uri "1.1.0"]]) ; https://github.com/codonnell/uri
