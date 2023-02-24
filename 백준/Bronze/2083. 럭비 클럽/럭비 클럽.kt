import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while(true){
        val(name, age, weight) = br.readLine().split(" ")

        if(name == "#")
            break

        if(age.toInt() > 17 || weight.toInt() >= 80)
            bw.write("$name Senior\n")
        else
            bw.write("$name Junior\n")
    }

    br.close()
    bw.close()
}
