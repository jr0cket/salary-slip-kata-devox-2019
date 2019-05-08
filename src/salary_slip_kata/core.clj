(ns salary-slip-kata.core)

;; Developer Anarchy by Fred George
;; - made devs write the same solution in different languages
;; -- helps devs master the business domain
;; -- helps devs master technology domain

;; Crazy book idea - 7 Emacs setups in 7 weeks



(defn- national-insurance-contribution
  "Calculate the national insurance contribution due for a given annual salary.

  ---------------------+-------------------------+--------
  Band                 | NI deductible income    | NI Rate
  ---------------------+-------------------------+--------
  No contributions     | Up to £8,060.00         |    0%
  Basic contributions  | £8,060.00 to £43,000.00 |   12%
  Higher contributions | over £43,000.00         |    2%
  ---------------------+-------------------------+-------- "

  [annual-gross-salary]
  ;; add a cond statement to return the calculate the value with respect to the band.
  (* annual-gross-salary 0.12))


;; taxable income
;; ---------------------+---------------------------+---------
;; Band                 | Taxable income            | Tax rate
;; ---------------------+---------------------------+---------
;; Personal Allowance*  | Up to £11,000.00          |    0%
;; Basic rate           | £11,000.00 to £43,000.00  |   20%
;; Higher rate          | £43,000.00 to £150,000.00 |   40%
;; Additional rate      | over £150,000.00          |   45%
;; ---------------------+---------------------------+---------




(defn salary-slip
  "Creates a salary slip for a person

  Specifically for employee of 24K annual salary"

  [{:keys [employee-id
           employee-name
           annual-gross-salary]}]
  (let [tax-free-allowance 11000
        taxable-income     (- annual-gross-salary
                              tax-free-allowance)]
    {:employee-id        employee-id
     :employee-name      employee-name
     :gross-salary       (/ annual-gross-salary 12)
     :national-insurance (national-insurance-contribution annual-gross-salary)
     :tax-free-allowance tax-free-allowance
     :taxable-income     taxable-income
     :tax-payable        (* taxable-income 0.20)}))

