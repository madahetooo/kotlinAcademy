class Parrot : Bird()  {

    override var color = "White"
    fun speak(){
        println("Parrot can speak")
    }

    override fun fly(){
        super.fly() // Bird can fly
        println("Parrot can fly")
    }
    fun printColors(){
        println(color) // white
        println(super.color) // black
    }

}