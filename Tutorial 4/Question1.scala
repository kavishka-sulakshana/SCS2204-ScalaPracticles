object Question1 extends App{
    def interest(amount:Int):Double = amount match{
        case x if x<=20000 && x>0 => x*2/100
        case x if x<=200000 => x*4/100
        case x if x<=2000000 => x*3.5/100
        case x if x>2000000 => x*6.5/100
        case _ => 0
    }

    println(interest(40000));
    println(interest(600000));
    println(interest(1900000));
    println(interest(3800000));

}