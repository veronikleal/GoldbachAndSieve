# GoldbachAndSieve
Goldbachs and Sieve conjecture

Implement the Sieve of Eratosthenes and use it to find all prime
numbers less than or equal to an amount determined at runtime. Use
the result to prove Goldbach's Conjecture for all even integers between
four and one million, inclusive.

Implement a method with the following declaration:

public static void sieve(int[] array);
This function takes an integer array as its argument. The array
should be initialized to the values 1 through the chosen number. The
function modifies the array so that only the prime numbers remain;
all other values are zeroed out.

This function must be written to accept an integer array of any
size. You must should output for all primes numbers between 1 and
the chosen number, but when I test your function it may be on an array of a
different size.

Implement a method with the following declaration:

public static void goldbach(int[] array);
This function takes the same argument as the previous method
and displays each even integer between 4 and the chosen number with two
prime numbers that add to it.

The goal here is to provide an efficient implementation. This
means no multiplication, division, or modulus when determining if
a number is prime. It also means that the second method must find
two primes efficiently.

Output for your program: All prime numbers between 1 and the chosen number
and all even numbers between 4 and the chosen number and the two prime
numbers that sum up to it.
