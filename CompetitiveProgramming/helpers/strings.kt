import java.io.File

val name = """
    {
        "name": "jane"
        "value": 10
    }
"""
var name1 = "asd $name"
var name2 = "asd ${name.count()}"

var fromStdIn = readLine()
var fromFile = File("input.txt").readText()

var ex1 = "matheus"

var exBuild = buildString { // hello matheus! ...10x
    repeat(10){
        append("hello")
        append(ex1)
        appendLine("!")
    }
}

"    ".isBlank() // trues
"".isEmpty() // true

var neverBlankString = " ".ifBlank { // "Never blank!"
    "Never blank!"
}

var input = "    value asd     ".trim() // "value asd"

input = "##placeholder##"
input.removePrefix("##") // "placeholder##"
input.removeSuffix("##") // "##placeholder"
input.removeSurrounding("##") // "placeholder"

input = "QuICk BroWn FOx"
input.equals("Quick Brown Fox", ignoreCase = true) // true

input = "A; B; C; D"
input.split("; ", limit = 3) // ["A", "B", "C; D"]

input = "Hello World"
input[1] // e
input.filter { it.isUpperCase() } // HW

// Package kotlin.text