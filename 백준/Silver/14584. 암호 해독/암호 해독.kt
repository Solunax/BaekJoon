import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val encrypt = br.readLine().toCharArray()
    val n = br.readLine().toInt()

    val dict = Array(n){""}
    repeat(n){
        dict[it] = br.readLine()
    }

    for(i in 0 until 26){
        for(j in encrypt.indices)
            encrypt[j] = 'a'+((encrypt[j]-'a'+1)%26)

        val str = StringBuilder().append(encrypt).toString()
        for(j in 0 until n){
            if(str.contains(dict[j])){
                bw.write(str)
                break
            }
        }
    }

    br.close()
    bw.close()
}