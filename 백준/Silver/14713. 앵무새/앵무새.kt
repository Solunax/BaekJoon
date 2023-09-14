import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
var n = 0
lateinit var parrot : Array<LinkedList<String>>

fun main() {
    n = br.readLine().toInt()
    parrot = Array(n){ LinkedList<String>() }

    repeat(n){ idx ->
        val input = br.readLine().split(" ")

        input.forEach { str ->
            parrot[idx].add(str)
        }
    }

    getResult(br.readLine())

    bw.close()
    br.close()
}

fun getResult(input : String){
    val checkQueue = LinkedList<String>()

    input.split(" ").forEach {
        checkQueue.add(it)
    }

    while(checkQueue.isNotEmpty()){
        val str = checkQueue.poll()
        var check = false

        for(i in 0 until n){
            if(parrot[i].peek() == str){
                parrot[i].poll()
                check = true
            }
        }

        if(!check){
            bw.write("Impossible")
            return
        }
    }

    for(i in 0 until n){
        while (parrot[i].isNotEmpty()){
            bw.write("Impossible")
            return
        }
    }

    bw.write("Possible")
}