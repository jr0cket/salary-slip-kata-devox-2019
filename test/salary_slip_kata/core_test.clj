(ns salary-slip-kata.core-test
  (:require [clojure.test :refer :all]
            [salary-slip-kata.core :as sut]))

;; employee has
;; - Employee Id,
;; - Employee Name
;; - Annual Gross Salary

;; example salary slip
;; Employee ID: 12345
;; Employee Name: John J Doe
;; Gross Salary: £3750.00
;; National Insurance contributions: £352.73
;; Tax-free allowance: £916.67
;; Taxable income: £2,833.33
;; Tax payable: £600.00

(deftest salary-slip-test
  (let [employee [1233 "John J Doe" 24000]]
    (testing "Produce a salary slip for a person"
      (is (= {:employee-id        1233
              :employee-name      "John J Doe"
              :gross-salary       3730
              :national-insurance 352.73
              :tax-free-allowance 916.67
              :taxable-income     2833.33
              :tax-payable        600}
             (sut/salary-slip employee))))))
