class Account (var balance : Double){
    var id :Int = 0

    def this(id:Int, balance:Double)={
        this(balance)
        this.id = id
        accountList = accountList :+ this(balance)
    }

    def transfer(that:Account, amount:Double):Account = {
        this.balance = this.balance - amount
        return that.copy(that.balance + amount)
    }

}

object Question04 extends App{
    var accountList:List[Account]
    
    Account(1,7000.0)
    Account(2,5000.0)



    println(accountList)

}