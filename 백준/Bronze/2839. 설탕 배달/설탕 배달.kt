import java.util.*

fun main(){
    val sc = Scanner(System.`in`)

    var value = sc.nextInt()
    var result = 0

    while(true){
        if(value % 5 == 0){
            result += value / 5
            break
        }else if(value < 3){
            result = -1
            break
        }
        value -= 3
        result ++
    }

    println(result)
}