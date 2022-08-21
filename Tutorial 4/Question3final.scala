object Question3final extends App{
    def toUpper(str:String):String = str.toUpperCase()
    def toLower(str:String):String = str.toLowerCase()
    def formatNames(name:String)(chars:List[Int])(func:(String) => String):String = {
        var fullString = ""
        var i = 0
        var len = name.length
        while(i<len){
            if(chars.contains(i+1)) fullString = fullString + func(name.slice(i,i+1))
            else fullString = fullString + name.slice(i,i+1)
            i=i+1
        }
        return fullString

    }
    println(formatNames("beNny")(List(1,5))(toUpper(_)))
    println(formatNames("UNIVERSE")(List(1,3,5))(toLower(_)))

}