import java.util.*

fun main(){
    val sc = Scanner(System.`in`)

    val input = sc.nextLine().uppercase().toCharArray()
    val array = intArrayOf(3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10)

    var count = 0
    var addValue = 3

    var result = 0
    for(j in input)
        result += array[j.code-65]

    println(result)
}