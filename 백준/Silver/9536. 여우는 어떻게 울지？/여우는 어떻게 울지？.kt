import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val str = br.readLine().split(" ").toMutableList()

        while(true){
            val animal = br.readLine().split(" ")

            if(animal[1] == "does")
                break

            for(i in 0 until str.size){
                if(str[i] == animal[2])
                    str[i] = "0"
            }
        }

        str.forEach{
            if(it != "0")
                bw.write("$it ")
        }
        bw.write("\n")
    }

    bw.close()
    br.close()
}