fun main() {
    var strin = readLine()!!
    var A = 0
    var B = 0
    var Alist: MutableList<Int> = mutableListOf();
    var Blist: MutableList<Int> = mutableListOf();
    for(i in 0..2) {
        A = strin.indexOf("AB", A)        
        Alist.add(A)
        if(Alist[0] == -1){
            println("NO")
            return
        }
        B = strin.indexOf("BA", B)            
        Blist.add(B)
        if(Blist[0] == -1){
            println("NO")
            return
        }
        A++
        B++
    }
    
    for(i in 0..2){
        if(Alist[i] == -1) continue
        for(j in 0..2){
            if(Blist[j] == -1) continue
            var dif = Alist[i] - Blist[j]
            if(Math.abs(dif) > 1){
                println("YES")
                return
            } 
        }
    }
    println("NO")
    return
}

/*
ABBA
ABABA

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