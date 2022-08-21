object Question5 extends App{
    def isOdd(n:Int):Boolean = !(isEven(n))
    def isEven(n:Int):Boolean = n match{
        case 0 => true
        case _ => isOdd(n-1)
    }
    def addEvens(n:Int):Int = n match {
        case 0 => 0
        case x if (isOdd(x)) => addEvens(x-1)
        case x if (isEven(x)) => x + addEvens(x-1)
    } 

    println(addEvens(5))
}