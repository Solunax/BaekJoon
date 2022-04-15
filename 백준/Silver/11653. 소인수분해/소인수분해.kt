import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    var number = sc.nextInt()
    val array = ArrayList<Int>()

    if(number == 1)
        println()
    else{
        while(number != 1){
            var div = 2

            while(number % div != 0){
                div++
            }
            array.add(div)
            number /= div
        }

        for(i in array)
            println(i)
    }
}