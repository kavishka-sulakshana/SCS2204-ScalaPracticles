object Question01 extends App{

    // convert the text into array
    def makeCharArray(txt:String):Array[Char] = txt.toCharArray

    // shift a specific character
    def shifter(c:Char, key:Int):Char = c match {
        case x if (x == ' ') => ' '
        case x if (65 <= x.toInt && x.toInt <= 90 && x.toInt + key > 90) => (c.toInt+key-26).toChar
        case x if (65 <= x.toInt && x.toInt <= 90 && x.toInt + key < 65) => (c.toInt+key+26).toChar
        case x if (97 <= x.toInt && x.toInt <= 122 && x.toInt + key > 122) => (c.toInt+key-26).toChar 
        case x if (97 <= x.toInt && x.toInt <= 122 && x.toInt + key < 97) => (c.toInt+key+26).toChar 
        case x if (48 <= x.toInt && x.toInt <= 57 && x.toInt + key > 57) => (c.toInt+key-10).toChar
        case x if (48 <= x.toInt && x.toInt <= 57 && x.toInt + key < 48) => (c.toInt+key+10).toChar
        case _ => (c.toInt + key).toChar
    }

    // make encrypted array
    def encArray (txt:String, key:Int):Array[Char] = makeCharArray(txt).map(c => shifter(c,key))

    // make string from encrypted array
    def makeString(arr:Array[Char], s:String = ""):String = arr match{
        case x if (!x.isEmpty) => makeString(x.tail,s+x.head)
        case _ => s
    } 
    
    // encrypt function
    def encrypt(text:String, key:Int):String = makeString(encArray(text,key%26))
    // decrypt function
    def decrypt(etext:String, key:Int):String = makeString(encArray(etext,-(key%26)))
    
    // Cypher function
    val Cipher = (text:String,key:Int,method:(String,Int)=>String) => method(text,key)

    println(Cipher("This is an encryption method",10,encrypt(_,_)))
    println(Cipher("Drsc sc kx oxmbizdsyx wodryn",10,decrypt(_,_)))
}

