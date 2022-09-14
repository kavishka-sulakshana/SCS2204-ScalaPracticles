case class Point(var x:Int, var y:Int){
    // question a
    def +(that:Point):Point = Point (this.x + that.x, this.y+that.y) 

    // question b
    def move(dx:Int, dy:Int) = {
        this.x = this.x + dx
        this.y = this.y + dy 
    }

    // question c
    def distance(that :Point):Double = Math.sqrt(Math.pow(this.x-that.x,2)+Math.pow(this.y-that.y,2))
        
    // question d
    def invert() = {
        var aux = this.x
        this.x = this.y
        this.y = aux
    }
}

object Question01 extends App{
    val p1 = Point(0,6)
    val p2 = Point(0,0)

    var p3 = p1 + p2
    println(p3)

    p3.move(4,5)
    println(p3)

    val distance = p1.distance(p2)
    println("distance : " + distance)

    p3.invert()
    println(p3)

}