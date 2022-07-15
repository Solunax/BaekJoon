import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

var man = 0
var woman = 0
val mem = br.readLine().toInt()
val people = br.readLine().split("").filter { it.isNotEmpty() }.toMutableList()

fun main() {
    while(people.isNotEmpty()){
        if(checkPerson(0))
            continue
        else if(people.size == 1)
            break
        else if(checkPerson(1))
            continue
        else
            break
    }

    bw.write("${man + woman}")
    bw.close()
    br.close()
}

fun checkPerson(index:Int):Boolean{
    val gender = people[index]

    return if(gender == "M" && abs((man + 1) - woman) <= mem ){
        people.removeAt(index)
        man++
        true
    }else if (gender == "W" && abs((woman + 1) - man) <= mem){
        people.removeAt(index)
        woman++
        true
    }else
        false
}