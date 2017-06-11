;; 1
;; http://clojurescriptkoans.com/#equality/1
;; We shall contemplate truth by testing reality, via equality

(= true true)



;; 2
;; http://clojurescriptkoans.com/#equality/2
;; To understand reality, we must compare our expectations against reality

(= 2 (+ 1 1))



;; 3
;; http://clojurescriptkoans.com/#equality/3
;; You can test equality of many things

(= (+ 3 4) 7 (+ 2 5))



;; 4
;; http://clojurescriptkoans.com/#equality/4
;; But you may not string yourself along

(= false (= 2 "2"))



;; 5
;; http://clojurescriptkoans.com/#equality/5
;; Something is not equal to nothing

(= true  (not (= 1 nil)))



;; 6
;; http://clojurescriptkoans.com/#equality/6
;; Strings, and keywords, and symbols: oh my!

(= false (= "foo" :foo 'foo))



;; 7
;; http://clojurescriptkoans.com/#equality/7
;; Make a keyword with your keyboard

(= :foo (keyword :foo))



;; 8
;; http://clojurescriptkoans.com/#equality/8
;; Symbolism is all around us

(= 'foo (symbol "foo"))



;; 9
;; http://clojurescriptkoans.com/#equality/9
;; When things cannot be equal, they must be different

(not= :fill-in-the-blank false)