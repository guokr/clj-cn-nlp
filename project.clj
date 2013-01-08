(defproject com.guokr/clj-cn-nlp "0.1.0"

    :description "A clojure wrapper of Stanford NLP packages for Simplified Chinese users"
    :url "https://github.com/guokr/clj-cn-nlp/"

    :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments "same as Clojure"}

    :dependencies [[org.clojure/clojure "1.4.0"]
                   [com.guokr/stan-cn-nlp "0.0.2-SNAPSHOT"]]

    :source-paths ["src/main/clojure"]
    :java-source-paths ["src/main/java"]
    :resource-paths ["src/main/resources"]

    :test-paths ["src/test/clojure" "src/test/java"]

    :compile-path "targets/classes"
    :target-path "targets/"
    :javac-options ["-target" "1.6" "-source" "1.6" "-Xlint:-options"]

    :jvm-opts ["-Xmx2g"])

