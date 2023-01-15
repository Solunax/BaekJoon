import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val bingo = Array(5){ Array(5){0} }

fun main() {
    repeat(5){
        bingo[it] = br.readLine().split(" ").map { v -> v.toInt() }.toTypedArray()
    }

    val numSeq = ArrayList<Int>()
    repeat(5){
        br.readLine().split(" ").map { it.toInt() }.forEach {
            numSeq.add(it)
        }
    }

    var result = 0
    for(i in 0 until 25){
        for(x in 0 until 5){
            for(y in 0 until 5){
                if(bingo[x][y] == numSeq[i]){
                    bingo[x][y] = 0
                    break
                }
            }
        }

        if(bingoCheck()){
            result = i + 1
            break
        }
    }
    bw.write("$result")

    br.close()
    bw.close()
}

fun bingoCheck() : Boolean{
    var line = 0

    if(bingo[0][0] == 0 && bingo[1][1] == 0 && bingo[2][2] == 0 && bingo[3][3] == 0 && bingo[4][4] == 0)
        line++

    if(bingo[0][4] == 0 && bingo[1][3] == 0 && bingo[2][2] == 0 && bingo[3][1] == 0 && bingo[4][0] == 0)
        line++

    for(i in 0 until 5){
        if(bingo[0][i] == 0){
            var flag = true
            for(j in 0 until 5){
                if(bingo[j][i] != 0){
                    flag = false
                    break
                }
            }

            if(flag)
                line++
        }

        if(line >= 3)
            return true
    }

    for(i in 0 until 5){
        if(bingo[i][0] == 0){
            var flag = true
            for(j in 0 until 5){
                if(bingo[i][j] != 0){
                    flag = false
                    break
                }
            }

            if(flag)
                line++
        }

        if(line >= 3)
            return true
    }

    return false
}