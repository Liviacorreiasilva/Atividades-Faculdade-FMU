fun main(){
  //chamando a funcao saudacao com o argumento "Livia",significa que o programa vai passar o nome "Livia" para a função saudacao
    saudacao("Livia")
}
//A função saudacao aceita um parâmetro chamado nome do tipo String.
//Dentro da função, a mensagem "Ola $nome seja bem vinda ao kotlin" é impressa no console. 
//$nome será substituído pelo valor passado ("Livia").

fun saudacao(nome: String){
    println("Ola $nome seja bem vinda ao kotlin")
}
