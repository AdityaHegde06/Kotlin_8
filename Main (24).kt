/******************************************************************************
Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/



//Rtating an from given number of position  ehich can used for cyclic scheduli


fun rotateArray(arr:Array<Int>, k:Int) : Array<Int>
{

val n = arr.size
val shift =k % n

return(arr.sliceArray(n-shift until n) + arr.sliceArray(0 until n-shift))
    
}


fun main()
{
    val nums =arrayOf(1,2,3,4,5)
    val rotated = rotateArray(nums , 3)
    
    println("Rotated Array : ${rotated.joinToString()}")
}