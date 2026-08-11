package inheritance

/**
 * Open Class
 * For a developer like me, who is coming from Dart background. It's the Kotlin's way of saying
 * "This class is allowed to be extended or subclassed".
 *
 * By default, all classes and methods in Kotlin are "final". We explicitly make classes and methods `open`
 * for being subclassed or extended.
 * In Dart, It's opposite, we explicitly restrict this access by defining a class as `final
 *
 */

open class Widget {
    /**
     * Open Function
     * By adding `open` keyword before `fun` in function declaration,
     * we make the function open for overridden by subclasses.
     */
    open fun render() {
        println("Rendering basic widget blueprint...")
    }

    /**
     * final function (it can't be overridden by subclasses)
     */
    fun getDimensions() {
        println("Calculating width and height...")
    }
}

fun main() {
    Widget().render()
    Widget().getDimensions()
}