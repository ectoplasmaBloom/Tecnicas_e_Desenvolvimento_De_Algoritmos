algoritmo imc
    real: peso, altura, imc 
    início
        escreva ("Digite o peso da pessoa (em KG): ")
        leia (peso)
        escreva ("Digite a altura da pessoa (em m): ")
        leia (altura)
        imc ← peso / (altua*altura)
        escreva ("O IMC da pessoa é: " + imc + "Kg/m² ")
        se (imc <20){
                escreva("Abaixo do peso")
        }
         senao se (imc <25){
                escreva("Peso normal")
        }
         senao se (imc <30){
                escreva("Sobre preso")
        }
         senao se (imc <40){
                escreva("Obeso")
        }
        senao{
            escreva("Obeso Mórbido")
        }
    fim