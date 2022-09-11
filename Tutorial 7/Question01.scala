object Question01 extends App{
    val no1:Rational = Rational(8,0)
    val no2:Rational = Rational(-8,9)
    val no3:Rational = Rational(8,-9)
    val no4:Rational = Rational(-8,-9)
    println(no1.neg())
    println(no2.neg())
    println(no3.neg())
    println(no4.neg())
}

case class Rational(x:Int,y:Int){
    def upper:Int = x
    def lower:Int = y

    def printno = () => this.upper match {
        case x if (this.lower == 0) => "infinity"
        case x if (x<0 && this.lower<0) => ""+(-1*x)+"/"+(-1*this.lower)
        case x if (x>0 && this.lower>0) => ""+x+"/"+this.lower
        case x if (x<0 && this.lower>0) => "-"+(-1*x)+"/"+this.lower
        case x if (x>0 && this.lower<0) => "-"+x+"/"+(-1*this.lower)
    }

    def neg = () => this.upper match {
        case x if (this.lower == 0) => "infinity"
        case x if (x<0 && this.lower<0) => "-"+(-1*x)+"/"+(-1*this.lower)
        case x if (x>0 && this.lower>0) => "-"+x+"/"+this.lower
        case x if (x<0 && this.lower>0) => ""+(-1*x)+"/"+this.lower
        case x if (x>0 && this.lower<0) => ""+x+"/"+(-1*this.lower)
    }
}