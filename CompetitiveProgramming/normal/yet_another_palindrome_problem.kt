fun main() {
    var t = readLine()!!.toInt()
    val MAX = 5000
    for (none in 1..t) {
        var length = readLine()!!.toInt()
        var buffer = readLine()!!.split(" ").map { it.toInt() }   
        
        var mask = IntArray(length+1){ MAX }
        var flag = true
        for (i in 0..length-1) {
            if(mask[buffer[i]] < i) {
                println("YES")
                flag = flag.not()
                break
            }else if (mask[buffer[i]] > i){
                mask[buffer[i]] = i + 1
            }
        }
        if(flag) {
            println("NO")
        }
    }
}

/*
5
3
1 2 1
5
1 2 2 3 2
3
1 1 2
4
1 2 2 1
10
1 1 2 2 3 3 4 4 10 10

borderlines {
    t = 1..100
    n = 3..5000
    a = 1..5000(n)
    Sum(n) <= 5000
}


if a == ascend or decend { NO }
ai need to repeat with other in the middle 

num of elements is even for any k
n5 : a1 a2 a3 a4 a5 = 1 2 2 3 2 -> 2 2 2, 2 3 2
n5 : a1 a2 a3 r2 r1 asdfdsa
n5 : a1 a2 r1 asdfdsa
n5 : a1 asdfdsa

n6 : a1 a2 a3 a4 r3 r2 r1 asdzsa
n6 : a1 a2 a3 r2 r1 aszdsa
n6 : a1 a2 r1 azddsa
n6 : a1 zsddsa


*/