(defproject com.guokr.nlp/clj-cn-nlp "0.1.0"
    :description "A clojure wrapper of Stanford NLP packages for Simplified Chinese users"
    :dependencies [[org.clojure/clojure "1.4.0"]
                   [edu.stanford.nlp/stanford-corenlp "1.3.3"]
                   [com.guokr/stan-cn-nlp "0.0.1"]]

    :source-paths ["src/main/clojure"]
    :java-source-paths ["src/main/java"]
    :resource-paths ["src/main/resources"]

    :test-paths ["src/test/clojure" "src/test/java"]

    :compile-path "targets/classes"
    :target-path "targets/"
    :javac-options ["-target" "1.6" "-source" "1.6" "-Xlint:-options"]

    :jvm-opts ["-Xmx2g"])

