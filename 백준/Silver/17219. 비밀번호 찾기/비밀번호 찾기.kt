import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val password = HashMap<String, String>()

    repeat(n){
        val (site, pw) = br.readLine().split(" ")
        password[site] = pw
    }

    repeat(m){
        bw.write("${password[br.readLine()]}\n")
    }

    bw.close()
    br.close()
}