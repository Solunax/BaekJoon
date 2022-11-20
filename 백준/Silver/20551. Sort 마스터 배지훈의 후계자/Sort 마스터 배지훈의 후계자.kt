import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val(n, m) = br.readLine().split(" ").map { it.toInt() }

    val arr = Array(n){0}
    val set = HashSet<Int>()
    repeat(n){
        val input = br.readLine().toInt()
        arr[it] = input
        set.add(input)
    }
    arr.sort()

    repeat(m){
        val find = br.readLine().toInt()

        if(set.contains(find)){
            bw.write("${search(arr, find)}\n")
        }else
            bw.write("-1\n")
    }

    bw.close()
    br.close()
}

fun search(arr : Array<Int>, find : Int) : Int{
    var start = 0
    var end = arr.size-1
    var center = (start + end)/2

    while(start < end){
        if(arr[center] < find)
            start = center+1
        else
            end = center

        center = (start+end)/2
    }

    return center
}