fun main(){
    for (number in 10..20){
        println(number)
    }

    for (letter in 'a'..'f'){
        println("letter is $letter")
    }

    for (num in 10..15){
        if (num==12){
            continue
        }
        println(num)
    }
}