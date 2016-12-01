(ns iot-data-generator.core
  (:gen-class))

(defn -main
  "iot-data-generator"
  [& args]
  (println (str "iot-data-generator " (clojure.string/join ", " args))))
