(defproject com.guokr/clj-cn-nlp "0.2.2"

    :description "A clojure wrapper of Stanford NLP packages for Simplified Chinese users"
    :url "https://github.com/guokr/clj-cn-nlp/"

    :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments "same as Clojure"}

    :dependencies [[org.clojure/clojure "1.5.1"]
                   [com.guokr/stan-cn-com "0.0.6"]
                   [com.guokr/stan-cn-seg "0.0.6"]
                   [com.guokr/stan-cn-ner "0.0.6"]
                   [com.guokr/stan-cn-tag "0.0.6"]]

    :source-paths ["src/main/clojure"]
    :java-source-paths ["src/main/java"]
    :resource-paths ["src/main/resources"]

    :test-paths ["src/test/clojure" "src/test/java"]

    :compile-path "targets/classes"
    :target-path "targets/"

    :jvm-opts ["-Xmx3g"])

