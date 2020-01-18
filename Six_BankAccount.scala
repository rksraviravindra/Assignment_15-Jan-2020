//package Assignment

  class BankAccount(initialBalance: Double) {
    private var balance = initialBalance
    def deposit(amount: Double) = { balance += amount; balance }
    def withdraw(amount: Double) = { balance -= amount; balance }
  }

  class CheckingAccount extends BankAccount(10000.50){
    val balanceAfterDeposit = deposit(1000) - 1
    val balanceAfterWithdraw = withdraw(6000) - 1

    def displayAD(): Unit =
    {
      println("After Deposit Your Balance is : "+balanceAfterDeposit)
    }

    def displayAW(): Unit =
    {
      println("After Withdraw Your Balance is : "+balanceAfterWithdraw)
    }
  }

object Six_BankAccount {

  def main(args: Array[String]): Unit = {
    val obj = new CheckingAccount()

    obj.displayAD()
    obj.displayAW()
  }
}


// Problem Statement and Solution
/*
6) Extend the following BankAccount class to a CheckingAccount class that charges $1
for every deposit and withdrawal.
class BankAccount(initialBalance: Double) {
private var balance = initialBalance
def deposit(amount: Double) = { balance += amount; balance }
def withdraw(amount: Double) = { balance -= amount; balance }
}
 */

/* OUTPUT
After Deposit Your Balance is : 10999.5
After Withdraw Your Balance is : 4999.5
 */