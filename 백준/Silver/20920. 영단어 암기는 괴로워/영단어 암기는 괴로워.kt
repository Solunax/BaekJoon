import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, minLength) = br.readLine().split(" ").map{ it.toInt() }
    val map = HashMap<String, Int>()

    repeat(n){
        val input = br.readLine()

        if(input.length >= minLength){
            if(map.containsKey(input))
                map[input] = map[input]!! + 1
            else
                map[input] = 1
        }
    }

    val result = map.toList().sortedWith{ o1, o2 ->
        if(o1.second == o2.second){
            if(o1.first.length == o2.first.length)
                o1.first.compareTo(o2.first)
            else
                o2.first.length - o1.first.length
        }else
            o2.second - o1.second
    }

    result.forEach {
        bw.write("${it.first}\n")
    }

    bw.close()
    br.close()
}

