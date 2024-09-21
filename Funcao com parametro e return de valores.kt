fun main(){
  //declaracao  da variável chamada resultado do tipo Int.
    var resultado: Int
  //chamando a funcao soma com os argumentos 2 e 3, e o resultado da soma é armazenado na variável resultado.
    resultado = soma (2,3)
    println("O resultado da soma é $resultado")
}
//criacao da funcao soma que possui dois parametros a e b do tipo int
//a função é declarada para retornar um Int (:Int{ ), que é o resultado da soma.
fun soma(a:Int , b:Int): Int{
  //o return a + b calcula a soma dos dois números e a retorna
   return a+b 
   }
