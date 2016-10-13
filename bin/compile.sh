#!/bin/bash
echo "Running script..."
rm -R classes/*
javac src/main/java/is/ru/tdd/*.java -d classes
javac -classpath "classes:lib/junit-4.11.jar" src/test/java/is/ru/tdd/*.java -d classes
echo "Script executed successfully!"
