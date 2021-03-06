package exercises

/*
Challenge: Apply Functional Programming for Simple Data Analysis

We decided to gather data on the age of our users.
In this challenge, you'll be presented with this partly faulty data
 of user ages which is based on four input files:
 */

val data = mapOf(
    "users1.csv" to listOf(32, 45, 17, -1, 34),
    "users2.csv" to listOf(19, -1, 67, 22),
    "users3.csv" to listOf(),
    "users4.csv" to listOf(56, 32, 18, 44)
)

fun main() {
    var invalidInputs=0
    var validInputs=0
    var sum=0

    for (number in data.flatMap {it.value}){

        if (number>=0){
            validInputs++
            sum+=number
        }else invalidInputs++

    }

    println("Users age average is ${sum.toDouble().div(validInputs)}\n")


    print("You have input faults in these maps:")
    for ((key, value) in data) for (broj in value)if (broj<0) println(" $key")


    println("\n I find $invalidInputs faulty entires.")



}



/*
Apply the functions you learned about as well as other functions from Kotlin's
standard library to solve the following data analysis tasks:

1. Find the average age of users (use only valid ages for the calculation!)
2. Extract the names of input files that contain faulty data
3. Count the total number of faulty entries across all input files

Hints: map() and flatMap() are often very useful functions for such tasks
Use IntelliJ's autocompletion to explore which other functions, that were not
presented in the lectures, are available (they could simplify the tasks)
 */