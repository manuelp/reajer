(defproject
  reajer
  "0.1.0-SNAPSHOT"
  :dependencies
  [[org.clojure/clojure "1.5.1"]
   [lib-noir "0.4.9"]
   [compojure "1.1.5"]
   [ring-server "0.2.7"]
   [com.taoensso/timbre "1.5.2"]
   [com.taoensso/tower "1.2.0"]
   [markdown-clj "0.9.19"]
   [clabango "0.5"]
   [jayq "2.0.0"]
   [prismatic/dommy "0.0.2"]
   [org.clojure/java.jdbc "0.2.3"]
   [postgresql/postgresql "9.1-901.jdbc4"]
   [korma "0.3.0-RC2"]
   [org.clojars.scsibug/feedparser-clj "0.4.0"]
   [log4j
    "1.2.15"
    :exclusions
    [javax.mail/mail
     javax.jms/jms
     com.sun.jdmk/jmxtools
     com.sun.jmx/jmxri]]]
  :cljsbuild
  {:builds
   [{:source-path "src-cljs",
     :compiler
     {:pretty-print false,
      :output-to "resources/public/js/tetris.js",
      :optimizations :advanced}}]}
  :ring
  {:handler reajer.handler/war-handler,
   :init reajer.handler/init,
   :destroy reajer.handler/destroy}
  :profiles
  {:production
   {:ring
    {:open-browser? false, :stacktraces? false, :auto-reload? false}},
   :dev
   {:dependencies [[ring-mock "0.1.3"] [ring/ring-devel "1.1.8"]]}}
  :url
  "http://example.com/FIXME"
  :plugins
  [[lein-ring "0.8.3"] [lein-cljsbuild "0.2.10"]]
  :description
  "FIXME: write description"
  :min-lein-version "2.0.0")