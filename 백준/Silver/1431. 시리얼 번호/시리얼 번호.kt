import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val array = Array(n){""}

    repeat(n){
        array[it] = br.readLine()
    }

    array.sortWith{ o1, o2 ->
        if(o1.length != o2.length)
            o1.length - o2.length
        else{
            var v1 = 0
            var v2 = 0
            for(i in o1.indices){
                if(o1[i] in '0' .. '9')
                    v1 += o1[i].code - '0'.code
                if(o2[i] in '0' .. '9')
                    v2 += o2[i].code - '0'.code
            }

            if(v1 != v2){
                v1 - v2
            }
            else
                o1.compareTo(o2)

        }
    }

    for(i in array)
        bw.write("$i\n")

    bw.close()
    br.close()
}