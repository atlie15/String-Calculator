#!/bin/bash
echo "Running script..."
java -cp "classes/:lib/junit-4.11.jar:lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore tdd.stringcalculator.strcalctest
echo "Script executed successfully!"
