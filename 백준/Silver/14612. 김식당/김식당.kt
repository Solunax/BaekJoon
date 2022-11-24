import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, _) = br.readLine().split(" ").map{ it.toInt() }
    val orders = ArrayList<Order>()
    repeat(n){
        val command = br.readLine().split(" ")
        when(command[0]){
            "order" -> orders.add(Order(command[1].toInt(), command[2].toInt()))
            "sort" -> orders.sort()
            "complete" -> {
                val tableNum = command[1].toInt()
                for(i in 0 until orders.size){
                    if (orders[i].table == tableNum){
                        orders.removeAt(i)
                        break
                    }
                }
            }
        }

        var count = 0
        for(i in 0 until orders.size){
            bw.write("${orders[i].table} ")
            count++
        }
        if(count == 0)
            bw.write("sleep")

        bw.write("\n")
    }

    bw.close()
    br.close()
}

class Order(val table : Int, val time : Int):Comparable<Order>{
    override fun compareTo(other: Order): Int {
        return if(this.time == other.time)
            this.table - other.table
        else
            this.time - other.time
    }
}