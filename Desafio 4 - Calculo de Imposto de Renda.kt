  fun main(){ 
      var salario_anual:Float 
      var imposto: Float = 0.0f 
      
      println("Digite o salario anual: ") 
      salario_anual = readLine()!!.toFloat() 
  
  
      if (salario_anual <= 22_847.76f) { 
  
         println("Isento") 
      } 
      else if(salario_anual <= 33_919.80f ){ 
          imposto= salario_anual * 0.075f 
      } 
      else if (salario_anual <= 45_012.60f){ 
          imposto= salario_anual *  0.15f 
      } 
      else if (salario_anual <= 55_976.16f){ 
          imposto = salario_anual * 0.275f 
      } 
      if (imposto > 0) { 
      println("Imposto a pagar: " +imposto) 
      } 
  } 
