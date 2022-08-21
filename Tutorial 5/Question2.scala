object Question2 extends App{
    def prime(n:Int, m:Int = 2):Any = n match{
        case x if x==m || x==2 => println(n)
        case x if x%m == 0 => false
        case _ => prime(n,m+1) 
    }

    def primeSeq(n:Int, m:Int=2):Any = {
        prime(m)
        if (n>m) primeSeq(n,m+1) 
    }

    primeSeq(10)
}