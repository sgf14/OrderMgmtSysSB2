Maven Notes:

Note this is a Gradle project, but listing Maven equivalent commands for build and run

In CLI- assumes you have established Maven in system environmentals [Windows OS] so it can be run from CLI.
benfit of CLI vs in IDE is performance.  Performance of IDE suffers when running project w/i ide.  CLI works better

basic commands:
mvn clean
mvn install			 # equivalent of gradle build
mvn spring-boot:run  # equivalent of gradle bootRun

Stop CLI app: 
Cntl+c  [same as gradle, or any other script for that matter]