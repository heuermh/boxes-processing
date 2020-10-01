#!/bin/bash

mkdir boxes
mkdir boxes/library
cp COPYING boxes
cp README boxes
cp library.properties boxes
cp lib/jbox2d-library.COPYING boxes
cp lib/jbox2d-library-2.3.1-SNAPSHOT.jar boxes/library
cp -R src boxes
cp -R examples boxes
cd src
javac -source 1.8 -target 1.8 -classpath "../lib/processing-core-3.5.3.jar:../lib/jbox2d-library-2.3.1-SNAPSHOT.jar" org/dishevelled/processing/boxes/*.java
jar cvf ../boxes/library/boxes.jar org/dishevelled/processing/boxes/*.class
cd ..
