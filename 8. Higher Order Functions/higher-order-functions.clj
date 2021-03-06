;; 1
;; http://clojurescriptkoans.com/#higher-order-functions/1
;; The map function relates a sequence to another

(= '(4 8 12) (map (fn [x] (* 4 x)) [1 2 3]))



;; 2
;; http://clojurescriptkoans.com/#higher-order-functions/2
;; You may create that mapping

(= '(1 4 9 16 25) (map (fn [x] (* x x)) [1 2 3 4 5]))



;; 3
;; http://clojurescriptkoans.com/#higher-order-functions/3
;; Or use the names of existing functions

(= '(false false true false false) (map nil? [:a :b nil :c :d]))



;; 4
;; http://clojurescriptkoans.com/#higher-order-functions/4
;; A filter can be strong

(= '() (filter (fn [x] false) '(:anything :goes :here)))



;; 5
;; http://clojurescriptkoans.com/#higher-order-functions/5
;; Or very weak

(= '(:anything :goes :here) (filter (fn [x] true) '(:anything :goes :here)))



;; 6
;; http://clojurescriptkoans.com/#higher-order-functions/6
;; Or somewhere in between

(= [10 20 30] (filter (fn [x] (< x 40)) [10 20 30 40 50 60 70 80]))



;; 7
;; http://clojurescriptkoans.com/#higher-order-functions/7
;; Maps and filters may be combined

(= [10 20 30] (map (fn [x] (* x 10)) (filter (fn [x] (< x 4)) [1 2 3 4 5 6 7 8])))



;; 8
;; http://clojurescriptkoans.com/#higher-order-functions/8
;; Reducing can increase the result

(= 24 (reduce (fn [a b] (* a b)) [1 2 3 4]))



;; 9
;; http://clojurescriptkoans.com/#higher-order-functions/9
;; You can start somewhere else

(= 2400 (reduce (fn [a b] (* a b)) 100 [1 2 3 4]))



;; 10
;; http://clojurescriptkoans.com/#higher-order-functions/10
;; Numbers are not the only things one can reduce

(= "longest" (reduce (fn [a b] (if (< (count a) (count b)) b a)) ["which" "word" "is" "longest"]))
