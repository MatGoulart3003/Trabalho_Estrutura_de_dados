# Trabalho_Estrutura_de_dados
Primeiro trabalho de estrura de dados - dominó

Meu código consiste num dominó com algumas modificações para que se encaixe num modelo utilizável com lista duplamente encadeada, em que o jogador (Player) joga contra um Bot.

O jogo consiste em sortear as peças aleatoriamente para a mão tanto do Player quanto do Bot, a mão do Player será mostrada pelo programa ao mesmo e depois será sorteado quem será que irá jogar primeiro, o Bot ou o Player, utilizando de aleatoriedade de um "cara ou coroa" para fazer tal escolha. 
Após os eventos acima ocorrerem, é mostrado, se o Player jogar primeiro, a vez dele e as peças disponíveis para que ele efetue a jogada, se o Bot ganhou o "cara ou coroa", o Bot ja efetuará a jogada e abrirá para a vez do Player.
Assim o jogo irá se desenrolando, as peças em modelo (num1,num2) terá uma lógica aplicada para que possa ser jogada na mesa, caso um dos lados da peça a ser jogada bater com o primeiro numero da extremidade da lista à direita, ou o segundo numero da extremidade da lista à esquerda, ela poderá ser jogada unindo os numeros iguais às peças jogadas Ex: (0,6) , (6,2) , (2 ,4) e etc...

Para o desevolvimento da logica utilizei 4 listas duplamente encadeadas: Uma lista total, com todas as 28 peças disponíveis pra jogo; uma segunda lista para as peças do Player; uma terceira lista para as peças do Bot; e uma quarta lista que serão as peças jogadas à mesa.

O objetivo final do jogo é jogar todas as suas peças da mão na mesa, porém acontecerá situações que você não terá peças disponiveis que sejam compativeis com o jogo, então foi implementado uma mecânica para que o Player ou o Bot possam comprar as peças daquela primeira lista em que foram tiradas e distribuidas as primeiras 7 peças.

O jogo terminará assim que um dos jogadores jogar todas as peças na sua mão, e o programa se encerrará.
