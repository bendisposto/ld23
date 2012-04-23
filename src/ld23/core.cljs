(ns ld23.core
  (:require [clojure.browser.repl :as repl]))

(set! *print-fn* #(.log js/console %))

(repl/connect "http://localhost:9000/repl")

(def debug? true)

(def width 640)
(def height 480)
(def scale 1)
(def game-name "Crashed on Minutiae Prime")
