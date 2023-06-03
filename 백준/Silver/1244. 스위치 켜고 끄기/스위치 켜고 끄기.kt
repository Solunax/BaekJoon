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
                var count = 1
                switch[num - 1] = if(switch[num - 1] == 0)
                    1
                else
                    0

                while(true){
                    if(num - count - 1 < 0 || num + count - 1 >= n)
                        break

                    if(switch[num - 1 - count] == switch[num - 1 + count]){
                        switch[num - 1 - count] = if(switch[num - 1 - count] == 0)
                            1
                        else
                            0

                        switch[num - 1 + count] = if(switch[num - 1 + count] == 0)
                            1
                        else
                            0
                    }else
                        break

                    count++
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