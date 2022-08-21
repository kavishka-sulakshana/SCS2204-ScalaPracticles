object Question6 extends App{
    def febonacci(n:Int):Int = n match {
        case 0 => 0
        case 1 => 1
        case _ => febonacci(n-1)+febonacci(n-2)
    }

    def febSum(n:Int):Int = n match {
        case 0 => febonacci(0)
        case _ => febonacci(n) + febSum(n-1)
    }

    println(febSum(6))
}