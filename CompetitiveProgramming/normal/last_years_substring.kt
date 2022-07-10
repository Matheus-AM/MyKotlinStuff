fun main() {
    var n = readLine()!!.toInt()
    for (i in 1..n) {
        var m = readLine()!!.toInt()
        var buffer = readLine()!!
        var head = buffer.subSequence(0, 4)
        var tail = buffer.subSequence(m-4, m)

        if(head == "2020" || tail == "2020") {
            println("YES")
            continue
        }
        else if(head.subSequence(0, 3) == "202" && tail[3] == '0') {
            println("YES")
            continue
        }
        else if(head.subSequence(0, 2) == "20" && tail.subSequence(2, 4) == "20") {
            println("YES")
            continue
        }
        else if(head[0] == '2' && tail.subSequence(1, 4) == "020") {
            println("YES")
            continue
        }
        println("NO")

    }   
}