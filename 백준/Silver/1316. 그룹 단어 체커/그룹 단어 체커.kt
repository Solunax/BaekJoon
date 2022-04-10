import java.util.*
import kotlin.collections.ArrayList

fun main(){
    val sc = Scanner(System.`in`)

    val count = sc.nextInt()
    sc.nextLine()

    var result = 0
    for(i in 1..count){
        val array = Array(26){false}
        val text = sc.nextLine().toCharArray()
        var flag = true

        for(index in 0 until text.size){
            if(!array[text[index].code - 97]){
                array[text[index].code - 97] = true
            }else if(text[index].code != text[index-1].code){
                flag = false
                break
            }
        }

        if(flag)
            result++
    }

    println(result)
}