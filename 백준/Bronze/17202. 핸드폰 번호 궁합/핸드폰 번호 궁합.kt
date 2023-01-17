import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val v1 = br.readLine()
    val v2 = br.readLine()
    var arr = ArrayList<Char>()

    for(i in v1.indices){
        arr.add(v1[i])
        arr.add(v2[i])
    }

    while(arr.size != 2){
        arr = sumValues(arr)
    }

    arr.forEach {
        bw.write("$it")
    }

    br.close()
    bw.close()
}

fun sumValues(arr : ArrayList<Char>) : ArrayList<Char>{
    val temp = ArrayList<Char>()

    for(i in 0 until arr.size-1){
        val value = ((arr[i]-'0') + (arr[i+1]-'0')).toString()

        if(value.length == 1)
            temp.add(value[0])
        else
            temp.add(value[1])
    }


    return temp
}