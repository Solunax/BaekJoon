import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map{ it.toInt() }
    val trie = Trie()

    repeat(n){
        trie.insert(br.readLine())
    }

    var result = 0
    repeat(m){
        if(trie.containCheck(br.readLine()))
            result++
    }

    bw.write("$result")

    br.close()
    bw.close()
}

class Trie{
    private var root = TrieNode()

    fun insert(str : String){
        var thisNode = root

        for(char in str)
            thisNode = thisNode.getChild().computeIfAbsent(char) { TrieNode() }

        root.setLast(true)
    }

    fun containCheck(str : String): Boolean {
        var thisNode = root

        for(char in str){
            val node = thisNode.getChild()[char] ?: return false

            thisNode = node
        }

        return true
    }
}

class TrieNode{
    private val child = HashMap<Char, TrieNode>()
    private var isLast : Boolean = false

    fun getChild() : HashMap<Char, TrieNode> {
        return this.child
    }

    fun isLastChar() : Boolean{
        return this.isLast
    }

    fun setLast(value : Boolean){
        this.isLast = value
    }
}