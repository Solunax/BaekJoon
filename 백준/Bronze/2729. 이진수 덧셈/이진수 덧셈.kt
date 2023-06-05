import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        var (v1, v2) = br.readLine().split(" ").map { it.reversed() }
        val result = StringBuilder()

        if(v1.length < v2.length)
            v1 = v2.also { v2 = v1 }

        var up = false
        for(i in v2.indices){
            var n1 = v1[i] - '0'
            val n2 = v2[i] - '0'

            if(up){
                n1 += 1
                up = false
            }

            if(n1 + n2 >= 2){
                up = true
                result.append("${(n1 + n2) % 2}")
            }else
                result.append("${n1 + n2}")
        }

        for(i in v2.length until v1.length){
            var n1 = v1[i] - '0'

            if(up){
                n1 += 1
                up = false
            }

            if(n1 >= 2){
                up = true
                result.append("${n1 % 2}")
            }else
                result.append("$n1")
        }

        if(up)
            result.append("1")

        if(!result.contains("1"))
            bw.write("0")
        else{
            var firstCheck = false
            result.reverse().forEach {
                if(it != '0')
                    firstCheck = true

                if(it == '0'){
                    if(firstCheck)
                        bw.write("$it")
                } else
                    bw.write("$it")
            }
        }

        bw.write("\n")
    }

    bw.close()
    br.close()
}