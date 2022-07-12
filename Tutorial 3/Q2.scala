object Q2{
    def main(args:Array[String])={
        println(findMax2(6,7))
        println(findMax1(66,7))
    }

    // a)
    def findMax1(n1:Int, n2:Int):Int = {
        if(n1<n2){
            return n2 
        } 
        else{
            return n1
        } 
    } 

    // b)
    def findMax2(n1:Int, n2:Int):Int = if(n1<n2)  n2 else n1
}