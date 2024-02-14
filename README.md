 # <h1 align=center>BUSCA FIPE<h1>

O Busca Fipe é um aplicativo construído em linguagem JAVA com uso do framework Spring. Esse programa foi feito a partir do 
desafio de conclusão do curso _'JAVA: Trabalhando com lambdas, Streams e Spring Framework'_ feito na **_Alura_**.

  Nesse aplicativo foi feito a utilização de uma API para fazer as consultas de veículos e suas respectivas informações.

 ## <h2 align=center>Modo de usar</h2>

A utilização do Busca FIPE é feita através do terminal, nele será solicitado as informações necessárias para encontrar a tabela Fipe do veículo buscado.

* Primeiramente será solicitado o tipo de veículo que esta buscando.

<div align=center> <img alt = "print1" src = "https://github.com/IIIEDUARDOMA/BuscaFIPE/assets/129783126/9ed7d7a1-d711-4be1-b317-bd2cb10dcde7" /></div>

* Após escolhido o tipo de veículo o programa irá passar uma listagem com o código e nome de cada fabricante.

<div align=center> <img alt = "print2" src = "https://github.com/IIIEDUARDOMA/BuscaFIPE/assets/129783126/a55703ea-478c-4382-a65e-a863d1bec743" /></div>

* Digite o código da marca que deseja localizar (No exemplo será usado o código '21' que é referente a marca Fiat).

<div align=center> <img alt = "print3" src = "https://github.com/IIIEDUARDOMA/BuscaFIPE/assets/129783126/16612874-a774-469a-9183-7e11ae5054b6" /></div>

* Será mostrado uma lista com um código e o nome dos veículos produzidos pela marca escolhida, digite o modelo do carro que busca (No exemplo será utilizado o Cronos).

<div align=center> <img alt = "print" src = "https://github.com/IIIEDUARDOMA/BuscaFIPE/assets/129783126/38e1f085-9980-442c-bfcf-c6935a3b2513" /></div>

* Por fim digite o código do veículo (No exemplo foi utilizado o código '9988' referente ao CRONOS 1.0 6V Flex).

<div align=center> <img alt = "print" src = "https://github.com/IIIEDUARDOMA/BuscaFIPE/assets/129783126/95f333dd-fe7f-4f20-8821-540979123f03" /></div>


* Será retornado os dados da tabela fipe de todos os anos em que esse veículo foi fabricado.


## <h2 align=center>Ferramentas utilizadas para desenvolvimento </h2>

1. Spring Framework
2. Jackson
3. Stream
4. Lambdas
5. FIPE API HTTP REST ("https://deividfortuna.github.io/fipe/")




