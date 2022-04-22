import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val sc = Scanner(System.`in`)

    val case = sc.nextInt()
    val array = Array<IntArray>(case){IntArray(3)}
    for(i in 0 until case){
        array[i][0] = sc.nextInt()
        array[i][1] = sc.nextInt()
        array[i][2] = 1
    }

    for(i in 0 until case){
        for(j in 0 until case){
            if(i == j)
                continue
            else{
                if(array[i][0] < array[j][0] && array[i][1] < array[j][1])
                    array[i][2]++
            }
        }
    }

    for(i in 0 until case)
        print("${array[i][2]} ")
}