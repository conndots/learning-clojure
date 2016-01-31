(defn get-words [text]
  (re-seq #"\w+" text))

(defn count-words-sequential [pages]
  (frequencies (mapcat get-words pages)))

(defn count-words [pages]
  (reduce (partial merge-with +)
          (pmap count-words-sequential (partition-all 100 pages))))
