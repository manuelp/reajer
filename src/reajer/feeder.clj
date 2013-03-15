(ns reajer.feeder
  (:use feedparser-clj.core)
  (:require [reajer.models.db :as db]))

(defn first-entry [feed-struct]
  (:value (:description (first (:entries feed-struct)))))

(defn render-feed [feed-id]
  (parse-feed (:uri (db/get-feed feed-id))))
