    fun main() { 
      var  Idade : Int  

    //Declara uma variável chamada Idade do tipo Int que será usada para armazenar a idade digitada pelo usuário.
      println("Digite sua idade: ") 
      Idade = readLine()!!.toInt() 

    //declaracao das condicionais para verificacao das idades e classificacao da faixa etaria
      if(Idade >= 0 && Idade <= 12){ 
        println("Categoria: criança") 
      } 
    else  if (Idade >= 13 && Idade <= 17){ 
        println("Categoria: adolescente") 
      } 
    else if(Idade >= 18 && Idade <= 64){ 
        println("Categoria: adulto") 
      } 
      else if(Idade >=65){ 
        println("Categoria: idoso") 
      } 
    } 
