import java.util.*
import kotlin.collections.ArrayList

fun main(){
    val sc = Scanner(System.`in`)

    val sentence = sc.nextLine().split(" ").filter { it.isNotBlank() }
    println(sentence.size)
}