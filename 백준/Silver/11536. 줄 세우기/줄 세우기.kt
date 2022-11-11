import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val names = ArrayList<String>()

    repeat(br.readLine().toInt()){
        names.add(br.readLine())
    }

    val nameAscending = names.sorted()
    val nameDescending = names.sortedDescending()

    var ascendingCheck = true
    var descendingCheck = true

    for(i in names.indices){
        if(names[i] != nameAscending[i])
            ascendingCheck = false

        if(names[i] != nameDescending[i])
            descendingCheck = false

        if(!ascendingCheck && !descendingCheck)
            break
    }

    if(ascendingCheck)
        bw.write("INCREASING")
    else if(descendingCheck)
        bw.write("DECREASING")
    else
        bw.write("NEITHER")

    bw.close()
    br.close()
}