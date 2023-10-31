import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine()

    val type = if(input == "fdsajkl;" || input == "jkl;fdsa") {
        "in-out"
    } else if (input == "asdf;lkj" || input == ";lkjasdf") {
        "out-in"
    } else if (input == "asdfjkl;"){
        "stairs"
    } else if (input == ";lkjfdsa"){
        "reverse"
    } else {
        "molu"
    }

    bw.write(type)

    bw.close()
    br.close()
}
