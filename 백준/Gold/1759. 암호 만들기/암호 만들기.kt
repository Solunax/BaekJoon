import java.io.BufferedReader
import java.io.InputStreamReader

val vowel = listOf('a', 'e', 'i', 'o', 'u')

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (l, _) = br.readLine().split(" ").map { it.toInt() }
    val chars = br.readLine().split(" ").sorted()

    getResult(0, 0, "", l, chars)

    bw.close()
    br.close()
}

fun getResult(count:Int, index:Int, str:String, length:Int, list: List<String>){
    if(count==length){
        var consCount = 0
        var vowelCount = 0
        str.forEach {
            if(it in vowel)
                vowelCount++
            else
                consCount++
        }

        if(vowelCount >= 1 && consCount >= 2){
            bw.write("$str\n")
            return
        }
    }

    for(i in index until list.size)
        getResult(count+1, i+1, str + list[i], length, list)
}