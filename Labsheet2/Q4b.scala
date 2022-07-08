object Q4b{
    def main(args:Array[String])={
        var x = 0
        var max,maxT = 0
        for(x <- 0 to 40; if x%5 == 0){
            if(profit(x)>max){
                max = profit(x)
                maxT = x
            }    
        }
        println(maxT+" "+max)
    }
    def attendees(ticket:Int):Int = 120 + ((15-ticket)/5)*20
    def totRev(ticket:Int):Int = attendees(ticket)*ticket
    def cost(ticket:Int):Int = 500+3*attendees(ticket)
    def profit(ticket:Int):Int = totRev(ticket)-cost(ticket)
}

