object Question3 extends App{
    def toUpper(str:String):String = str.toUpperCase()
    def toLower(str:String):String = str.toLowerCase()
    def formatNames(name:String,func:(String) => String):String = func(name)
    
    println(formatNames("Benny",toUpper(_)))

}