(ns scratch
  (:require [bosquet.llm.generator :refer [generate llm]]))

(generate "Plesae convert the python code to Java:
```
x=1
```
")
