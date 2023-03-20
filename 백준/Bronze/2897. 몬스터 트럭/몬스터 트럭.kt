import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (r, c) = br.readLine().split(" ").map{ it.toInt() }
    val map = Array(r){Array(c){""} }

    repeat(r){
        map[it] = br.readLine().split("").filter { v -> v.isNotEmpty() }.toTypedArray()
    }

    val result = Array(5){0}

    for(i in 0 until r-1){
        for(j in 0 until c-1){
            var check = true
            var car = 0
            for(x in j .. j + 1){
                for(y in i .. i + 1){
                    if(map[y][x] == "X")
                        car++
                    else if(map[y][x] == "#"){
                        check = false
                        break
                    }
                }
            }

            if(check)
                result[car]++
        }
    }

    result.forEach {
        bw.write("$it\n")
    }

    br.close()
    bw.close()
}
