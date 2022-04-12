import java.util.*

fun main(){
    val sc = Scanner(System.`in`)

    val loop = sc.nextInt()
    sc.nextLine()

    for(i in 1..loop){
        val height = sc.nextInt()
        val width = sc.nextInt()
        var customer = sc.nextInt()

        var roomY = 0
        var roomX = 0

        if(customer % height == 0){
            roomY = height
            roomX = customer / height
        }else{
            roomY = (customer % height)
            roomX = (customer / height) + 1
        }

        if(roomX / 10 == 0)
            println("$roomY" +"0"+ "$roomX")
        else
            println("$roomY$roomX")
    }
}