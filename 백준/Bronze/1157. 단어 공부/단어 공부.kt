import java.util.*
import kotlin.collections.ArrayList

fun main(){
    val sc = Scanner(System.`in`)

    val sentence = sc.nextLine().uppercase().toCharArray()
    val array = ArrayList<Int>()
    var many = 0
    for(i in 65..90){
        var value = sentence.count{ it==i.toChar() }
        array.add(value)

        if(many < value)
            many = value
    }

    if(array.count{ it == many} >= 2)
        println("?")
    else
        println((array.indexOf(many) + 65).toChar())
}