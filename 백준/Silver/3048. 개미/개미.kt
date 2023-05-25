import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (v1, v2) = br.readLine().split(" ").map{ it.toInt() }
    val len = v1 + v2
    val n1 = br.readLine().reversed()
    val n2 = br.readLine()
    val t = br.readLine().toInt()

    var ant = (n1 + n2).split("").filter { it.isNotEmpty() }.toTypedArray()
    var state = Array(len){false}

    repeat(v1){
        state[it] = true
    }

    for(i in 0 until t){
        val temp = Array(len){""}
        val tempState = Array(len){false}

        var index = 0
        while(index < len){
            if(index + 1 < len){
                if(state[index] && !state[index + 1]) {
                    temp[index] = ant[index + 1]
                    temp[index + 1] = ant[index]
                    tempState[index] = state[index + 1]
                    tempState[index + 1] = state[index]
                    index += 2
                    continue
                }
            }

            temp[index] = ant[index]
            tempState[index] = state[index]
            index += 1
        }

        ant = temp
        state = tempState
    }

    ant.forEach {
        bw.write(it)
    }

    bw.close()
    br.close()
}