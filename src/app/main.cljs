(ns app.main
  (:require
   [reagent.core :as r]
   ["react-native" :as rn]))

(defn- app
  []
  [:> rn/Text "asdfkkkkkkk"])

(defn register-component {:dev/after-load true}
  []
  (.registerComponent ^js (.-AppRegistry rn)
                      "sample"
                      ;; wrap in :>f to make a functional component
                      #(r/reactify-component (constantly [:f> app]))))

(defn ^:export -main []
  (register-component))