fun main() {

    var premiumUser = User(12312,"Eslam","ieslamme@gmai.com","cairo")

    premiumUser.address = "Dubai" // SET

    print(premiumUser.address) // GET






//    var juniorKotlinDeveloper = KotlinDeveloper()
//
//    juniorKotlinDeveloper.doNotShareThisProject()

//
//    var juniorFlutterDeveloper = FlutterDeveloper()
//
//
//    juniorFlutterDeveloper.doNotShareThisProject()
//












//
//    var smallDog = SmallDog()
//    smallDog.eating()
//    smallDog.eating(26)
//    smallDog.eating(12,"dogdog","cairo")
//


//    val age = 26 // default is INT
//    val newAge: Long = age.toLong() // Parsing to long
//    println(newAge)
//    println(age::class.java.typeName)

//   println("Hello world")
//   println("Hello \" world")
//   println("Hello \' world")
//   println("Hello \\ world")
//   println("Hello \nworld")
//   println("Hello \rworld")
//   println("Hello\tworld")
//   println("Hello \bworld") // SCAPE SEQUENCE

//   var names = arrayOf("Eslam","Ahmed","Yasser","Kareem")
//   println(names.joinToString(" , "))
//   println(names[0][1])

//   var x:Float = 5f
//   var y:Float = 10f
//   println(x+y)
//   println(x-y)
//   println(x/y)
//   println(x*y)

//   var x = 10
//   var y = 10
//   if (x >= y ){
//      println("X is greater or equal to Y")
//   }
//   else if (x < y){
//      println("X is Smaller than Y")
//   }
//   else{
//      println("X is equal to Y")
//   }

//   var x = 5
//   x -= 1
//   println(x)

//   var x = 5
//   println(x++)  // 5
//   println(x) //6
//   println(x--) //6
//   println(x) // 5


//   var x = 8
//   var y = 10
//   var z = 5
//   if (x > y || x > z){
//      println("X is large number")
//   }
//   if (x != 7){
//      println("x is not equal to 7")
//   }
//   if (x == 8){
//      println("x is equal to 8")
//   }

//
//    var name: String
//    var age: Int
//    println("Please enter your name")
//    name = readLine().toString()
//    println("And your age please")
//    age= Integer.valueOf(readLine().toString())
//    println("Welcome Ya $name + your age is : $age")


//    var season = 2
//    when(season){
//        1,2,3-> {
//            println("Winter season")
//        }
//        in 3..6 -> {
//            println("Autumn season")
//        }
//        in 7..10 -> {
//            println("Summer season")
//        }
//        in 9..12 -> {
//            println("Different season")
//        }
//    }


//    println("Welcome to our college website")
//    println("Please enter your degree to get your result")
//    var degree:Int
//    degree = Integer.valueOf(readLine().toString())
//    when(degree){
//        in 0..50 ->{
//            println("You Failed")
//        }
//        in 51..70 ->{
//            println("You Got C")
//        }
//        in 71..80 ->{
//            println("You Got B+")
//        }
//        in 81..90 ->{
//            println("You Got A")
//        }
//        in 91..100 ->{
//            println("You Got A+")
//        }
//        else ->{
//            println("Not valid number")
//        }
//    }


    // initializer
    // condition
    // counter

//    for(int i = 0 ;  i <=10; i++){
//        // statement
//    }


//    var names = arrayOf("Eslam", "Mahmoud", "Mohammed", "Alex", "Ahmed", "Yasser")
//    var names2 = "Eslam"
//    for (listOfNames in names2){
//        println(listOfNames)
//    }


//    for( i in 1..10 step 2){
//        println("Hello World + $i")
//    }


//    var i = 1; // initialization
//    while (i<=10){ // Condition
//        //Statement
//        println("Hello world + $i")
//        i++ //Counter
//    }


    // infinite loop
//    while (true){
//        println("Hello")
//    }

//    var i = 1
//    do {
//        println("Hello")
//        i++
//    }
//        while (i<0)


//    for (i in 1..5){
//        if (i == 3){
//            continue
//        }
//        println(i)
//    }

//  val operationResult =  sum(5,6) // 11
//    println(operationResult)
//
//    val max = Math.max(5,6)
//    println(max)

//    try {
//        val data = 20 / 0
//        println(data)
//    } catch (exception: Exception) {
//        println("Cannot divide by zero")
//        println(exception)
//    } finally {
//        println("This line will always executed")
//    }


//    var name:String? = "Eslam" // Nullable
//    if (name != null)
//        println(name.length)
//
//    println("Ahmed AHmed")


}

fun sum(number1: Int, number2: Int): Int {
    return number1 + number2
}