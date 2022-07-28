class KotlinDeveloper : Employee(), Contract,NDA {
    override fun rangeSalary() {
        println("your salary will be 10000 EGP")
    }

    override fun workingHours() {
        println("you have to work 40 hrs per week")
    }

    override fun daysOff() {
        println(" you have friday , saturday off")
    }

    override fun benefits() {
        println("you have 21 days off per year")
    }

    override fun bandNumberOne() {
        println("you have 1 month notice period")
    }

    override fun bandNumberTwo() {
        print("you have to come at 10AM")
    }

    override fun doNotShareThisProject() {
        print("Ok will not let anyone know")
    }
}