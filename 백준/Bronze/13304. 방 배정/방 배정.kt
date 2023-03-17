import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val boy = Array(7){0}
    val girl = Array(7){0}

    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    repeat(n){
        val (gender, grade) = br.readLine().split(" ").map { it.toInt() }
        when(gender){
            0 -> girl[grade]++
            1 -> boy[grade]++
        }
    }

    val low = boy[1] + boy[2] + girl[1] + girl[2]
    val middleBoy = boy[3] + boy[4]
    val middleGirl = girl[3] + girl[4]
    val highBoy = boy[5] + boy[6]
    val highGirl = girl[5] + girl[6]

    var result = 0
    result += (low / k) + (low % k)
    result += (middleBoy / k) + (middleBoy % k)
    result += (middleGirl / k) + (middleGirl % k)
    result += (highBoy / k) + (highBoy % k)
    result += (highGirl / k) + (highGirl % k)

    bw.write("$result")

    br.close()
    bw.close()
}