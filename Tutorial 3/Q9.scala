import scala.io.StdIn.readLine

object Q9 extends App{
    def add(num1:Double, num2:Double):Double = num1 + num2
    def sub(num1:Double, num2:Double):Double = num1 - num2
    def mul(num1:Double, num2:Double):Double = num1 * num2
    def div(num1:Double, num2:Double):Double = num1 / num2

    def calculate(num1:Double, num2:Double,op:String):Double = if(op=="+") add(num1,num2) else if(op=="-") sub(num1,num2) else if(op=="*") mul(num1,num2) else if(op=="/") div(num1,num2) else 0
    
    def getInput(no:Int):Double ={
        printf("Enter number %d : ",no)
        return readLine().toDouble
    } 


    val num1 = getInput(1)
    val num2 = getInput(2)
    printf("Enter your operator : ")
    val op = readLine()
    if(op=="+" || op=="-" || op=="*" || op=="/") printf("Answer is %.2f\n",calculate(num1,num2,op)) else printf("Invalid operator\n")


}