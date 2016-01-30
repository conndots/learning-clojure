(defn recursive-sum [numbers]
	(if (empty? numbers)
		0
		(+ (first numbers) (recursive-sum(rest numbers)))))

(defn iterative-sums
  [numbers]
  (loop [numbers numbers
         sum     0]
      (if (empty? numbers)
        sum
        (recur (rest numbers)
              (+ sum (first numbers))))))

(println (iterative-sums [4, 5, 1, 2]))
