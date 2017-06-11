;; 1
;; http://clojurescriptkoans.com/#lists/1
;; Lists can be expressed by function or a quoted form

(= '(1 2 3 4 5) (list 1 2 3 4 5))



;; 2
;; http://clojurescriptkoans.com/#lists/2
;; They are Clojure seqs (sequences), so they allow access to the first

(= 1 (first '(1 2 3 4 5)))



;; 3
;; http://clojurescriptkoans.com/#lists/3
;; As well as the rest

(= '(2 3 4 5) (rest '(1 2 3 4 5)))



;; 4
;; http://clojurescriptkoans.com/#lists/4
;; Count your blessings

(= 3 (count '(dracula dooku chocula)))



;; 5
;; http://clojurescriptkoans.com/#lists/5
;; Before they are gone

(= 0 (count '()))



;; 6
;; http://clojurescriptkoans.com/#lists/6
;; The rest, when nothing is left, is empty

(= '() (rest '(100)))



;; 7
;; http://clojurescriptkoans.com/#lists/7
;; Construction by adding an element to the front is easy

(= '(:a :b :c :d :e) (cons :a '(:b :c :d :e)))



;; 8
;; http://clojurescriptkoans.com/#lists/8
;; Conjoining an element to a list is strikingly similar

(= '(:a :b :c :d :e) (conj '(:b :c :d :e) :a))



;; 9
;; http://clojurescriptkoans.com/#lists/9
;; You can use a list like a stack to get the first element

(= :a (peek '(:a :b :c :d :e)))



;; 10
;; http://clojurescriptkoans.com/#lists/10
;; Or the others

(= '(:b :c :d :e) (pop '(:a :b :c :d :e)))
