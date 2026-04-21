algoritmo Somatoria
real n1, soma
inteiro i 
    inicio  
    soma=0
    para (i=1; i<=10;i++){
        escreva("Digite um número: ");
        leia(n1);
        soma=soma+n1;
    }
    escreva("A somatória é: " + soma);
    fim