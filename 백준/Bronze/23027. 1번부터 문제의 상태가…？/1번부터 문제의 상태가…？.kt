import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val str = br.readLine()
    val set = HashSet<Char>()
    val check = listOf('A', 'B', 'C')

    str.forEach {
        if(it in check)
            set.add(it)
    }

    val sb = StringBuilder()
    if(set.contains('A')){
       str.forEach { c ->
           when(c){
               in listOf('B', 'C', 'D', 'F') -> sb.append('A')
               else -> sb.append(c)
           }
       }
    }else if(set.contains('B')){
        str.forEach { c ->
            when(c){
                in listOf('C', 'D', 'F') -> sb.append('B')
                else -> sb.append(c)
            }
        }
    }else if(set.contains('C')){
        str.forEach { c ->
            when(c){
                in listOf('D', 'F') -> sb.append('C')
                else -> sb.append(c)
            }
        }
    }else {
        str.forEach { _ ->
            sb.append('A')
        }
    }
    bw.write("$sb")

    bw.close()
    br.close()
}