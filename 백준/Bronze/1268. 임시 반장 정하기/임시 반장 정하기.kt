import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val student = Array(n){ Array(n){0} }
    val count = Array(n){ HashSet<Int>() }

    repeat(n){
        student[it] = br.readLine().split(" ").map { v -> v.toInt() }.toTypedArray()
    }

    for(c in 0 until 5){
        for(i in 0 until n){
            for(j in 0 until n){
                if(i != j && student[i][c] == student[j][c])
                    count[i].add(j)
            }
        }
    }

    var num = count[0].size
    var result = 0

    for(i in 1 until n){
        if(count[i].size > num){
            result = i
            num = count[i].size
        }
    }
    bw.write("${result + 1}")

    bw.close()
    br.close()
}