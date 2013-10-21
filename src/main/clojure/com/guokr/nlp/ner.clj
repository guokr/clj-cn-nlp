(ns com.guokr.nlp.ner)

(defn ner [text] (.recognize com.guokr.nlp.ner.__NER__/INSTANCE text))
