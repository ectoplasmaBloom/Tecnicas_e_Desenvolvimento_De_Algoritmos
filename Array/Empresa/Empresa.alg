algoritmo Empresa
    início
        real sal[1000], soma=0, media, maior
        inteiro i, quant = 0, n
        
        escreva("Digite a quantidade de funcionários: ")
        leia(n)
        //preenchimento do valor
        para (i=0; i<n; i++){
            escreva("Digite o salário do trabalhador "+ (i+1) + ": ")
            leia(sal[i])
        }
        //somando valores armazenados no vetor
        para(i=0; i<n; i++){
            soma += sal[i]
        }
        //calculo da media
        media = soma / n 
        escreva("A média dos salarios é R$"+ media)
        //encontrando o maior valor
        maior=sal[0]
        para (i=1; i<n; i++){
            se(sal[1] > maior){
                maior = sal[i]
            }
        }
        escreva("O maior salario é R$" +maior)
        //quantidade de salarios menores que a media
        para (i=0; i<n; i++){
            se(sal[i] < media){
                quant++
            }
        }
        escreva("Quant. de salários < R$850"+ quant)
    fim