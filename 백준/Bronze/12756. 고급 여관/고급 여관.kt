import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var (aATK, aLife) = br.readLine().split(" ").map{ it.toInt() }
    var (bATK, bLife) = br.readLine().split(" ").map{ it.toInt() }

    while(true){
        aLife -= bATK
        bLife -= aATK

        if(aLife <= 0 && bLife <= 0){
            bw.write("DRAW")
            break
        }else if(aLife <= 0){
            bw.write("PLAYER B")
            break
        }else if(bLife <= 0){
            bw.write("PLAYER A")
            break
        }
    }

    br.close()
    bw.close()
}