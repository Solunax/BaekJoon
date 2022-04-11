import java.util.*
import kotlin.collections.ArrayList

fun main(){
    val sc = Scanner(System.`in`)

    var number = sc.nextInt()
    var line = 1

    while(number > line) {
        number -= line
        line++
    }

    val array = kotlin.collections.ArrayList<String>()
    if(line % 2 == 0){
        var (a, b) = Pair(1, line)
        while(a <= line){
            array.add("$a/$b")
            a++
            b--
        }
        println(array[number-1])
    }else{
        var (a, b) = Pair(line, 1)
        while(b <= line){
            array.add("$a/$b")
            a--
            b++
        }
        println(array[number-1])
    }
}