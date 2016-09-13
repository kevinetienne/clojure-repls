;; java -cp clojure-1.8.0.jar:. -Dclojure.server.repl="{:port 5555 :accept wrapple/uprepl}" clojure.main
;; nc localhost 5555

(ns wrapple
  (:require [clojure.string :as str]))

(defn prompt-and-read []
  (print "~> ")
  (flush)
  (read-line))

(defn uprepl []
  (loop [input (prompt-and-read)]
    (-> input
        str/upper-case
        println)
    (recur (prompt-and-read))))
