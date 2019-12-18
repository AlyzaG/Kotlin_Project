// constructions primaires
/*class Person(_firstname : String, _lastname : String) {
    //propriétés
    val firstName : String = _firstname
    val lastName : String = _lastname

}
// constructions secondaires
*/
class Person( val firstName : String, val lastName : String) {


    init{
        println("init 1")
    }

    constructor(): this("Peter", "Parker"){
        println("Secondary constructor")
    }
    init {
        println("init 2")
    }



}