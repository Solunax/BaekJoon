import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val n = br.readLine().toInt()
        val encrypt1 = br.readLine().split(" ")
        val encrypt2 = br.readLine().split(" ")
        val encryptOrigin = br.readLine().split(" ")
        val arr = Array(n){""}

        repeat(n){
            arr[encrypt1.indexOf(encrypt2[it])] = encryptOrigin[it]
        }

        arr.forEach {
            bw.write("$it ")
        }
        bw.write("\n")
    }

    bw.close()
    br.close()
}