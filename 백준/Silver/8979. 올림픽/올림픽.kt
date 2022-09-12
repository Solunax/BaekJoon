import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val rank = ArrayList<Nation>()
    repeat(n){
        val (name, g, s, b) = br.readLine().split(" ").map { it.toInt() }
        rank.add(Nation(name, g, s, b))
    }
    rank.sort()
    var r = 1
    var same = 1

    if(rank[0].country == k)
        bw.write("$r")
    else{
        for(i in 1 until rank.size){
            if(rank[i-1].gold == rank[i].gold && rank[i-1].silver == rank[i].silver && rank[i-1].bronze == rank[i].bronze)
                same++
            else{
                r += same
                same = 1
            }

            if(rank[i].country == k){
                bw.write("$r")
                break
            }
        }
    }


    bw.close()
    br.close()
}

class Nation(val country : Int,
             val gold : Int,
             val silver : Int,
             val bronze : Int) : Comparable<Nation>{

    override fun compareTo(other: Nation): Int {
        return if(this.gold == other.gold){
            if(this.silver == other.silver)
                other.bronze - this.bronze
            else
                other.silver - this.silver
        }else
            other.gold - this.gold
    }
}