import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val case = br.readLine().toInt()
    val array = BooleanArray(21)
    var v = 0

    for(i in 0 until case){
        val command = br.readLine().split(" ")
        if(command[0] != "all" && command[0] != "empty")
            v = command[1].toInt()

        when(command[0]){
            "add" -> array[v] = true
            "remove" -> array[v] = false
            "check" -> {
                if(array[v])
                    bw.write("1\n")
                else
                    bw.write("0\n")
            }
            "toggle" -> array[v] = !array[v]
            "all" -> array.fill(true, 1, 21)
            "empty" -> array.fill(false, 1, 21)
        }
    }

    bw.close()
    br.close()
}