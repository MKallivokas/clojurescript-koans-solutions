(def atomic-clock (atom 0))

;; 1
;; http://clojurescriptkoans.com/#atoms/1
;; Atoms are references to values

(= 0 (deref atomic-clock))



;; 2
;; http://clojurescriptkoans.com/#atoms/2
;; You can get its value more succintly

(= 0  @atomic-clock)



;; 3
;; http://clojurescriptkoans.com/#atoms/3
;; You can even change at the swap meet

(= 1 (do (swap! atomic-clock inc)
         @atomic-clock))



;; 4
;; http://clojurescriptkoans.com/#atoms/4
;; Keep taxes out of this: swapping requires no transaction

;; Run this if you are running on REPL to reset the atom
(reset! atomic-clock 0)

;; The actual solution
(= 5 (do (swap! atomic-clock + 5)
         @atomic-clock))



;; 5
;; http://clojurescriptkoans.com/#atoms/5
;; Any number of arguments might happen during a swap

(reset! atomic-clock 0)

(= 15 (do (swap! atomic-clock + 1 2 3 4 5)
          @atomic-clock))



;; 6
;; http://clojurescriptkoans.com/#atoms/6
;; Atomic atoms are atomic

(reset! atomic-clock 0)

(= 0 (do (compare-and-set! atomic-clock 100 :fin)
         @atomic-clock))



;; 7
;; http://clojurescriptkoans.com/#atoms/7
;; When your expectations are aligned with reality things, proceed that way

(reset! atomic-clock 0)

(= :fin (do (compare-and-set! atomic-clock 0 :fin)
            @atomic-clock))
