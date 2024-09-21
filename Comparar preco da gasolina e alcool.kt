   fun main(){  
        var valorGasolina: Double 
        var valorAlcool: Double 

//println exime uma mensagem para o usuario e o readline le a linha de entrada do usuario
//toDooubleOrNull convertera a string de entrada para um numero do tipo double - numero decimal - e caso a conversao falhar -se ao digitar um texto nao numerico - retornara a null 
//?:0 - é o operador Elvis, que define 0 como valor padrão caso o número seja inválido ou nulo.              
             
              println("Digite o valor da gasolina:") 
              valorGasolina = readLine()?.toDoubleOrNull() ?:0.0  

              println("Digite o valor do alcool:")  
              valorAlcool =readLine()?.toDoubleOrNull() ?:0.0  

//Essa linha está chamando a função comparação, passando dois argumentos para ela: valorGasolina e valorAlcool 
              comparacao(valorGasolina, valorAlcool)  
    } 

//Criacao da funcao para comparacao do valor da gasolina e alcool; apos calcular os precos ajustado multiplicado por 0.75 que e igual a 75%, verificamos qual vale mais a pena usando as conficionais if, else if e else//
      fun comparacao(gasolina:Double, alcool:Double){  
              val precoGasolina = gasolina * 0.75  
              val precoAlcool = alcool * 0.75  
              // 
              if (precoGasolina < precoAlcool){ 
               println("Compensa mais o uso de  gasolina")  

               } else if (precoGasolina > precoAlcool) { 
               println("Compensa mais o uso de alcool")  

              }else { 
              println("os valores são iguais")  
              } 
         }  

         

 
