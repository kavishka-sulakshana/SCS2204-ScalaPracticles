object Question6 extends App{
    def fibonacci(n:Int):Int = n match {
        case 0 => 0
        case 1 => 1
        case _ => fibonacci(n-1)+fibonacci(n-2)
    }

    def fibSeq(n:Int, i:Int = 0):Any = {
        println(fibonacci(i))
        if(n>i) fibSeq(n,i+1)
    }

    // def fibSum(n:Int):Int = n match {
    //     case 0 => fibonacci(0)
    //     case _ => fibonacci(n) + fibSum(n-1)
    // }


    fibSeq(10)
}