package Assignment

object counter{   //Counter variable for count monthly charges
  var count:Int = 0
}

  class BankAccount(initialBalance: Double) {
    private var balance = initialBalance
    def deposit(amount: Double) = { balance += amount; balance }
    def withdraw(amount: Double) = { balance -= amount; balance }
  }

  class SavingAccount extends BankAccount(10000.50) {

    def earnMonthlyInterest(): Unit ={
      val balanceInt = deposit(0) * 0.04
      println("Your Interest is : "+ balanceInt)
    }

  }

  class CheckingAccount extends BankAccount(10000.50){
    val balanceAfterDeposit = deposit(1000)
    val balanceAfterWithdraw = withdraw(6000)

    def displayAD(): Unit =
    {
      if(counter.count<=3){ // Three times will not deduct $1 Deposit charge
        println("After Deposit Your Balance is : "+balanceAfterDeposit)
        counter.count+=1
      }
      else
        println("After Deposit Your Balance is : "+(balanceAfterDeposit -1))
    }

    def displayAW(): Unit =
    {
      if(counter.count<=3) { //Three times will not deduct $1 Withdraw charge
        println("After Withdraw Your Balance is : " + balanceAfterWithdraw)
        counter.count+=1
      }
      else
        println("After Withdraw Your Balance is : " + (balanceAfterWithdraw-1))
    }
  }

object Seven_EarnInterest {

    def main(args: Array[String]): Unit = {
      val obj = new CheckingAccount()

      obj.displayAD()
      obj.displayAW()

      val objInt = new SavingAccount()
      objInt.earnMonthlyInterest()
    }
}


// Problem Statement and Solution
/*
7) Extend the BankAccount class of the preceding exercise into a class SavingsAccount
that earns interest every month (when a method earnMonthlyInterest is called)
and has three free deposits or withdrawals every month. Reset the transaction
count in the earnMonthlyInterest method.
 */

/* OUTPUT
After Deposit Your Balance is : 11000.5
After Withdraw Your Balance is : 5000.5
Your Interest is : 400.02
 */