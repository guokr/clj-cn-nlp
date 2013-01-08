(ns com.guokr.nlp.ner)

(defn ner [text] (.recognize com.guokr.nlp.__PKG__/INSTANCE text))
