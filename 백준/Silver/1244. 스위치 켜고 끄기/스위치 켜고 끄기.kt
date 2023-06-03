import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val switch = br.readLine().split(" ").map { it.toInt() }.toTypedArray()

    repeat(br.readLine().toInt()){
        val (gender, num) = br.readLine().split(" ").map { it.toInt() }

        when(gender){
            1 -> {
                for(i in 0 until n){
                    if((i + 1) % num == 0){
                        switch[i] = if(switch[i] == 0)
                            1
                        else
                            0
                    }
                }
            }
            2 -> {
                var left = num - 1
                var right = num - 1

                switch[left] = if(switch[left] == 0)
                    1
                else
                    0

                while(true){
                    if(left - 1 >= 0 && right + 1 < n){
                        left -= 1
                        right += 1
                    }else
                        break

                    if(switch[left] == switch[right]){
                        switch[left] = if(switch[left] == 0)
                            1
                        else
                            0

                        switch[right] = if(switch[right] == 0)
                            1
                        else
                            0
                    }else
                        break
                }
            }
        }
    }

    for(i in 0 until n){
        bw.write("${switch[i]} ")

        if((i + 1) % 20 == 0)
            bw.write("\n")
    }

    bw.close()
    br.close()
}