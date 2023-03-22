import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while(true){
        val input = br.readLine()

        if(input == "#")
            break

        val bit = input.substring(0, input.length - 1)

        var one = 0
        var zero = 0
        bit.forEach {
            when(it){
                '1' -> one++
                '0' -> zero++
            }
        }

        when(input.last()){
            'e' -> {
                if(one % 2 == 0)
                    bw.write("${bit}0")
                else
                    bw.write("${bit}1")
            }
            'o' -> {
                if(one % 2 == 1)
                    bw.write("${bit}0")
                else
                    bw.write("${bit}1")
            }
        }
        bw.write("\n")
    }

    br.close()
    bw.close()
}