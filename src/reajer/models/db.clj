(ns reajer.models.db
  (:use korma.core
        [korma.db :only (defdb)])
  (:require [reajer.models.schema :as schema]))

(defdb db schema/db-spec)

(declare users feeds)

(defentity users
  (has-many feeds))

(defn create-user [user]
  (insert users
          (values user)))

(defn get-user [id]
  (first (select users
                 (where {:id id})
                 (limit 1))))

(defentity feeds
  (belongs_to user))

(defn get-feed [id]
  (first (select feeds
                  (where {:id id})
                  (limit 1))))
