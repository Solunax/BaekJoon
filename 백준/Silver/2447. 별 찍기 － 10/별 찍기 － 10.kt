import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() {
    val sc = Scanner(System.`in`)


    val value = sc.nextInt()
    for(y in 0 until value){
        for(x in 0 until value)
            makeStar(x, y, value)
        bw.write("\n")
    }

    bw.flush()
    bw.close()
}

fun makeStar(x:Int, y:Int, number:Int){
    if((x / number) % 3 == 1 && (y / number) % 3 == 1)
        bw.write(" ")
    else if(number / 3 == 0)
        bw.write("*")
    else
        makeStar(x, y, number / 3)
}