object Question03 extends App{
    var ac1 = Account(100000)
    var ac2 = Account(30000)

    ac1 = ac2.transfer(ac1, 5000)

    println(ac1)
    println(ac2)

}

case class Account(var value:Double){

    def transfer(that:Account, amount:Double):Account = {
        this.value = this.value - amount
        return that.copy(that.value + amount)
    }
    
}