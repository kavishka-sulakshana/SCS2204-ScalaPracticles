object Q6 extends App{
    def totalMarks(sub1:Int, sub2:Int, sub3:Int):Int = sub1+sub2+sub3
    def averageMarks(sub1:Int, sub2:Int, sub3:Int):Double = totalMarks(sub1,sub2,sub3)/3
    
    // a)
    def grade1(sub1:Int, sub2:Int, sub3:Int):String = {
        val average = averageMarks(sub1,sub2,sub3)
        if (average>69.0)
            return "Very good"
        if (average>54.0 && average<=69.0)
            return "Good"
        if (average>39.0 && average<=54.0)
            return "Pass"
        if (average<=39.0 && average>=0.0)
            return "Fail"
        if (average<0.0)
            return "Invalid Marks"
        else 
            return ""

    }

    // b)
    def grade2(sub1:Int, sub2:Int, sub3:Int):String = {
        val average = averageMarks(sub1, sub2, sub3)
        if (average>69.0)
            return "Very good"
        else
            if (average>54.0)
                return "Good"
            else
                if(average>39.0)
                    return "Pass"
                else
                    if(average>0)
                        return "Fail"
                    else
                        return "Invalid Marks" 
    }

    // c)
    def grade3(sub1:Int, sub2:Int, sub3:Int):String = {
        val average = averageMarks(sub1,sub2,sub3)
        return if (average>69.0) "Very good" else if(average>54.0) return "Good" else if(average>39.0) "Pass" else if(average>0) "Fail" else "Invalid Marks"
    }


    printf("%s\n",grade1(33,33,33))
    printf("%s\n",grade2(70,75,89))
    printf("%s\n",grade3(40,45,89))
}