import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val array = Array(101){-1L}
fun main() {
    val case = br.readLine().toInt()

    array[0] = 0
    array[1] = 1
    array[2] = 1
    array[3] = 1

    for(i in 0 until case){
        bw.write("${getResult(br.readLine().toInt())}\n")
    }

    br.close()
    bw.close()
}

fun getResult(number:Int):Long{
    if(array[number] == -1L)
        array[number] = getResult(number - 2) + getResult(number - 3)

    return array[number]
}