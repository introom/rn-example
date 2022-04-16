(ns app.example
 (:require
   [cljs.core.async :refer [go]]
   [cljs.core.async.interop :refer [<p!]]))

(go
  (println (<p! (js/Promise.resolve 42))))