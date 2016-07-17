(ns clojure-in-a-dock2.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [clojure-in-a-dock2.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[clojure-in-a-dock2 started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[clojure-in-a-dock2 has shut down successfully]=-"))
   :middleware wrap-dev})
