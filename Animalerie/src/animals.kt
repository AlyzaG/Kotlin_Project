import java.util.*

class Animal1(val name:String = "chien", val sound:String = "aboie", val noise:String = "ouaf ouaf"){

    fun printChienInfo(){
        println("Je suis un $name qui $sound")
    }
    fun printChienNoise(){
        println("$noise")

    }
}
class Animal2(val name:String = "chat", val sound:String = "miaule", val noise:String = "miaou"){
    fun printChatInfo(){
        println("Je suis un $name qui $sound")

    }
    fun printChatNoise(){
        println("$noise")

    }
}
class Animal3(val name:String = "perroquet", val sound:String = "piaille", val noise:String = "coco" ){
    fun printPerroquetInfo(){
        println("je suis un $name qui $sound")
    }
    fun printPerroquetNoise(){
        println("$noise")

    }
}

class Animalerie(){
    fun add(){

        var scan = Scanner(System.`in`)
        println("Ajouter un animal :")

        var name: String = scan.next()
        var sound: String = scan.next()
        var noise: String = scan.next()
        println("#Nouvel animal")
        println("name: " + name)
        println("sound: " + sound)
        println("noise: " + noise)

    }
}

class ShowAll(){
    fun show(){


    }
}