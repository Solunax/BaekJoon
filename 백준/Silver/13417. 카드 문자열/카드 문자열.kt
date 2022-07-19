import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val case = br.readLine().toInt()
    val string = LinkedList<String>()

    for(i in 0 until case){
        val n = br.readLine().toInt()
        val array = br.readLine().split(" ")

        string.add(array[0])
        for(j in 1 until n){
            if(string.first() >= array[j])
                string.addFirst(array[j])
            else
                string.addLast(array[j])
        }

        string.forEach {
            bw.write(it)
        }
        bw.write("\n")
        string.clear()
    }

    bw.close()
    br.close()
}