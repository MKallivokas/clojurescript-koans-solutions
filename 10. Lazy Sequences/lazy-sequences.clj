;; 1
;; http://clojurescriptkoans.com/#lazy-sequences/1
;; There are many ways to generate a sequence

(= '(1 2 3 4) (range 1 5))



;; 2
;; http://clojurescriptkoans.com/#lazy-sequences/2
;; The range starts at the beginning by default

(= '(0 1 2 3 4) (range 5))



;; 3
;; http://clojurescriptkoans.com/#lazy-sequences/3
;; Only take what you need when the sequence is large

(= [0 1 2 3 4 5 6 7 8 9] (take 10 (range 100)))



;; 4
;; http://clojurescriptkoans.com/#lazy-sequences/4
;; Or limit results by dropping what you don't need

(= [95 96 97 98 99] (drop 95 (range 100)))



;; 5
;; http://clojurescriptkoans.com/#lazy-sequences/5
;; Iteration provides an infinite lazy sequence

(= '(0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19) (take 20 (iterate inc 0)))



;; 6
;; http://clojurescriptkoans.com/#lazy-sequences/6
;; Repetition is key

(= [:a :a :a :a :a :a :a :a :a :a] (repeat 10 :a))



;; 7
;; http://clojurescriptkoans.com/#lazy-sequences/7
;; Iteration can be used for repetition

(= (repeat 100 :foo) (take 100 (iterate (fn [x] x) :foo)))
