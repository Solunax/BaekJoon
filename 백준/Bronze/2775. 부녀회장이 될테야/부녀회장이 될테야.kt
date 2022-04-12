import java.util.*

fun main(){
    val sc = Scanner(System.`in`)

    val loop = sc.nextInt()

    for(i in 1..loop){
        val floor = sc.nextInt()
        val room = sc.nextInt()

        val array = Array(floor+1) { IntArray(room) { 0 } }

        for(i in 0 until room)
            array[0][i] = i + 1

        for(i in 0 .. floor)
            array[i][0] = 1

        for(f in 1 .. floor){
            for(r in 1 until room)
                array[f][r] = array[f][r-1] + array[f-1][r]
        }
        
        println(array[floor][room-1])
    }
}