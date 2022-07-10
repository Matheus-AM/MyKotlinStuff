fun main(args: Array<String>) {
    var n = readLine()!!.toInt()
    var i = 0
    while (i != n) {        
        var str = readLine()!!
        var len = str.length
        var newstr = str
        if(len > 10) {
            newstr = str[0] + (len-2).toString() + str[len-1]
        }
        println(newstr)
        i++
    }

}