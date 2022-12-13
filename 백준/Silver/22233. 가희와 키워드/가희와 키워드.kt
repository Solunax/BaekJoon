import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val keyWord = HashSet<String>()
    repeat(n){
        keyWord.add(br.readLine())
    }

    repeat(m){
        br.readLine().split(",").forEach {
            if(keyWord.contains(it))
                keyWord.remove(it)
        }

        bw.write("${keyWord.size}\n")
    }


    br.close()
    bw.close()
}