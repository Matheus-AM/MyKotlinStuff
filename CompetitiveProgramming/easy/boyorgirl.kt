fun main() {
    var strin = readLine()!!
    var count = 0
    var strrepeat = ""
    for (s in strin) {
        if(handleRepeat(s, strrepeat).not()){
            count++
            strrepeat = strrepeat.plus(s)
        }
    }
    if(count%2 == 0) println("CHAT WITH HER!")
    else println("IGNORE HIM!")
}

fun handleRepeat(s:Char, str:String):Boolean{
    for (c in str) {
        if(c == s) {
            return true            
        }
    }
    return false
}