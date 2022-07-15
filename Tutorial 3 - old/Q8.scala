import scala.io.StdIn.readInt
import scala.io.StdIn.readChar

object Q8 extends App{
    def farToCel(temp:Int):Double = (temp - 32)*5/9
    def celToFar(temp:Int):Double = temp*9/5+32 
    def convertor(temp:Int, scale:Char) = scale match{
        case 'f' => printf("temp = %.2f c\n",farToCel(temp))
        case 'c' => printf("temp = %.2f f\n",celToFar(temp))
        case _ => printf("invalid scale\n")
    }

    printf("Enter temperature : ")
    val t = readInt()
    printf("Enter scale (f or c) : ")
    val s = readChar()

    convertor(t,s)
}