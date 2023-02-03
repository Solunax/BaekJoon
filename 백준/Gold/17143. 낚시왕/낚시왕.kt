import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

var mapR = 0
var mapC = 0

fun main() {
    val (r, c, n) = br.readLine().split(" ").map{ it.toInt() }
    mapR = r
    mapC = c

    var map = Array(r){ arrayOfNulls<Shark>(c) }
    repeat(n){
        val input = br.readLine().split(" ").map { it.toInt() }
        map[input[0]-1][input[1]-1] = Shark(input[0]-1, input[1]-1, input[2], input[3], input[4])
    }

    var result = 0
    for(x in 0 until c){
        for(y in 0 until r){
            if(map[y][x] != null){
                result += map[y][x]!!.z
                map[y][x] = null
                break
            }
        }

        val queue = LinkedList<Shark>()
        for(i in 0 until r){
            for(j in 0 until c){
                if(map[i][j] != null)
                    queue.add(Shark(i, j, map[i][j]!!.s, map[i][j]!!.d, map[i][j]!!.z))
            }
        }

        map = Array(r){ arrayOfNulls(c) }
        while(queue.isNotEmpty()){
            val sh = queue.poll()
            sh.move()

            if(map[sh.r][sh.c] != null){
                if(map[sh.r][sh.c]!!.z < sh.z)
                    map[sh.r][sh.c] = Shark(sh.r, sh.c, sh.s, sh.d, sh.z)
            }else
                map[sh.r][sh.c] = Shark(sh.r, sh.c, sh.s, sh.d, sh.z)
        }
    }

    bw.write("$result")

    br.close()
    bw.close()
}

class Shark(var r : Int, var c : Int, val s : Int, var d : Int, var z : Int){
    fun move(){
        for(i in 0 until s){
            when(d){
                1 -> {
                    r -= 1

                    if(r < 0){
                        r = 1
                        d = 2
                    }
                }
                2 -> {
                    r += 1

                    if(r >= mapR){
                        r = mapR - 2
                        d = 1
                    }
                }
                3 -> {
                    c += 1

                    if(c >= mapC){
                        c = mapC-2
                        d = 4
                    }
                }
                4 -> {
                    c -= 1

                    if(c < 0){
                        c = 1
                        d = 3
                    }
                }
            }
        }
    }
}