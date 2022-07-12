object Q7 extends App{
    def season(month:Int):String = month match {
        case m if(m==12 || m==1 || m==2) => "Winter"
        case m if(m==3 || m==4 || m==5) => "Spring"
        case m if(m==6 || m==7 || m==8) => "Summer"
        case m if(m==9 || m==10 || m==11) => "Autumn"
        case _ => "Bogus month"
    }
        
    println(season(9))
}