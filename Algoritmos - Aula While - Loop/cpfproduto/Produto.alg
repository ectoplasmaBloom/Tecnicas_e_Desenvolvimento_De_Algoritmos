algoritmo Produto
    literal cpf
    real preco, total
    inicio 
        total = 0
        preco = 1
        escreva ("Digite o seu cpf: ");
        leia (cpf);
        enquanto(preco != 0){
            escreva ("Digite o preço do produto: ");
            leia(preco);
            total += preco;
        }
        escreva("Cliente: "+ cpf);
        escreva("Total a pagar: R$ " + total);
    fim