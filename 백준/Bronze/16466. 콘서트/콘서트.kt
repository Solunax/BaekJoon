import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    br.readLine()
    val ticket = br.readLine().split(" ").map { it.toInt() }.sorted()
    var ticketNumber = 1
    var flag = true

    for(i in ticket.indices){
        if(ticketNumber == ticket[i])
            ticketNumber++
        else{
            bw.write("$ticketNumber")
            flag = false
            break
        }
    }
    
    if(flag)
        bw.write("$ticketNumber")

    br.close()
    bw.close()
}