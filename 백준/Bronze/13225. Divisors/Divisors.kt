import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val n = br.readLine().toInt()
        val divide = HashSet<Int>()

        for(i in 1 .. n){
            if(n % i == 0){
                divide.add(i)
                divide.add(n / i)
            }
        }

        bw.write("$n ${divide.size}\n")
    }

    bw.close()
    br.close()
}