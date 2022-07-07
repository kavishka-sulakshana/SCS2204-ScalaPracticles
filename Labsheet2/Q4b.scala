def attendees(ticket:Int):Int = 120 + ((15-ticket)/5)*20
def totRev(ticket:Int):Int = attendees(ticket)*ticket
def cost(ticket:Int):Int = 500+3*attendees(ticket)
def profit(ticket:Int):Int = totRev(ticket)-cost(ticket)