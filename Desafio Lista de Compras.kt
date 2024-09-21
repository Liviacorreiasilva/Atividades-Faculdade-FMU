  fun main() { 
//declaracao da variavel lista de compra e os itens da lista do tipo string seram armazenadas no mutableListOf
//usamos o mutableListOf<String>() quando precisamos de uma lista que possa ser alterada ao longo do tempo.
//com multableList você pode adicionar, remover e modificar os elementos dessa lista

      val listaCompras = mutableListOf<String>() 
      var opcoes = true  


//declaracao do loop while que vai  continuar  executar o bloco de código enquanto opcoes for true.
//Quando opcoes se tornar false, o loop terminará
      while (opcoes) { 
  
          println("Escolha uma opção:") 
          println("1 - Adicionar um item na minha lista") 
          println("2- Mostrar a minha lista") 
          println("3 - Excluir a minha lista") 
          println("4 - Sair") 
  
 //declarar a estrutura when para receber as entradas do usuario
//o readLine() vai ler a entrada do usuário como uma string
//Se o usuário digitar 1, a função adicionarProdutosLista(listaCompras) é chamada para adicionar um item à lista de compras
//Se o usuário digitar qualquer número que não esteja entre 1 e 4, o programa exibe a mensagem que a entrada é inválida

          when (readLine()?.toIntOrNull()) { 
              1 -> adicionarProdutosLista(listaCompras) 
              2 -> mostrarProdutosLista(listaCompras) 
              3 -> removerProdutosLista(listaCompras) 
              4 -> { 
                  println("Saindo da lista, obrigada pela interação!!") 
                  opcoes = false 
              } 
              else -> println("O número que você digitou esta  inválido.") 
          } 
      } 
  } 
  
//declaracao da função adicionarProdutosLista, que recebe um argumento/parametro lista do tipo MutableList<String>
//a val adicionarItem = readLine vai ler  a entrada do usuário e armazenar o valor na variável adicionarItem
//a condicional if adicionarItem.isNullOrBlank vai verifica se a entrada do usuário é nula ou se é uma string em branco (sem caracteres). 
//Se a entrada for nula exibira uma mensagem ao usuario
//se a entrada tiver um valor ser adicionado um item na lista em lista.add(adicionarItem)

  fun adicionarProdutosLista(lista: MutableList<String>) { 
      println("Digite o nome do item que deseja adicionar na sua lista:")
      
      val adicionarItem = readLine() 
      if (adicionarItem.isNullOrBlank()) { 
          println("Não tem nenhum item adicionado.") 
      } else { 
          lista.add(adicionarItem) 
          println("O item '$adicionarItem' foi adicionado à lista com sucesso.") 
      } 
  } 
  
  fun removerProdutosLista(lista: MutableList<String>) { 
      println("Digite o nome do item que deseja remover da sua lista:") 
  
      val removerItem = readLine() 
      if (removerItem.isNullOrBlank()) { 
          println("Não tem nenhum item removido.") 
      } else if (lista.remove(removerItem)) { 
          println("O item '$removerItem' foi removido da lista com sucesso.") 
      } else { 
          println("O item '$removerItem' não foi encontrado na lista.") 
      } 
  } 
  
//declaracao da função mostrarProdutosLista para exibir os itens contidos na lista de compras
//a função mostrarProdutosLista recebe um argumento lista do tipo List<String>
//a função não pode modificar a lista, apenas ler os itens dela.
//a lista.isEmpty verifica se a lista está vazia e se for verdadeiro, o bloco dentro do if vai ser executado exibindo uma mensagem ao usuario
//Se a lista não estiver vazia, o bloco que esta dentro do else vai ser executado
//uso da lista.forEachIndexed{index, item -> println } para percorer sobre cada indice(index) e  item da lista
//uso da println("${index + 1}. $item")para imprimir o índice de cada item e o nome do item (começando de 1) de forma numerada.

fun mostrarProdutosLista(lista: List<String>) { 
      if (lista.isEmpty()) { 
          println("A sua lista não tem nenhum item para ser mostrado.") 
      } else { 
          println("Esta é a sua lista de compras:") 
          lista.forEachIndexed { index, item -> 
              println("${index + 1}. $item") 
          } 
      } 
  } 

 
