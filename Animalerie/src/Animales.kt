
interface AnimalesInfo{

    fun printChienInfo(scooby: Animal1){
        scooby.printChienInfo()
    }
    fun printChatInfo(felix: Animal2){
        felix.printChatInfo()
    }
    fun printPerroquetInfo(gaspard: Animal3){
        gaspard.printPerroquetInfo()
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
    info.printChienInfo(Animal1())
    info.printChatInfo(Animal2())
    info.printPerroquetInfo(Animal3())


}