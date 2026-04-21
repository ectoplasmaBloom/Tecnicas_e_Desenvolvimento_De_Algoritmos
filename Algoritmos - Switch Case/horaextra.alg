algoritmo horaextra
    inteiro opc, horas
    literal extra1, extra2

    inicio
        escreva("1- Segunda\n2- Terça\n3- Quarta\n4- Quinta\n5- Sexta\n6- Sabado\n7- Domingo\n")
        leia (opc)
            escolha(opc){
                caso 1: caso 2: caso 3: caso 4: caso 5: 
                    escreva("Escreva a hora trabalhada");
                leia(horas)
                extra = (horas * 15)
                escreva("Voce sera pago R$"+extra2+);
                    pare
                caso 6: caso 7:
                    escreva("Escreva a hora trabalhada");
                leia(hora)
                extra = (horas * 15) * 1.5
                escreva("Voce sera pago R$"+extra2+);
                    pare 
                padrão:
                    escreva("Não é um dia valido");
        }
