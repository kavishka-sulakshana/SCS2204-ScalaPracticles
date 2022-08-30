object Question1 extends App{
    def isPrime(n:Int, m:Int = 2):Boolean = n match{
        case x if x<2 => false
        case x if x==m => true
        case x if x%m == 0 => false
        case _ => isPrime(n,m+1) 
    }

    println(isPrime(2))
}