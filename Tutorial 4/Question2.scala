object Question2 extends App{
    def oddEven(num:Int):Any = num match {
        case x if x<=0 => println("Negative/Zero")
        case x if x%2==0 => println("Even")
        case x if x%2==1 => println("Odd")
    }
    oddEven(16)
}