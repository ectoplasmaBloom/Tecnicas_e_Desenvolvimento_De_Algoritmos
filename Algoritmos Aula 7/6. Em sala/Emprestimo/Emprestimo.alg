algoritmo Emprestimo;
real salario, pendencias;    
    inicio
    escreva("Escreva seu sálario: ");
    leia (salario);
    escreva("Quantas foram as pendencias?");
    leia (pendencias);  
            se(pendencias>=2){
            escreva("Emprestimo não aprovado!");   
        }
            se(pendencias=1){
                se (salario>=2500){
                escreva("Empréstimo aprovado!");
                }
                se (salario<2500){
                escreva("Emprestimo nao aprovado!")
                }
        }
    
    fim
 
