(ns clojure-in-a-dock2.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[clojure-in-a-dock2 started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[clojure-in-a-dock2 has shut down successfully]=-"))
   :middleware identity})
