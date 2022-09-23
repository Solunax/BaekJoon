import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val array = Array(3){0}
    var sum = 0
    repeat(3){
        array[it] = br.readLine().toInt()
        sum += array[it]
    }

    if(array[0] == 60 && array[1] == 60 && array[2] == 60)
        bw.write("Equilateral")
    else if(sum == 180 && (array[0] == array[1] || array[1] == array[2] || array[0] == array[2]))
        bw.write("Isosceles")
    else if(sum == 180)
        bw.write("Scalene")
    else
        bw.write("Error")

    bw.close()
    br.close()
}