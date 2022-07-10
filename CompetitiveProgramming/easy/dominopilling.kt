fun main(){
    var sqr : Int = 1
    //1 <= m <= n <= 16
    readLine()!!.split(" ").map{ sqr *= it.toInt()}
    var result = sqr/2
    println(result)
}