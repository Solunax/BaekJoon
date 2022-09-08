import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val student = HashMap<String, Triple<Int, Int, Int>>()

    repeat(n){
        val input = br.readLine().split(" ")
        student[input[0]] = Triple(input[1].toInt(), input[2].toInt(), input[3].toInt())
    }

    student.toList().sortedWith{o1, o2 ->
        if(o1.second == o2.second)
            o1.first.compareTo(o2.first)
        else{
            if(o1.second.first == o2.second.first){
                if(o1.second.second == o2.second.second){
                    o2.second.third - o1.second.third
                } else
                    o1.second.second - o2.second.second
            }else
                o2.second.first - o1.second.first
        }
    }.forEach {
        bw.write("${it.first}\n")
    }

    bw.close()
    br.close()
}
