import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    var testCheck = true
    var systemCheck = true
    repeat(n){
        val (v1, v2) = br.readLine().split(" ").map { it.toInt() }

        if(v1 != v2)
            testCheck = false
    }

    repeat(m){
        val (v1, v2) = br.readLine().split(" ").map { it.toInt() }

        if(v1 != v2)
            systemCheck = false
    }

    if(!testCheck)
        bw.write("Wrong Answer")
    else if(systemCheck)
        bw.write("Accepted")
    else
        bw.write("Why Wrong!!!")



    bw.close()
    br.close()
}