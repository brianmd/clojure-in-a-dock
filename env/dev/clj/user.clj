(ns user
  (:require [mount.core :as mount]
            clojure-in-a-dock2.core))

(defn start []
  (mount/start-without #'clojure-in-a-dock2.core/repl-server))

(defn stop []
  (mount/stop-except #'clojure-in-a-dock2.core/repl-server))

(defn restart []
  (stop)
  (start))


