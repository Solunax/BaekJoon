import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var index = 1

    while (true) {
        val n = br.readLine().toInt()
        val message = ArrayList<Message>()
        var nasty = false

        if (n == 0) {
            break
        }

        repeat(n) {
            val input = br.readLine().split(" ")
            message.add(Message(input[0], input.subList(1, n)))
        }

        bw.write("Group $index\n")
        
        for (i in 0 until n) {
            val name = message[i].name
            val messageData = message[i].messages

            for (j in 1 until n) {
                if (messageData[j - 1] == "N") {
                    val other = if (i - j < 0) {
                        i + n - j
                    } else {
                        i - j
                    }

                    bw.write("${message[other].name} was nasty about $name\n")
                    nasty = true
                }
            }
        }

        if (!nasty) {
            bw.write("Nobody was nasty\n")
        }
        bw.write("\n")

        index++
    }

    bw.close()
    br.close()
}

class Message(val name: String, val messages: List<String>)