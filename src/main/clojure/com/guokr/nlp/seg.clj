(ns com.guokr.nlp.seg)

(defn seg [text] (.segment com.guokr.nlp.seg.__SEG__/INSTANCE text))
