import java.util.*
import kotlin.collections.ArrayList

fun main(){
    val sc = Scanner(System.`in`)

    val (num1, num2) = Pair(sc.nextInt().toString().toCharArray().reversed(), sc.nextInt().toString().toCharArray().reversed())
    var array = arrayListOf(num1, num2)
    var resultArray = kotlin.collections.ArrayList<Int>()
    for(i in array){
        val string = i[0].toString() + i[1].toString() + i[2].toString()
        resultArray.add(string.toInt())
    }
    if(resultArray[0] > resultArray[1])
        println(resultArray[0])
    else
        println(resultArray[1])
}