import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        br.readLine()
        val a = HashSet(br.readLine().split(" ").map { it.toInt() }).toList()

        br.readLine()
        val b = HashSet(br.readLine().split(" ").map { it.toInt() }).toList()

        br.readLine()
        val c = HashSet(br.readLine().split(" ").map { it.toInt() }).toList()

        val lucky = HashSet<Int>()

        for(i in a.indices){
            for(j in b.indices){
                for(k in c.indices){
                    val sum = (a[i] + b[j] + c[k]).toString()
                    var flag = true
                    for(x in sum.indices){
                        if(sum[x] == '5' || sum[x] == '8')
                            continue
                        else{
                            flag = false
                            break
                        }
                    }

                    if(flag)
                        lucky.add(sum.toInt())
                }
            }
        }

        bw.write("${lucky.size}\n")
    }

    br.close()
    bw.close()
}