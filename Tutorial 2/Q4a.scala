def normalSal(x:Int):Int = x*250
def otSal(x:Int):Int = x*85
def totalSal(n:Int, o:Int):Int = normalSal(n)+otSal(o)
def homeSal(n:Int, o:Int):Double = if(n>=40 && o>=30) totalSal(n,o)*88/100 else totalSal(n,o)