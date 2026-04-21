algoritmo Aninhado
inteiro num, quad, i;
literal resp
resp = "s"
    início
        enquanto (resp == 's' ou resp == 'S') {
            escreva("Digite um numero");
            leia(num)
            para (i=0 i<=num, i++){
                quad = i*i
                escreva("Quadrado de " + i + " igual " + quad);
                }
            escreva("Deseja continuar?");
            leia(resp);
        }
    fim