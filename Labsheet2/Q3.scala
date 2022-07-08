/*
            // Answer
k+12*m      // 62
m/j         // 2
n % j       // 1
m/j*j       // 4
f+10*5+g    // 66.0
*/
object Q3{
    def main(args:Array[String])={
        var a = 2
        var b = 3
        var c = 4
        var d = 5
        var k = 4.3f

        // a) output -> 24
        b-=1
        printf("%d",b*a+c*d)
        d-=1

        // b) output -> 2
        printf("%d",a)
        a+=1

        // c) output -> no value for g??
        printf("%f",-2*(g-k)+c)

        // d) output -> 4
        printf("%d",c)
        c += 1

        // e) output -> 10
        c += 1
        printf("%d",c*a)
        a += 1
    }
}
