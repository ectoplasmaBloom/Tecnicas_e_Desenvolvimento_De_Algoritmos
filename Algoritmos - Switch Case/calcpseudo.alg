algoritmo calcpseudo
    inteiro opc
    inicio
        escreva("DIGITE UMA OPÇÃO")
        escreva ("1- Soma\n2Subtração\n3-Multiplicação\n4-Divisão\n5-Sair")
        leia (opc)
        escolha (opc){
            caso 1:
                escreva("Você escolheu soma!");
                pare
            caso 2:
                escreva("Você escolheu subtração!");
                pare
            caso 3:
                escreva("Você escolheu multiplacação!");
                pare
            caso 4:
                escreva("Você escolheu divisão");
                pare
            caso 5:
                escreva("Obrigado por utilizar o programa!");
                pare
            padrão:
                escreva("Opção invalida");
        }    
        fim