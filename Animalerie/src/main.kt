import java.util.*

fun main() {
    println("Bienvenue dans l'animalerie")




    var scan = Scanner(System.`in`)
    println("Ajouter un animal :")

    var name: String = scan.next()
    var sound: String = scan.next()
    var noise: String = scan.next()
    println("#Nouvel animal")
    println("name:" + name)
    println("sound:" + sound)
    println("noise:" +noise)
}












/*fun main(args: Array<String>) {

    println("Bienvenue dans l'animalerie")
    println()
    /* run {
         if(animal1 != animal2) animal1 else animal2
     }.printAnimal()*/
}

interface Animales {

    fun parler() {
        val animal1 = Animal("chien", "aboie","ouaf ouaf")
        println((animal1.noise) +"!")
        val animal2 = Animal("chat", "miaule", "miaou")
        println((animal2.noise) +"!")
        val animal3 = Animal("perroquet","piaille", "coco")
        println((animal3.noise) +"!")

    }

    fun quiSuisJe() {
        val animal1 = Animal("chien", "aboie","ouaf ouaf")
        println("Je suis un " + (animal1.name) +" qui " + (animal1.sound))
        val animal2 = Animal("chat", "miaule", "miaou")
        println("Je suis un " + (animal2.name) +" qui " + (animal2.sound))
        val animal3 = Animal("perroquet","piaille", "coco")
        println("Je suis un " + (animal3.name) +" qui " + (animal3.sound))

    }
}


class Animalerie(){
    fun addAnimal(){
        var name: String = readLine()!!.toString()
        var sound: String = readLine()!!.toString()
        var noise: String = readLine()!!.toString()
        println("#Nouvel animal")
        println("Name: $name")
        println("Name: $sound")
        println("Name: $noise")
    }
}
*/