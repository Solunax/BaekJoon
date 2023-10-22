import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val result = Array(26){0}

    repeat(n){
        val word1 = Array(26){0}
        val word2 = Array(26){0}

        val (v1, v2) = br.readLine().split(" ")

        for(i in v1.indices)
            word1[v1[i] - 'a']++

        for(i in v2.indices)
            word2[v2[i] - 'a']++

        for(i in 0 until 26)
            result[i] += max(word1[i], word2[i])
    }

    result.forEach {
        bw.write("$it\n")
    }

    bw.close()
    br.close()
}