object Question02 extends App{
    val r1 = Rational(3,4)
    val r2 = Rational(5,8)
    val r4 = Rational(2,7)

    val r3 = r1 - r2 - r4

    println(r3.printno())
}

case class Rational(x:Int, y:Int){
    def upper:Int = x
    def lower:Int = y

    def printno = () => this.upper match {
        case x if (this.lower == 0 && x == 0) => "undifined"
        case x if (x == 0) => "0"
        case x if (this.lower == 0 ) => "infinity"
        case x if (x<0 && this.lower<0) => ""+(-1*x)+"/"+(-1*this.lower)
        case x if (x>0 && this.lower>0) => ""+x+"/"+this.lower
        case x if (x<0 && this.lower>0) => "-"+(-1*x)+"/"+this.lower
        case x if (x>0 && this.lower<0) => "-"+x+"/"+(-1*this.lower)
    }

    def -(that:Rational):Rational = {
        if(this.lower == that.lower){
            return Rational(this.upper-that.upper,this.lower)
        } 
        else{
            return Rational(this.upper*that.lower - this.lower*that.upper,this.lower*that.lower)
        }
    }
}