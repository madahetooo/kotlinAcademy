class FlutterDeveloper : Employee() , Contract,NDA {
    override fun rangeSalary() {
        println("Flutter salary 8000 EGP")
    }

    override fun workingHours() {
        println("Flutter working hours is 30 hrs per week")
    }

    override fun daysOff() {
       println("you have only friday as a day off")
    }

    override fun benefits() {
       println("you have only 10 days off")
    }

    override fun bandNumberOne() {
        println("you have a two months notice period")
    }

    override fun bandNumberTwo() {
        println("you have to come at 8AM ")
    }

    override fun doNotShareThisProject() {
        super<Contract>.doNotShareThisProject()
        println("OK i will not share anything")
    }


}