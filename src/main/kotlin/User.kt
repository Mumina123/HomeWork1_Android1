
class User : Verifiable{

    val username: String
    val email: String
    val age: String
    val password: String

    constructor(username: String, email: String, age: String, password: String) {
        this.username = username
        this.email = email
        this.age = age
        this.password = password
    }

    override fun verify(user:User) {
         println("this user ${this.hashCode()}")
         println("logInUser ${this.hashCode()}")
        if (this == user){
            println("Вход прошел успешно!")
        }else{
            throw IllegalArgumentException("Неверные данные для входа")
        }
    }
}

