(defn reduce-sum [numbers]
  (reduce (fn [acc x] (+ acc x)) 0 numbers))

(defn reduce-sum [numbers]
  (reduce #(+ %1 %2) 0 numbers))

