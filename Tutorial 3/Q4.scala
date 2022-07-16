object Q4 extends App{
    def discount(p:Double):Double = p*60/100
    def wholesaleCost(n:Int,p:Double=24.95):Double = if(n<=50) (discount(p)+3)*n else (discount(p)+3)*50+(discount(p)+0.75)*(n-50)

    println(wholesaleCost(60))
}