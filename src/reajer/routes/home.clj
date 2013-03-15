(ns reajer.routes.home
  (:use compojure.core)
  (:require [reajer.views.layout :as layout]
            [reajer.util :as util]
            [reajer.feeder :as feeder]))

(defn home-page []
  (layout/render
    "home.html" {:content (util/md->html "/md/docs.md")}))

(defn about-page []
  (layout/render "about.html"))

(defn feed-page []
  (layout/render
    "feed.html" {:content (feeder/first-entry (feeder/render-feed 1))}))

(defroutes home-routes
  (GET "/" [] (home-page))
  (GET "/about" [] (about-page))
  (GET "/feed" [] (feed-page)))
