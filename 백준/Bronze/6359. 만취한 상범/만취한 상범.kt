import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val n = br.readLine().toInt()
        val jail = Array(n+1){false}
        jail[0] = false

        repeat(n){ v ->
            val value = v+1
            for(i in 1..n){
                if(value*i <= n)
                    jail[i*value] = !jail[i*value]
            }
        }

        var result = 0
        jail.forEach {
            if(it)
                result++
        }
        bw.write("$result\n")
    }

    bw.close()
    br.close()
}