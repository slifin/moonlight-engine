(ns core
  (:gen-class)
  (:require [clojure.edn :as edn]
            [honeysql.core :as sql]
            [clojure.data.json :as json]))

(defn -main [input]
  (->> input (edn/read-string {:readers *data-readers*}) sql/format json/write-str print)
  (flush))
