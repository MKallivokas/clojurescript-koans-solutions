(defn hello
  ([] "Hello World!")
  ([a] (str "Hello, you silly " a "."))
  ([a & more] (str "Hello to this group: "
                   (apply str
                          (interpose ", " (concat (list a) more)))
                   "!")))

;; 1
;; http://clojurescriptkoans.com/#runtime-polymorphism/1
;; Some functions can be used in different ways - with no arguments

(= "Hello World!" (hello))



;; 2
;; http://clojurescriptkoans.com/#runtime-polymorphism/2
;; With one argument

(= "Hello, you silly world." (hello "world"))



;; 3
;; http://clojurescriptkoans.com/#runtime-polymorphism/3
;; Or with many arguments

(= "Hello to this group: Peter, Paul, Mary!" (hello "Peter" "Paul" "Mary"))



;; 4
;; http://clojurescriptkoans.com/#runtime-polymorphism/4
;; Multimethods allow more complex dispatching

(defmulti diet (fn [x] (:eater x)))

(defmethod diet :herbivore [a] "Bambi eats veggies.")

(= "Bambi eats veggies." (diet {:species "deer", :name "Bambi", :age 1, :eater :herbivore}))



;; 5
;; http://clojurescriptkoans.com/#runtime-polymorphism/5
;; Different methods are used depending on the dispatch function result

(defmethod diet :carnivore [a] "Simba eats animals.")

(= "Simba eats animals." (diet {:species "lion", :name "Simba", :age 1, :eater :carnivore}))



;; 6
;; http://clojurescriptkoans.com/#runtime-polymorphism/6
;; You may use a default method when no others match

(defmethod diet :default [a] "I don't know what Rich Hickey eats.")

(= "I don't know what Rich Hickey eats." (diet {:name "Rich Hickey"}))
