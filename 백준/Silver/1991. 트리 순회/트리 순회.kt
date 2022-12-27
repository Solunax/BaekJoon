import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val tree = Tree()
    repeat(br.readLine().toInt()) {
        val (parent, left, right) = br.readLine().split(" ")
        tree.add(parent, left, right)
    }

    tree.preOrder(tree.root!!)
    bw.write("\n")

    tree.centerOrder(tree.root!!)
    bw.write("\n")

    tree.postOrder(tree.root!!)

    br.close()
    bw.close()
}

class Tree{
    var root : Node? = null

    fun add(parent : String, left : String, right: String){
        if(root == null){
            if(parent != ".")
                root = Node(parent)
            if(left != ".")
                root!!.left = Node(left)
            if(right != ".")
                root!!.right = Node(right)
        }else
            search(root!!, parent, left, right)
    }

    private fun search(root : Node, parent : String, left : String, right: String){
        if(root.value == parent){
            if(left != ".")
                root.left = Node(left)
            if(right != ".")
                root.right = Node(right)
        }else{
            if(root.left != null)
                search(root.left!!, parent, left, right)
            if(root.right != null)
                search(root.right!!, parent, left, right)
        }
    }

    fun preOrder(root : Node){
        bw.write(root.value)

        if(root.left != null)
            preOrder(root.left!!)
        if(root.right != null)
            preOrder(root.right!!)
    }

    fun centerOrder(root : Node){
        if(root.left != null)
            centerOrder(root.left!!)

        bw.write(root.value)

        if(root.right != null)
            centerOrder(root.right!!)
    }

    fun postOrder(root : Node){
        if(root.left != null)
            postOrder(root.left!!)

        if(root.right != null)
            postOrder(root.right!!)

        bw.write(root.value)
    }
}

class Node(var value: String, var left: Node? = null, var right: Node? = null)