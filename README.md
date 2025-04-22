pattern-matching-algorithms
In this project we will, implement, test and compare three pattern matching algorithms. Brute-Force(Naïve), Boyer-Moore-Horspool and Knuth-Morris-Pratt algorithms.

README
This project is implemented by TJ Bah and Ria Banerjee as part of Algorithms and Data Structures class.
This project 3 implements following three algorithms for pattern searching:
Brute Force (Naive) Algorithm
Boyer-Moore Horspool Algorithm
Knuth-Morris-Pratt Algorithm
Throughout the three algorithms, we are using standard common test cases, as mentioned below:
// TEST Case 1 String T = "THIS IS A SIMPLE EXAMPLE"; String P = "SIMPLE";
// Test Case 2 String T = "AAAAAAAAAAH"; String P = "AAAAH";
// TEST Case 3 String T = "THIS IS MY NEW STRING AAAAHHHH"; String P = "NEW";
// TEST Case 4 String T = "THIS TEST WILL HAVE MULTIPLE MATCHES, SO THAT WE CAN TEST. ONE MORE TEST."; String P = "TEST";
// TEST Case 5 String T = "COMPUTER SCIENCE IS NO MORE ABOUT COMPUTERS THAN ASTRONOMY IS ABOUT TELESCOPES"; String P = "NO";
// TEST Case 6 String T = "NO COMPUTER IS EVER GOING TO ASK A NEW, REASONABLE QUESTION. IT TAKES TRAINED PEOPLE TO DO THAT."; String P = "TRAINED";
// TEST Case 7 String T = "WE CAN ONLY SEE A SHORT DISTANCE AHEAD, BUT WE CAN SEE PLENTY THERE THAT NEEDS TO BE DONE."; String P = "DISTANCE";
// TEST Case 8 String T = "QAZQAZQAZQAZZQAZZQAZZQAZZZZZZZZQQQQQQQZZZZZQAQAQAQAQAZZZQAAAAAZZZQAZZZZZZZQQQQQAAAZZZ"; String P = "QAZZZ";
// TEST Case 9 String T = "COMPUTER SCIENCE IS THE OPERATING SYSTEM FOR ALL INNOVATION."; String P = "NOVA";
// TEST Case 10 String T = "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWKWWWWWKWWWWK"; String P = "WWWK";
The goal is to find the number of comparisons taken by each algorithm for each test case.
Brute Force (Naive) Algorithm
This code is written in Java, so you would require java environment to run the code on the local machine. Java version 8 and above is recommended. And a Java IDE (Eclipse, IntelliJ etc.) to run the code. 
Boyer-Moore Horspool Algorithm
This code is written in Java, so you would require java environment to run the code on the local machine. Java version 8 and above is recommended. And a Java IDE (Eclipse, IntelliJ etc.) to run the code. 
Knuth-Morris-Pratt Algorithm
At the end of the file, there are two variables txt (text) and pat (pattern). You can change the text you want to check for, and the pattern that you want to search in the text. This can be done in the code.
Then just run the cell. It outputs the indexes where the pattern was found in the original string, and the comparisons made.
