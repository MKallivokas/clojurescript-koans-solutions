(defn explain-defcon-level [exercise-term]
  (case exercise-term
    :fade-out          :you-and-what-army
    :double-take       :call-me-when-its-important
    :round-house       :o-rly
    :fast-pace         :thats-pretty-bad
    :cocked-pistol     :sirens
    :say-what?))

;; 1
;; http://clojurescriptkoans.com/#conditionals/1
;; You will face many decisions

(= :a (if (false? (= 4 5)) :a :b))



;; 2
;; http://clojurescriptkoans.com/#conditionals/2
;; Some of them leave you no alternative

(= [] (if (> 4 3) []))



;; 3
;; http://clojurescriptkoans.com/#conditionals/3
;; And in such a situation you may have nothing

(= nil (if (nil? 0) [:a :b :c]))



;; 4
;; http://clojurescriptkoans.com/#conditionals/4
;; In others your alternative may be interesting

(= :glory (if (not (empty? ())) :doom :glory))



;; 5
;; http://clojurescriptkoans.com/#conditionals/5
;; You may have a multitude of possible paths

(let [x 5] (= :your-road (cond
                          (= x 1) :road-not-taken
                          (= x 2) :another-road-not-taken
                          :else :your-road)))



;; 6
;; http://clojurescriptkoans.com/#conditionals/6
;; Or your fate may be sealed

(= 'doom (if-not (zero? 0) 'doom 'doom))



;; 7
;; http://clojurescriptkoans.com/#conditionals/7
;; In case of emergency, sound the alarms

(= :sirens (explain-defcon-level :cocked-pistol))



;; 8
;; http://clojurescriptkoans.com/#conditionals/8
;; But admit it when you don't know what to do

(= :say-what? (explain-defcon-level :yo-mama))
