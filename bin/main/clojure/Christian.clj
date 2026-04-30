(ns Christian)

;; Christian made these functions


;; Append Function
(defn append [lizt1 lizt2]
	(if (empty? lizt1) 
		lizt2
		(cons (first lizt1) (append (rest lizt1) lizt2))
	)
)

;; Member Function
(defn member [atm lizt]
	(if (empty? lizt)
		false
		(if (= atm (first lizt)) 
			true
			(member atm (rest lizt))
		)
	)
)

;; Map Function
(defn map [fun lizt]
	(if (empty? lizt)
		'()
		(cons (fun (first lizt)) (map fun (rest lizt)))
	)
)