Define a função principal main, que é o ponto de entrada programa 
fun main(){ 

    //exibe a mensagem no console
    print("Digite um numero para iniciar a contagem regressiva: ") 

    //lê a entrada do usuário e tenta convertê-la para um número inteiro. 
    val numero = readLine()?.toIntOrNull() ?:0 

   //declaramos uma variável contador e a inicializamos com o valor de numero. 
    var contador = numero 

  //Iniciamos um loop while que continuará executando enquanto contador for maior que 0. 
    while( contador > 0 ) {  
        println(contador) 

        //decrementa(diminui) o valor de contador em 1 a cada iteração do loop. O operador -- é o mesmo que contador = contador - 1
         contador --  
    } 
    println("Fim") 
} 
