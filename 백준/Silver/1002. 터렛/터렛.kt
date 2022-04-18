import java.util.*
import kotlin.math.PI
import kotlin.math.round
import kotlin.math.sqrt

fun main() {
    val sc = Scanner(System.`in`)

    val case = sc.nextInt()
    sc.nextLine()

    for(i in 1..case){
        var (a, b) = Pair(0, 0)
        val (x1, y1, r1) = Triple(sc.nextInt(), sc.nextInt(), sc.nextInt())
        val (x2, y2, r2) = Triple(sc.nextInt(), sc.nextInt(), sc.nextInt())

        if(x1 == x2 && y1 == y2 && r1 == r2){
            println(-1)
            continue
        }
        
        a = if(x1 > x2)
            x1 - x2
        else
            x2 - x1

        b = if(y1 > y2)
            y1 - y2
        else
            y2 - y1

        val distance = sqrt((a * a).toDouble() + (b * b).toDouble())


        val big = if(r1 > r2)
            r1
        else
            r2

        val small = if(r1 > r2)
            r2
        else
            r1

        if(big - small < distance && distance < big + small)
            println(2)
        else if((big + small).toDouble() == distance || (big - small).toDouble() == distance)
            println(1)
        else if(big + small < distance || distance < big - small)
            println(0)
        else
            println(-1)
    }
}