;; 1
;; http://clojurescriptkoans.com/#vectors/1
;; You can use vectors in clojure as array-like structures

(= 1 (count [42]))



;; 2
;; http://clojurescriptkoans.com/#vectors/2
;; You can create a vector from a list

(= [1] (vec '(1)))



;; 3
;; http://clojurescriptkoans.com/#vectors/3
;; Or from some elements

(= [nil nil] (vector nil nil))



;; 4
;; http://clojurescriptkoans.com/#vectors/4
;; But you can populate it with any number of elements at once

(= [1 2] (vec '(1 2)))



;; 5
;; http://clojurescriptkoans.com/#vectors/5
;; Conjoining to a vector is different than to a list

(= [111 222 333] (conj [111 222] 333))



;; 6
;; http://clojurescriptkoans.com/#vectors/6
;; You can get the first element of a vector like so

(= :peanut (first [:peanut :butter :and :jelly]))



;; 7
;; http://clojurescriptkoans.com/#vectors/7
;; And the last in a similar fashion

(= :jelly  (last [:peanut :butter :and :jelly]))



;; 8
;; http://clojurescriptkoans.com/#vectors/8
;; Or any index if you wish

(= :jelly (nth [:peanut :butter :and :jelly] 3))



;; 9
;; http://clojurescriptkoans.com/#vectors/9
;; You can also slice a vector

(= [:butter :and] (subvec [:peanut :butter :and :jelly] 1 3))



;; 10
;; http://clojurescriptkoans.com/#vectors/10
;; Equality with collections is in terms of values

(= (list 1 2 3) (vector 1 2 3))
