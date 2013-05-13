(defn fizz [i]
  (if(= (mod i 3) 0)
    "Fizz"))

(defn buzz [i]
  (if(= (mod i 5) 0)
    "Buzz"))

(defn join [a b]
  (str a b))

(defn run-rules [numbers]
  (map join (map fizz numbers) (map buzz numbers)))

(defn number [s n]
  (if (= s "")
    n
    s))

(defn fizzbuzz [start end]
  (let
    [numbers (range start end)]
    (doall
      (map println
        (map number
           (run-rules numbers) numbers)))))

(fizzbuzz 1 100)
