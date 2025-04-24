(ns {{scratch/ns}}
  (:require [nrepl.cmdline :as nrepl]))

(defn -main [& _]
  (nrepl/-main)
  @(promise))
