import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val pass = br.readLine().split("").filter { it.isNotEmpty() }
    val encrypt = br.readLine()
    val encryptArr = encrypt.chunked(encrypt.length/pass.size)
    val encArr = ArrayList<String>()
    val sortedPass = pass.sorted()

    for(i in pass.indices){
        val sb = StringBuilder()

        sb.append(sortedPass[i])
        sb.append(encryptArr[i])

        encArr.add(sb.toString())
    }

    val decrypt = ArrayList<String>()
    for(i in pass.indices){
        for(j in 0 until encArr.size){
            if(encArr[j].startsWith(pass[i])){
                decrypt.add(encArr[j])
                encArr.removeAt(j)
                break
            }
        }
    }

    for(i in 1 until decrypt[0].length){
        for(j in pass.indices){
            bw.write("${decrypt[j][i]}")
        }
    }

    br.close()
    bw.close()
}