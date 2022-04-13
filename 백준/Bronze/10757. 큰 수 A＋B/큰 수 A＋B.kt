import java.util.*

fun main(){
    val sc = Scanner(System.`in`)

    val (array1, array2) = Pair(sc.next(), sc.next())

    val n1 = array1.toBigDecimal()
    val n2 = array2.toBigDecimal()
    println(n1.add(n2))
}