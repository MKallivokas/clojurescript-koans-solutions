(def test-address
  {:street-address "123 Test Lane"
   :city "Testerville"
   :state "TX"})

;; 1
;; http://clojurescriptkoans.com/#destructuring/1
;; Destructuring is an arbiter: it breaks up arguments

(= ":bar:foo" ((fn [[a b]] (str b a)) [:foo :bar]))



;; 2
;; http://clojurescriptkoans.com/#destructuring/2
;; Whether in function definitions

(= (str "First comes love, " "then comes marriage, " "then comes Clojure with the baby carriage")
   ((fn [[a b c]] (str "First comes " a ", " "then comes " b ", " "then comes " c " with the baby carriage")) ["love" "marriage" "Clojure"]))



;; 3
;; http://clojurescriptkoans.com/#destructuring/3
;; Or in let expressions

(= "Rich Hickey aka The Clojurer aka Go Time aka Macro Killah"
   (let [[first-name last-name & aliases] (list "Rich" "Hickey" "The Clojurer" "Go Time" "Macro Killah")]
     (str first-name " " last-name " aka " (apply str (interpose " aka " aliases)))))



;; 4
;; http://clojurescriptkoans.com/#destructuring/4
;; You can regain the full argument if you like arguing

(= {:original-parts ["Stephen" "Hawking"], :named-parts {:first "Stephen", :last "Hawking"}}
   (let [[first-name last-name :as full-name] ["Stephen" "Hawking"]]
     {:original-parts full-name,
      :named-parts {:first first-name,
                    :last last-name}}))



;; 5
;; http://clojurescriptkoans.com/#destructuring/5
;; Break up maps by key

(= "123 Test Lane, Testerville, TX"
  (let [{street-address :street-address, city :city, state :state} test-address]
    (str street-address ", " city ", " state)))



;; 6
;; http://clojurescriptkoans.com/#destructuring/6
;; Or more succintly

(= "123 Test Lane, Testerville, TX"
   (let [{:keys [street-address city state]} test-address]
     (str street-address ", " city ", " state)))



;; 7
;; http://clojurescriptkoans.com/#destructuring/7
;; All together now!

;; For some reason the folllowing answer throws an error
;; but if you run it through a REPL returns true
(= "Test Testerson, 123 Test Lane, Testerville, TX"
   (#(str (apply str (interpose " " %1)) ", "
          (let [values (vals %2)]
            (apply str (interpose ", " values))))
    ["Test" "Testerson"] test-address))

;; PASSES clojureScript koans
(= "Test Testerson, 123 Test Lane, Testerville, TX"
   (#(str (apply str (interpose " " %1)) ", "
          (let [{:keys [street-address city state]} %2]
            (str street-address ", " city ", " state)))
    ["Test" "Testerson"] test-address))
