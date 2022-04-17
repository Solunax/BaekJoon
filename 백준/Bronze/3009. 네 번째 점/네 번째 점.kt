import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    val (x1, y1) = Pair(sc.nextInt(), sc.nextInt())
    val (x2, y2) = Pair(sc.nextInt(), sc.nextInt())
    val (x3, y3) = Pair(sc.nextInt(), sc.nextInt())

    var resultX = 0
    var resultY = 0

    resultX = if(x1 == x2)
        x3
    else if(x2 == x3)
        x1
    else
        x2

    resultY = if(y1 == y2)
        y3
    else if(y2 == y3)
        y1
    else
        y2

    println("$resultX $resultY")
}