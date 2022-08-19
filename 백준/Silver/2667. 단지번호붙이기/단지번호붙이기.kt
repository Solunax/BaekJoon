import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
var count = 0
val moveY = listOf(1, -1, 0, 0)
val moveX = listOf(0, 0, 1, -1)

fun main() {
    val n = br.readLine().toInt()
    val tree = Array(n + 1){ Array(n+1){0} }
    val check = Array(n + 1){ Array(n+1){0} }
    var total = 0
    val counts = ArrayList<Int>()

    repeat(n){
        tree[it] = br.readLine().split("").filter {a -> a.isNotEmpty() }.map {b ->  b.toInt() }.toTypedArray()
    }

    for(i in 0 .. n){
        for(j in 0 until n){
            count = 0
            if(tree[i][j] == 1 && check[i][j] != 1){
                total++
                count++
                dfs(j, i, tree, check, n)
                counts.add(count)
            }
        }
    }

    bw.write("$total\n")
    counts.sorted().forEach{
        bw.write("$it\n")
    }

    bw.close()
    br.close()
}

fun dfs(ox : Int, oy : Int, tree : Array<Array<Int>>, check : Array<Array<Int>>, line : Int){
    check[oy][ox] = 1

    var nx : Int
    var ny : Int

    for(i in 0 until 4){
        nx = ox + moveX[i]
        ny = oy + moveY[i]

        if(nx in 0 until line && (ny in 0 until line)){
            if(tree[ny][nx] == 1 && check[ny][nx] != 1){
                count++
                dfs(nx, ny, tree, check, line)
            }
        }
    }
}