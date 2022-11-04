import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while(true){
        var input = br.readLine()

        if(input == "EOI")
            break

        input = input.lowercase()

        if(input.contains("nemo"))
            bw.write("Found\n")
        else
            bw.write("Missing\n")
    }

    bw.close()
    br.close()
}