  fun main(){ 
//criacao dos dois objetos carro1 e carro2 a partir da classe Carro
  var carro1 = Carro() 
  var carro2 = Carro() 

//atributos do objeto carro1 e carro2
  carro1.marca="Jeep" 
  carro1.modelo = "Renegade" 
  carro1.ano= 2014 
  carro1.cor = "Branco" 
  
      
  carro2.marca = "Lamborguini" 
  carro2.modelo = "Revuelto" 
  carro2.ano = 2023 
  carro2.cor = "Preto" 
  
  //método ligar de carro1 é chamado, para que o carro seja ligado e exiba a mensagem
    carro1.ligar() 

//O método acelerar é chamado duas vezes para o carro2, o que aumenta sua velocidade em 5 a cada chamada. 
//println para imiprir velocidade do carro ao usuario

    carro2.acelerar() 
    carro2.acelerar() 
    println(carro2.velocidade) 
  } 

//criacao da classe Carro com  suas propriedades (marca,cor,modelo,ligado e velocidade) e metodo (ligar,true e acelerar)
  class Carro{ 
  
      var marca : String?=null 
      var cor: String?=null 
      var modelo: String? = null 
      var ano: Int? = null 
      var ligado: Boolean = false  
//a velocidade inicial do carro foi definida como 350, após duas acelerações, a velocidade final será 360 que vai ser exibida para o usuario.
      var velocidade: Int = 350 

//Criacao do metodo ligar
//ligar: Verifica se o carro já está ligado. Se não, exibe "carro ligado" e define o estado como true usadando as condicionais if e else 
//Se já estiver ligado, exibe "o carro já ta ligado".

      fun ligar(){ 
      if(!ligado){ 
      println("carro ligado") 
      ligado = true 
      } 
      else{ 
      println("o carro já ta ligado") 
      } 
     } 

//Criacao do metodo acelerar
//acelerar: Aumenta a velocidade do carro em 5 unidades a cada chamada.
     fun acelerar(){ 
     velocidade = velocidade + 5 
     } 
  } 
