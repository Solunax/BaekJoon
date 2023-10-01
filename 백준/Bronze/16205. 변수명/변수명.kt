import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.ArrayList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (case, name) = br.readLine().split(" ")
    val arr = ArrayList<String>()

    when(case.toInt()){
        2 -> {
            name.split("_").forEach {
                arr.add(it)
            }
        }

        else -> {
            val sb = StringBuilder()
            sb.append(name[0])

            for(i in 1 until  name.length){
                if(name[i] in 'A'..'Z'){
                    arr.add(sb.toString())
                    sb.clear()
                }

                sb.append(name[i])
            }

            arr.add(sb.toString())
        }
    }

    for(i in arr.indices){
        if(i == 0)
            bw.write(arr[i].lowercase())
        else
            bw.write(arr[i].replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() })
    }
    bw.write("\n")

    for(i in arr.indices){
        if(i != arr.size - 1)
            bw.write("${arr[i].lowercase()}_")
        else
            bw.write(arr[i].lowercase())
    }
    bw.write("\n")

    arr.forEach { str ->
        bw.write(str.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() })
    }

    bw.close()
    br.close()
}