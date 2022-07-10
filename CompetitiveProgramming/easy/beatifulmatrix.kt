fun main(){
    var count = 0
    var bol = true
    var strin = ""
    while(bol) {
        strin = readLine()!!
        bol = strin.contains("1").not()
        count++
    }
    var list = strin.split(" ").map { it.toInt()}
    var count2 = 1
    for (l in list) {
        if(l == 1) break 
        else count2++
    }   
    count -= 3
    count2 -= 3
    count = count and -count
    count2 = count2 and -count2

    println(count + count2)


}