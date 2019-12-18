
interface AnimalesInfo{

    fun printInfo(scooby: Animal1){
        scooby.printInfo()
    }
    fun printInfo(felix: Animal2){
        felix.printInfo()
    }
    fun printInfo(gaspard: Animal3){
        gaspard.printInfo()
    }

    fun printChienNoise(scooby: Animal1){
        scooby.printChienNoise()
    }
    fun printChatNoise(felix: Animal2){
        felix.printChatNoise()
    }
    fun printPerroquetNoise(gaspard: Animal3){
        gaspard.printPerroquetNoise()
    }

}

class InfoAnimales : AnimalesInfo{}

class QuiSuisJe : AnimalesInfo{


}

fun main() {

    println("======= Le cris de mon animal =======")

    val communication = InfoAnimales()
    communication.printChienNoise(Animal1())
    communication.printChatNoise(Animal2())
    communication.printPerroquetNoise(Animal3())

    println("======= Mon animal parle =======")

    val info = QuiSuisJe()
    info.printInfo(Animal1())
    info.printInfo(Animal2())
    info.printInfo(Animal3())


}
