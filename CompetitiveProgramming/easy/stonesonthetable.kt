fun main(args: Array<String>) {
    var n = readLine()!!
    var strin = readLine()!!
    var aux = "x"
    var count = 0
    for (c in strin) {
        if( c != aux[0] ) {
            aux = c + aux
        }
        else {
            count++
        }
    }
    println(count)
}