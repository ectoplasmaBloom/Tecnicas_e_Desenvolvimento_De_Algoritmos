algoritmo emprestimo;
real salario, pendencias, emprestimo, parcela;    
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
                escreva("Digite o valor do emprestimo:")
                leia(emprestimo);
                escreva("Digite o número de parcelas:");
                leia(parcelas);
                juros = emprestimo*0.9*parcelas/100;
                valor_total = emprestimo + juros;
                parcela = valor_total/parcelas;
                escreva("Valor de cada parcela: R$"+ parcela +"\nValor total do financiamento: R$" + valor_total);

                }
                se (salario<2500){
                escreva("Emprestimo nao aprovado!")
                }
        }
    
    fim
 
