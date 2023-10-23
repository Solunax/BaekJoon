import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var location : ArrayList<Pair<Int, Int>>

fun main() {
   repeat(br.readLine().toInt()){
       val n = br.readLine().toInt()
       location = ArrayList()
       location.add(Pair(-1, 0))

       repeat(n){
           val (x, y) = br.readLine().split(" ").map { v -> v.toInt() }
           location.add(Pair(x, y))
       }

       location.sortWith{ o1, o2 ->
           if(o1.first == o2.first){
               o1.second - o2.second
           }else{
               o1.first - o2.first
           }
       }

       var index = 1

       while(index <= n){
           if(location[index].first == location[index - 1].first){
               index++
           } else if(location[index].second == location[index - 1].second){
               index++
           } else {
               val now = index
               val nowX = location[index].first

               while (index <= n && nowX == location[index].first) {
                   index++
               }

               val tempArray = location.subList(now, index)
               tempArray.reverse()
           }
       }

       val m = br.readLine().split(" ").map { it.toInt() }

       for(i in 1 until m.size)
           bw.write("${location[m[i]].first} ${location[m[i]].second}\n")
   }

    bw.close()
    br.close()
}