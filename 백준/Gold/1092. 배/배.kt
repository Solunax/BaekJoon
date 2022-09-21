import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val crane = br.readLine().split(" ").map { it.toInt() }.sortedDescending()
    br.readLine().toInt()
    val box = br.readLine().split(" ").map { it.toInt() }.toMutableList()
    box.sortDescending()

    if(crane.first() < box.first())
        bw.write("-1")
    else{
        var time = 0
        while(box.isNotEmpty()){
            var i = 0
            var index = 0
            while(i < n){
                if(index == box.size)
                    break
                else if(crane[i] >= box[index]){
                    box.removeAt(index)
                    i++
                }else
                    index++
            }

            time++
        }
        bw.write("$time")
    }

    bw.close()
    br.close()
}