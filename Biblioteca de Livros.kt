// Declarar a funcao main e a variuavel livro para armazenar o tiltulo,autor,ano, e descricao
fun main() {
    val livro1 = Livro("O Poder do Habito", "Charles Duhigg", 2012, "Esse livro mostra que a chave para o sucesso está em nossas rotinas diárias.")
    val livro2 = Livro("O Gato Preto", "Edgar Allan Poe", 1943, "Esse livro narra a história de um homem.")
    val livro3 = Livro("Codigo Limpo", "Robert Cecil Martin", 2009, "Esse livro é essencial para desenvolvedores de software.")
    val livro4 = Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 2015, "Esse livro conta a história do menino Harry Potter.")

    // Exibir lista de livros
    println("LIVROS DISPONÍVEIS NA BIBLIOTECA:")
    println("${livro1.titulo}")
    println("${livro2.titulo}")
    println("${livro3.titulo}")
    println("${livro4.titulo}")

    // Construção do Menu principal
    print("\nMENU\n")
    println("1 - Emprestar livro")
    println("2 - Devolver livro")
    println("3 - Informação sobre o livro\n") 
    print("Escolha a opcao desejada de acordo com o menu: ")
    val opcao = readLine()

    // Condicional para verificar qual livro deseja alugar, devolver ou mostrar informação
    when (opcao) {
        "1" -> {  // Opção emprestar livro
            print("Digite o nome do livro que quer emprestar: ")
            val nomeLivro = readLine()
            when (nomeLivro) {
                livro1.titulo -> livro1.alugar()
                livro2.titulo -> livro2.alugar()
                livro3.titulo -> livro3.alugar()
                livro4.titulo -> livro4.alugar()
                else -> println("Não temos esse livro no momento.")
            }
        }
        "2" -> { // Opção devolver livro
            print("Digite o nome do livro que quer devolver: ")
            val nomeLivro = readLine()
            livro1.devolverLivro(nomeLivro ?: "")
            livro2.devolverLivro(nomeLivro ?: "")
            livro3.devolverLivro(nomeLivro ?: "")
            livro4.devolverLivro(nomeLivro ?: "")
        }
        "3" -> {  // Opção informação do livro
            print("Digite o nome do livro para ver a descrição: ")
            val nomeLivro = readLine()
            when (nomeLivro) {
                livro1.titulo -> {
                    livro1.mostrarDescricao()
                    println("Escrito por: ${livro1.autor}")
                    println("Publicado em: ${livro1.ano}\n")
                }
                livro2.titulo -> {
                    livro2.mostrarDescricao()
                    println("Escrito por: ${livro2.autor}")
                    println("Publicado em: ${livro2.ano}\n")
                }
                livro3.titulo -> {
                    livro3.mostrarDescricao()
                    println("Escrito por: ${livro3.autor}")
                    println("Publicado em: ${livro3.ano}\n")
                }
                livro4.titulo -> {
                    livro4.mostrarDescricao()
                    println("Escrito por: ${livro4.autor}")
                    println("Publicado em: ${livro4.ano}\n")
                }
                else -> println("Livro não encontrado.")
            }
        }
        else -> {
            println("Opção inválida.")
        }
    }
}

// Declarar a classe 
class Livro(var titulo: String, var autor: String, var ano: Int, var descricao: String) {
    var disponivel: Boolean = true

    // Função para emprestar um livro 
    fun alugar() {
        if (disponivel) {
            disponivel = false
            println("O livro '$titulo' foi emprestado com sucesso!")
        } else {
            println("O livro '$titulo' não está disponível para ser emprestado no momento.")
        }
    }

    // Declarar uma função para devolver o livro 
    fun devolverLivro(nomeLivro: String) { 
        if (nomeLivro == titulo) {  
            if (!disponivel) { 
                disponivel = true 
                println("O livro '$titulo' foi devolvido.") 
            } else { 
                println("O livro que digitou não existe.") 
            } 
        }  
    }

    // Declarar função para mostrar as informações
    fun mostrarDescricao() {
        println("Descrição: $descricao")
    }
}

    
 


