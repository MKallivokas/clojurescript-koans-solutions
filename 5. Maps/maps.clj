;; 1
;; http://clojurescriptkoans.com/#maps/1
;; Don't get lost when creating a map

(= {:a 1, :b 2} (hash-map :a 1 :b 2))



;; 2
;; http://clojurescriptkoans.com/#maps/2
;; A value must be supplied for each key

(= {:a 1} (hash-map :a 1))



;; 3
;; http://clojurescriptkoans.com/#maps/3
;; The size is the number of entries

(= 2 (count {:a 1, :b 2}))



;; 4
;; http://clojurescriptkoans.com/#maps/4
;; You can look up the value for a given key

(= 2 (get {:a 1, :b 2} :b))



;; 5
;; http://clojurescriptkoans.com/#maps/5
;; Maps can be used as functions to do lookups

(= 1 ({:a 1, :b 2} :a))



;; 6
;; http://clojurescriptkoans.com/#maps/6
;; And so can keywords

(= 1 (:a {:a 1, :b 2}))



;; 7
;; http://clojurescriptkoans.com/#maps/7
;; But map keys need not be keywords

(= "Vancouver" ({2006 "Torino", 2010 "Vancouver", 2014 "Sochi"} 2010))



;; 8
;; http://clojurescriptkoans.com/#maps/8
;; You may not be able to find an entry for a key

(= nil (get {:a 1, :b 2} :c))



;; 9
;; http://clojurescriptkoans.com/#maps/9
;; But you can provide your own default

(= :key-not-found (get {:a 1, :b 2} :c :key-not-found))



;; 10
;; http://clojurescriptkoans.com/#maps/10
;; You can find out if a key is present

(= true (contains? {:a nil, :b nil} :b))



;; 11
;; http://clojurescriptkoans.com/#maps/11
;; Or if it is missing

(= false (contains? {:a nil, :b nil} :c))



;; 12
;; http://clojurescriptkoans.com/#maps/12
;; Maps are immutable, but you can create a new and improved version

(= {1 "January", 2 "February"} (assoc {1 "January"} 2 "February"))



;; 13
;; http://clojurescriptkoans.com/#maps/13
;; You can also create a new version with an entry removed

(= {1 "January"} (dissoc {1 "January", 2 "February"} 2))



;; 14
;; http://clojurescriptkoans.com/#maps/14
;; Often you will need to get the keys, but the order is undependable

(= (list 2006 2010 2014) (sort (keys {2010 "Vancouver", 2014 "Sochi", 2006 "Torino"})))



;; 15
;; http://clojurescriptkoans.com/#maps/15
;; You can get the values in a similar way

(= (list "Sochi" "Torino" "Vancouver") (sort (vals {2006 "Torino", 2010 "Vancouver", 2014 "Sochi"})))
