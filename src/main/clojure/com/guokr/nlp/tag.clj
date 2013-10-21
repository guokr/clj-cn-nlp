(ns com.guokr.nlp.tag)

(defn tag [text] (.tag com.guokr.nlp.tag.__TAG__/INSTANCE text))
