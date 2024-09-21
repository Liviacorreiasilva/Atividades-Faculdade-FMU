  fun main(){ 
  //declaracao das variveis que armazena um valor do tipo int - numeros inteiros
  var numero : Int ? 

  //declaracao das variaveis centena, dezena, unidade e numero_dez  que armazenarão partes do número.  
  val centena: Int ? 
  val dezena: Int ? 
  var unidade: Int ? 
  var numero_dez: Int ? 
  

//O programa pede ao usuário para digitar um número.
//readLine() lê a entrada do usuário.
//toIntOrNull() tenta converter a entrada para um inteiro; se não conseguir (por exemplo, se o usuário digitar texto), retorna null.
//O operador Elvis (?:) garante que, se o resultado for null, numero será definido como 0.
    
  println("Digite três numeros: ") 
  numero = readLine()?.toIntOrNull()?:0 

//Separação das Partes do Número
//numero_dez recebe o valor da parte inteira do número dividida por 10 (remove a unidade).
//centena recebe o valor da parte inteira do número dividida por 100 (obtém a centena).
//unidade recebe resto da divisão do número por 10 (a unidade).
//dezena usa o rem(10) para receber a dezena, que é o resto da divisão do valor sem a unidade.
    
  numero_dez = numero / 10 
  centena =numero/ 100 
  unidade = numero % 10 
  dezena = numero_dez.rem(10) 

//declaracao da variavel soma para soma das partes do número centena, dezena e unidade e exibir o resultado dessa soma ao usuario
  val soma = centena + dezena + unidade 
   println("A soma dos numeros que você digitou é: " +soma) 
  } 
  
   
