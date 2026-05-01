(ns Michael
	(:require [Christian :refer [member]]))


;; Michael made these functions


;; Same Function
(defn same [lizt1 lizt2]
	(cond
		(and (empty? lizt1) (empty? lizt2)) true
		(empty? lizt2) 
			false
		(= (first lizt1) (first lizt2)) (same (rest lizt1) (rest lizt2))
	:else 
		false
	)
)


(defn intersect [lizt1 lizt2]
	(cond
		(empty? lizt1) 
			'()
		(member (first lizt1) lizt2) 
			(cons (first lizt1) 
				(intersect(rest lizt1) lizt2))
		:else 
			(intersect (rest lizt1) lizt2)
	)
)
	