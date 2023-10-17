import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

var now = 0
val map = Array(3){ Array(3){""} }

fun main() {
    var flag = false
    now = br.readLine().toInt()

    for(i in 0 until 9){
        val (y, x) = br.readLine().split(" ").map { it.toInt() - 1 }

        map[y][x] = if(now == 1){
            "O"
        } else {
            "X"
        }

        if (winCheck()){
            flag = true
            break
        }

        now = if(now == 1) {
            2
        } else {
            1
        }
    }

    if(flag){
        bw.write("$now")
    } else {
        bw.write("0")
    }

    bw.close()
    br.close()
}

fun winCheck() : Boolean {
    for(i in 0 until 3){
        if(map[0][i] == map[1][i] && map[1][i] == map[2][i] && map[0][i] != "")
            return true

        if(map[i][0] == map[i][1] && map[i][1] == map[i][2] && map[i][0] != "")
            return true
    }

    if(map[0][0] == map[1][1] && map[1][1] == map[2][2] && map[0][0] != "")
        return true

    if(map[0][2] == map[1][1] && map[1][1] == map[2][0] && map[0][2] != "")
        return true

    return false
}