import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val num = listOf(3, 2, 1, 2, 4, 3, 1, 3, 1, 1, 3, 1, 3, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1)

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val (a, b) = br.readLine().split(" ")

    val sb = StringBuilder()
    if(n > m){
        for(i in b.indices){
            sb.append(a[i])
            sb.append(b[i])
        }
        sb.append(a.substring(b.length))
    }else if(m > n){
        for(i in a.indices){
            sb.append(a[i])
            sb.append(b[i])
        }
        sb.append(b.substring(a.length))
    }else{
        for(i in a.indices){
            sb.append(a[i])
            sb.append(b[i])
        }
    }

    var arr = ArrayList<Int>()
    sb.forEach {
        arr.add(num[it-'A'])
    }

    var sum : Int
    while(arr.size > 2){
        val temp = ArrayList<Int>()
        for(i in 0 until arr.size-1){
            sum = arr[i] + arr[i+1]
            if(sum > 9)
                temp.add(sum.toString()[1]-'0')
            else
                temp.add(sum)
        }
        arr = temp
    }

    if(arr[0] == 0)
        bw.write("${arr[1]}%")
    else
        bw.write("${arr[0]}${arr[1]}%")

    br.close()
    bw.close()
}