fun main(){
    print("Enter a letter:")

    val letter= readLine()?.toLowerCase()?.get(0) ?:return
    val vowels= setOf('a','e','i','o','u')
    val result= if (letter in vowels)"vowel" else "consonant"
    println("The letter '$letter' is a $result")



}