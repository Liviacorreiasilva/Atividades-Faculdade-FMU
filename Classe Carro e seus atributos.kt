//Inicializacao do programa com a funcao main
fun main(){ 
  //criacao do objeto chamado carro1 a partir da classe Carro
var carro1 = Carro() 

//declaracao dos atributos do objeto carro1
carro1.marca="Jeep" 
carro1.modelo = "Renegade"   
carro1.ano= 2014 
carro1.cor = "Branco" 

  //imprime o valor do atributo modelo do objeto carro1 - que e Renegade
    println(carro1.modelo) 
} 

// Criacao da classe Carro que define a estrutura de um carro com suas quatro propriedades - marca,cor,modelo e ano
// e declarada como variavel string ou int para que elas possam armazenar um valor ou ser null
class Carro{ 
    var marca : String?=null 
    var cor: String?=null 
    var modelo: String? = null 
    var ano: Int? = null 
} 
