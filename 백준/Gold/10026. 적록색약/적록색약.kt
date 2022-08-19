import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
var count = 0
val moveY = listOf(1, -1, 0, 0)
val moveX = listOf(0, 0, 1, -1)

fun main() {
    val n = br.readLine().toInt()
    val tree = Array(n){ Array(n){""} }
    val check = Array(n){ Array(n){0} }

    repeat(n){
        tree[it] = br.readLine().split("").filter {a -> a.isNotEmpty() }.toTypedArray()
    }

    for(i in 0 until n){
        for(j in 0 until n){
            if(check[i][j] != 1){
                dfs(i, j, tree, check, n, tree[i][j])
                count++
            }
        }
    }

    bw.write("$count ")
    count = 0

    for(i in 0 until  n){
        for(j in 0 until n){
            check[i][j] = 0
            if(tree[i][j] == "G")
                tree[i][j] = "R"
        }
    }

    for(i in 0 until  n){
        for(j in 0 until n){
            if(check[i][j] != 1){
                count++
                dfs(i, j, tree, check, n, tree[i][j])
            }
        }
    }

    bw.write("$count")
    bw.close()
    br.close()
}

fun dfs(ox : Int, oy : Int, tree : Array<Array<String>>, check : Array<Array<Int>>, line : Int, color : String){
    check[ox][oy] = 1

    var nx : Int
    var ny : Int

    for(i in 0 until 4){
        nx = ox + moveX[i]
        ny = oy + moveY[i]

        if(nx in 0 until line && ny in 0 until line){
            if(tree[nx][ny] == color && check[nx][ny] != 1)
                dfs(nx, ny, tree, check, line, color)
        }
    }
}