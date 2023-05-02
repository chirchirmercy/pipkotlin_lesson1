fun main(){

    studentDetails("mercy",20,"magare")

    personDetails("mercy",15,"Kenya")
   println(sum(40,45,49,50))




    var fullName = "mercy cheptoo"
    println(fullName)

    var age = 21
    println(age)

    var phoneNumber = "0791554783"
    println(phoneNumber)

    var weightInKg = 50
    println(weightInKg)

    var kenyanCitizen: Boolean = true
    println(kenyanCitizen)



}

fun studentDetails(name:String,age:Int,school:String) {
    println("Hi my name is $name  i am $age years old and i went to $school")


}

//1.Create and invoke a function that takes in a users name, age, and nationality
// and prints out “Hello my name is ${name}, I am ${age} and I am from ${nationality}” e.g
//given “Lucy”, 23, and “Kenya” it will print out “Hello my name is Lucy,
// I am 23 years old and I am from Kenya” (2 points)

fun personDetails(username:String,age:Int,nationality:String){
    println("Hello my name is $username i am $age years old and i am from $nationality")

}



//
// Create and invoke a function that returns the sum of any given 4 numbers (3 points)

fun sum(num1:Int,num2:Int,num3:Int,num4:Int):Int{
    var sum =num1+num2+num3+num4
    return sum


}
//
//3. Create and invoke a function that given any 5 numbers, it returns their average (2 points)
fun average(num1:Int,num2:Int,num3: Int,num4: Int,num5:Int):Int{
    var sum=(num1+num2+num3+num4+num5)
    return sum/5

}
//
//4. You are creating an app to capture a person’s records. Some of the data you will
//capture includes full name, age, phone number, email, weight in kg, and citizen. For the
//citizen field, you will track whether a student is a Ugandan or not. (3 points)

fun personsRecord(fullname:String,age:Int,phoneNumber:String,Email:String,weight:Double,citizen:String){


}
