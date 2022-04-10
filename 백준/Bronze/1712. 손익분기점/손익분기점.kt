import java.util.*

fun main(){
    val sc = Scanner(System.`in`)

    val (fixed, flexible, price) = Triple(sc.nextLong(), sc.nextLong(), sc.nextLong())
    var flag = false
    var breakEvenPointCount = 1
    while(true){
        if(flexible >= price)
            break

        if(fixed + (flexible * breakEvenPointCount) < breakEvenPointCount.toLong() * price){
            flag = true
            break
        }
        else
            breakEvenPointCount++
    }

    if(flag && breakEvenPointCount > 0)
        println(breakEvenPointCount)
    else
        println(-1)
}