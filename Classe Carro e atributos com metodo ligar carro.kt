  
  fun main(){ 
//criacao de dois objetos (carro1 e carro2) a partir da classe Carro. 
  var carro1 = Carro() 
  var carro2 = Carro() 

//declarar os atributos dos dois objetos (carro1 e carro2)
  carro1.marca="Jeep" 
  carro1.modelo = "Renegade" 
  carro1.ano= 2014 
  carro1.cor = "Branco" 
  
  
  carro2.marca = "Lamborguini" 
  carro2.modelo = "Revuelto" 
  carro2.ano = 2023 
  carro2.cor = "Preto" 

//criar o método ligar do objeto carro1 para que ele seja chamado.
    carro1.ligar() 
  } 

//criar a  classe Carro e definir as propriedades e o comportamento do carro. 
// e incluir um método ligar que gerencia o estado do carro (ligado ou desligado).
  class Carro{ 
      var marca : String?=null 
      var cor: String?=null 
      var modelo: String? = null 
      var ano: Int? = null 
      var ligado: Boolean = false  

//declara o método ligar para verificar se o carro já está ligado 
//e, dependendo dessa condicao, exibe uma mensagem  e altera o estado de ligado para true
      fun ligar(){ 
      if(!ligado){ 
      println("carro ligado") 
      ligado = true 
      } 
      else{ 
      println("o carro já ta ligado") 
      } 
     } 
  } 
  
   
  
   
  
   
