import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val input = br.readLine()

        if(input.length == 1)
            bw.write("$input\n$input")
        else{
            val p1 = StringBuilder()
            val p2 = StringBuilder()

            var check = true

            input.forEach {
                when(check){
                    true -> p1.append(it)
                    false -> p2.append(it)
                }

                check = !check
            }

            if(input.length % 2 != 0){
                check = true

                input.forEach {
                    when(check){
                        true -> p2.append(it)
                        false -> p1.append(it)
                    }

                    check = !check
                }
            }

            bw.write("$p1\n$p2")
        }

        bw.write("\n")
    }

    bw.close()
    br.close()
}