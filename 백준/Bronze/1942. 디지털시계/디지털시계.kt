import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(3){
        val (s, e) = br.readLine().split(" ")
        var startTime = changeToSecond(s.split(":").map { it.toInt() })
        val endTime = changeToSecond(e.split(":").map { it.toInt() })

        var count = 0
        while (true){
            if(changeToTimeNumber(startTime) % 3 == 0)
                count++

            if(startTime == endTime)
                break

            startTime++
            startTime %= 3600 * 24
        }

        bw.write("$count\n")
    }

    bw.close()
    br.close()
}

fun changeToTimeNumber(time : Int) : Int{
    var t = time
    val num = Array(3){0}

    repeat(3){
        num[it] = t % 60
        t /= 60
    }

    return num[2] * 10000 + num[1] * 100 + num[0]
}

fun changeToSecond(arr : List<Int>) : Int{
    return arr[0] * 3600 + arr[1] * 60 + arr[2]
}

