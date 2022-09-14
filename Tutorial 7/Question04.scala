var Accounts :List[Account]=List()

class Account(id:String,n: Int, b: Double) {
    val nic:String=id
    val acno: Int = n
    var balance: Double = b
    
    def withdraw(amount:Double):Unit = this.balance=this.balance-amount
    def deposit(amount:Double):Unit = this.balance=this.balance+amount
}


object Question04 extends App{

    // create account
    val createAcc = (nic:String, acno:Int, balance:Double) => Accounts = new Account(nic, acno, balance) :: Accounts 

    // Accounts with negative balances
    val findNegAccs = (accList:List[Account]) => accList.filter(x => x.balance < 0)

    // Account sum
    val calSum = (accList:List[Account]) => accList.reduce((ac1, ac2) => new Account("total", 0, ac1.balance + ac2.balance)).balance

    // update interest
    val interest=(accList:List[Account])=>accList.map(x => if(x.balance>=0) new Account(x.nic,x.acno,x.balance+x.balance*0.05) 
                                                            else new Account(x.nic,x.acno,x.balance-x.balance*0.1))
    
    // print acc list
    val printAcs = (accList:List[Account]) => accList.map(x => println(""+x.nic+" - "+x.acno+" - "+x.balance))

    createAcc("20039",5000,35000)
    createAcc("20032",5001,34000)
    createAcc("20032",5002,-23000)

    printAcs(Accounts)
    // printAcs(findNegAccs(Accounts))
    println(calSum(Accounts))
    // printAcs(interest(Accounts))

}
