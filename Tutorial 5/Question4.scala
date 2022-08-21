object Question4 extends App{
    def isOdd(n:Int):Boolean = !(isEven(n))
    def isEven(n:Int):Boolean = n match{
        case 0 => true
        case _ => isOdd(n-1)
    }

    println(isEven(5))
    println(isOdd(5))
}