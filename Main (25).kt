/******************************************************************************
Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
//WRITE A PROGRAM  IF  GIVEN STRING IS PALINDRIOME OR NOT


//function to check wheather  the given string is ispalindrome or not
  val  isPalindrome : (String)-> Boolean= {input ->
 input == input.reversed()
}

//function to check wheather  the given Number  is ispalindrome or not
 fun  isNumberPalindrome(number : Int):Boolean =isPalindrome(number.toString())

///
fun main() {

//TEST STRINGS
    
    val testString="madam"
    val testNumber ="123121 "
    
    
    println(" Is the given string is palindrome? ${isPalindrome(testString)}")
    println(" Is the given number is palindrome? ${isPalindrome(testNumber)} ")
    
    
    
    //ANOTHER TEST CASE FOR CHECKING
    
     val nonPalindrome ="HELLO"
     val nonPalindromeN= 12345
     
     
     println(" Is  $nonPalindrome is not palindrome id ${isPalindrome(nonPalindrome)}")
      println(" Is $nonPalindromeN is not palindrome id ${isNumberPalindrome(nonPalindromeN)}")
}
