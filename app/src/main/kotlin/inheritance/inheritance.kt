package inheritance

/**
 * Inheritance
 * Unlike Dart, classes in Kotlin are closed (`final`) by default, and we explicitly specify
 * whether to allow the classes and/or methods to be subclassed by adding the `open` modifier before
 * the `class` and/or `fun` keyword in class declaration and/or function declaration.
 */

open class Animal {
    /**
     * Open Member Function
     * By default, member functions are closed (`final`) and by adding `open` keyword before `fun`
     * in function declaration, we make the function open for overridden by subclasses.
     */
    open fun makeSound() {
        println("Making some sound...")
    }

    /**
     * Final Member Function
     * It can't be overridden by subclasses.
     */
    fun eat() {
        println("Eating food...")
    }
}


/**
 * In Kotlin, we inherit a class using colon (`:`) character.
 */
class Dog : Animal() {
    // Only `open` functions can be overridden
    override fun makeSound() {
        println("Woof Woof...")
    }
}


fun main() {
    val animal = Animal()
    animal.makeSound()
    animal.eat()

    val dog = Dog()
    dog.makeSound() // Invoking overridden method
    dog.eat()
}