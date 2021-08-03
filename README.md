# Permutations

**Input:** a string of unknown length that can contain only three characters: 0, 1, or *. For example: "101*011*1”

**Output:** an array of strings where each string is a permutation of the input string with the * character replaced by a 0 or a 1. For example: for input "*1" the result array is ["01", "11"]

**Tasks:** Implement the function/program that will give correct output for all possible inputs within given restrictions. Write a documenting comment explaining the algorithmic complexity of the program.


# Program Complexity

The Program involves nested iterations making it complex. For example for every * we need to iterate the remaining rest of the elements and if another * is encountered then we need to iterate the remaining elements again. So the depth of the loops will be n where n is the number of times * occurs.

Because of above reason this can only be programmed using recurson.

# Project Setup

**Project has been tested using**:

MAC OS 11.0.1

JAVA 1.8

Apache Maven 3.6.0

**Project Usage**

$ mvn clean

$ mvn compile

This will execute all the test cases which contains the test input values

$ mvn test 

Command to pass the arguments via command line to test custom inputs

$ mvn compile exec:java -Dexec.mainClass="com.nadeem.Permutations" -Dexec.args="*0*"




