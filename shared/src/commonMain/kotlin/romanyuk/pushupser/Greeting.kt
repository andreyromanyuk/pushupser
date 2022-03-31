package romanyuk.pushupser

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}