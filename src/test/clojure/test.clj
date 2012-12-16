(ns test
  (:use clojure.test)
  (:require [com.guokr.nlp.seg :as seg])
  (:require [com.guokr.nlp.tag :as tag])
  (:require [com.guokr.nlp.ner :as ner]))

(deftest mytest []
  (is (= "这 是 个 测试" (seg/seg "这是个测试")))
  (is (= "这/O 是/O 个/O 测试/O" (ner/ner "这是个测试")))
  (is (= "这#PN 是#VC 个#M 测试#NN" (tag/tag "这是个测试"))))

