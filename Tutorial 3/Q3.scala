object Q3 extends App{
    // a)
    def findMax1(n1:Int,n2:Int,n3:Int):Int = {
        if(n1>n2){
            if(n1>n3)
                return n1
            else
                return n3
        }
        else{
            if(n2>n3)
                return n2
            else
                return n3
        }
    }
    println(findMax1(34,45,23))


    // b)
    def findMax2(n1:Int,n2:Int,n3:Int):Int = if(n1>n2) if(n1>n3) n1 else n3 else if(n2>n3) n2 else n3 
    println(findMax2(34,25,66))

}