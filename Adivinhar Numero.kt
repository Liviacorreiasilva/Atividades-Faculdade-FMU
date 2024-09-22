fun main() {
    // (..).random() - Gerar um número inteiro aleatório dentro de um intervalo específico.
    val numeroCorreto = (1..100).random()
    var usuarioNumero: Int?

    println("Adivinhe o Número entre 1 a 100!")

    //uso de do-while para que o loop continua até que o usuário adivinhe o número correto
    do {
        print("Digite um número de 1 a 100: ")
        val input = readLine()
        
        //converter a entrada do usuário, que é uma string, em um número inteiro int
        usuarioNumero = input?.toIntOrNull()
        
        if (usuarioNumero == null) {
            println("Por favor, digite um número válido.")
        //O uso de continue faz com que o loop comece uma nova iteração sem verificar a condição do while novamente.    
            continue 
        }

        if (usuarioNumero < numeroCorreto) {
            println("O número correto é maior.")
        } 
        else if (usuarioNumero > numeroCorreto) {
            println("O número correto é menor.")
        }

    } while (usuarioNumero != numeroCorreto)

    println("Parabéns! Você acertou o número $numeroCorreto!")
}
