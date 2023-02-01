import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val first = br.readLine().toInt()
    var str = "bottles"
    var n = first

    while(true){
        if(n == 0){
            if(first == 1){
                bw.write("No more bottles of beer on the wall, no more bottles of beer.\n" +
                        "Go to the store and buy some more, $first bottle of beer on the wall.")
            }else{
                bw.write("No more bottles of beer on the wall, no more bottles of beer.\n" +
                        "Go to the store and buy some more, $first bottles of beer on the wall.")
            }

            break
        }else if(n == 1){
            bw.write("1 bottle of beer on the wall, 1 bottle of beer.\n" +
                    "Take one down and pass it around, no more bottles of beer on the wall.\n\n")
            n = 0
        }else{
            bw.write("$n $str of beer on the wall, $n $str of beer.\n")

            if(--n == 1)
                str = "bottle"

            bw.write("Take one down and pass it around, $n $str of beer on the wall.\n\n")
        }
    }

    br.close()
    bw.close()
}