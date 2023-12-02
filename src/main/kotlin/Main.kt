import java.util.Scanner
fun main(args: Array<String>) {
    val user = User("Mumina","mumina@gmail.com","18","user")
    val  scanner = Scanner(System.`in`)

    println("|----------<log in>------|")
    print("Input username: ")
    val username = scanner.next()
    print("Input email: ")
    val email = scanner.next()
    print("Input age: ")
    val age = scanner.next()
    print("Input password: ")
    val password = scanner.next()

    val logInUser = User(username,email,age,password)
    user.verify(logInUser)
}
