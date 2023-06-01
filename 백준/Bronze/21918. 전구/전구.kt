import java.io.BufferedReader
import java.io.InputStreamReader


val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (_, m) = br.readLine().split(" ").map { it.toInt() }
    val state = br.readLine().split(" ").map { it.toInt() }.toTypedArray()

    repeat(m){
        val command = br.readLine().split(" ").map { it.toInt() }

        when(command[0]){
            1 -> state[command[1] - 1] = command[2]
            2 -> {
                for(i in command[1] - 1 until command[2]){
                    if(state[i] == 0)
                        state[i] = 1
                    else
                        state[i] = 0
                }
            }
            3 -> {
                for(i in command[1] - 1 until  command[2])
                    state[i] = 0
            }
            4 -> {
                for(i in command[1] - 1 until command[2])
                    state[i] = 1
            }
        }
    }

    state.forEach {
        bw.write("$it ")
    }

    bw.close()
    br.close()
}