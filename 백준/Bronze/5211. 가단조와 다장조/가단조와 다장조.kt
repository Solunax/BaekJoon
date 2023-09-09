import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val major = listOf('C', 'F', 'G')
    val minor = listOf('A', 'D', 'E')

    var majorCount = 0
    var minorCount = 0
    val input = br.readLine().split("|")

    input.forEach { str ->
        when(str[0]){
            in major -> majorCount++
            in minor -> minorCount++
        }
    }

    if(majorCount > minorCount)
        bw.write("C-major")
    else if(majorCount < minorCount)
        bw.write("A-minor")
    else{
        if(input.last().last() in major)
            bw.write("C-major")
        else
            bw.write("A-minor")
    }

    bw.close()
    br.close()
}