# Readme #

This is the program written for quora answer - https://www.quora.com/What-is-simplest-way-to-print-the-following-pattern-in-java-see-the-detailsanswer/Harsh-Deep-4

The class containing the code is called PascalTriangle.

Here is the explaination for the code(also there in the quora answer).

## Explaination ##

What we see here is a Pascal's Triangle. While it has many fascinating unique properties, for dealing with the problem we use the property where we can get the triangle using a combination formula -
 C(n,r) = n! / ( r! (n - r)! ).

We can get the numbers of the triangle like this 
C(0, 0)
C(1, 0) C(1, 1)
...

We use to to come up with our program. It has 4 functions, one to find the factorial, one to find the combination, one to print the triangle and our trusty main.

Here is what each function does -

#### factorial(int number) ####
This gives us the factorial of any number. This function calculates it iteratively.

#### combination(int n, int r) ####
This calculates the combinations possible for a given n and r based on the formula - 
C(n,r) = n! / ( r! (n - r)! )

#### printTriangle(int lines) ####
This function prints the triangle based on the number of lines to be printed. It uses rows and columns to print the numbers of the triangle.

#### main(String[] args) ####
Our trusty main which executes our printTriangle() function. I also made an alternative main incase you wanted to take user input for the number of lines.

### Sources: ###
http://www.calculatorsoup.com/calculators/discretemathematics/combinations.php
https://en.wikipedia.org/wiki/Pascal%27s_triangle 
