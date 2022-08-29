import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        br.readLine().toInt()
        val note1 = br.readLine().split(" ").map{ it.toInt() }.sorted()

        br.readLine().toInt()
        val note2 = br.readLine().split(" ").map{ it.toInt()}

        note2.forEach {
            var flag = false
            var start = 0
            var end = note1.size - 1
            var mid = (start + end) / 2

            while(end - start >= 0){
                if(note1[mid] == it){
                    flag = true
                    break
                } else if(note1[mid] <= it)
                    start = mid + 1
                else
                    end = mid - 1

                mid = (start + end) / 2
            }

            if(flag)
                bw.write("1\n")
            else
                bw.write("0\n")
        }
    }

    bw.close()
    br.close()
}
