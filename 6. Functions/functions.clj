(defn multiply-by-ten [n] (* 10 n))

(defn square [n] (* n n))

;; 1
;; http://clojurescriptkoans.com/#functions/1
;; Calling a function is like giving it a hug with parentheses

(= 81 (square 9))



;; 2
;; http://clojurescriptkoans.com/#functions/2
;; Functions are usually defined before they are used

(= 20 (multiply-by-ten 2))



;; 3
;; http://clojurescriptkoans.com/#functions/3
;; But they can also be defined inline

(= 10 ((fn [n] (* 5 n)) 2))



;; 4
;; http://clojurescriptkoans.com/#functions/4
;; Or using an even shorter syntax

(= 60 (#(* 15 %) 4))



;; 5
;; http://clojurescriptkoans.com/#functions/5
;; Even anonymous functions may take multiple arguments

(= 15 (#(+ %1 %2 %3) 4 5 6))



;; 6
;; http://clojurescriptkoans.com/#functions/6
;; Arguments can also be skipped

(= 30 (#(* 15 %2) 1 2))



;; 7
;; http://clojurescriptkoans.com/#functions/7
;; One function can beget another

(= 9 (((fn []
         (fn [& args] (reduce + args)))) 4 5))



;; 8
;; http://clojurescriptkoans.com/#functions/8
;; Functions can also take other functions as input

(= 20 ((fn [f] (f 4 5)) *))



;; 9
;; http://clojurescriptkoans.com/#functions/9
;; Higher-order functions take function arguments

(= 25 ((fn [f] (f 5)) (fn [n] (* n n))))



;; 10
;; http://clojurescriptkoans.com/#functions/10
;; But they are often better written using the names of functions

(= 25 ((fn [f] (f 5)) square))

