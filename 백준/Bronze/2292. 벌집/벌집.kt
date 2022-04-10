import java.util.*

fun main(){
    val sc = Scanner(System.`in`)

    val location = sc.nextInt()
    var line = 1
    var roomNumber = 1

    if(location == 1)
        println(1)
    else{
        while(roomNumber < location){
            roomNumber +=  line * 6
            line++
        }
        println(line)
    }
}