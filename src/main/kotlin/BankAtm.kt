import kotlin.system.exitProcess


class BankAtm {

    var pinCode: Int = 0
    var balance: Float = 0f
    var selectedOperation: Int = 0
    var selectedChoice: Int = 0
    var money: Float = 0f


    fun enterYourCardInfo() {
        println("Welcome to our bank")
        println("Please enter your PIN Code")
        pinCode = readLine()!!.toInt()
        println("Please enter your balance")
        balance = readLine()!!.toFloat()
        selectOperation()
    }
    fun selectOperation() {
        println("Please select your operation")
        println("1: For Deposit,  2: For Withdraw, 3: Check Balance, 4: Exit")
        selectedOperation = readLine()!!.toInt()
        when (selectedOperation) {
            1 -> deposit()
            2 -> withdraw()
            3 -> checkBalance()
            4 -> {
                println("Thanks for using our bank")
                System.exit(0)
            }
        }
    }
    fun checkBalance() {
        println("Your current balance is : $balance")
        doYouNeedAnyThingElse()
    }
    fun doYouNeedAnyThingElse() {
        println("Do you need anything else")
        println("1: Yes, 2: No")
        selectedChoice = readLine()!!.toInt()
        when (selectedChoice) {
            1 -> selectOperation()
            2 -> {
                println("Thanks for using our bank")
                System.exit(0)
            }
        }

    }
    fun withdraw() {
        println("Please enter the amount of money you want to withdraw")
        money = readLine()!!.toFloat()
        if (money <= balance) {
            balance -= money
            println("Withdraw done successfully")
            checkBalance()
        } else {
            println("Sorry, you dont have enough money")
        }
        doYouNeedAnyThingElse()
    }
    fun deposit() {
        println("please enter the amount of money you want to deposit")
        money = readLine()!!.toFloat()
        balance += money
        println("Deposit Done successfully")
        checkBalance()
        doYouNeedAnyThingElse()
    }
}