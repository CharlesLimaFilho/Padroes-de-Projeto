# Padroes-de-Projeto

## Observer

- Padrão comportamental
- Permite que um objeto notifique outros objetos.

### Como funciona

Existem objetos que possuem interesse em algum estado de um objeto específico, conhecido como Subject, então eles irão se inscrever nesse objeto e serão conhecidos como Subscribers (ou Observer). O objeto que irá notificar caso haja alguma mudança no estado será conhecido como Publisher, nesse caso ele também será o Subject.

### Cenário

Um cliente está interessado num produto de uma loja, porém o produto está muito caro no momento. Para evitar ter que ir até a loja várias vezes, ele deseja ser notificado quando houver uma redução no preço.

### Por que utilizar

Um dos problemas que ocorreriam caso não fosse utilizado o Observer é que a loja teria que notificar todos os clientes, pois não saberia quem é cliente que está interessado, causando notificações desnecessárias(spam). Portanto, o uso do Observer garante que apenas os clientes que buscam aquele produto serão notificados.

### Prós e Contras

-
-
-


## Composite

- Padrão estrutural.
- Organiza os objetos como uma árvore.

### Como funciona

Esse padrão determina que os objetos podem ser vistos como uma árvore e trabalhar com essas estruturas como se fossem objetos individuais.

### Cenário

Uma empresa de entregas possui um armazém, e nele existem caixas e produtos. As caixas podem conter produtos ou outras caixas menores que também podem conter produtos ou outras caixas.

Agora há um pedido, pedidos podem ser para produtos simples ou para caixas cheias de produtos e outras caixas. Logo, há a necessidade de calcular o valor total de caixa.

### Por que utilizar




## Prototype

- Padrão criacional.
- Clona objetos já existentes ao invés de criar novos.

### Como funciona

Deseja-se criar um novo objeto que possui características similares a um outro objeto já existente, então para evitar o ter que declarar um novo objeto com todos os parâmetros iguais ao anterior, declara-se que o objeto antigo é um protótipo. Dessa forma, eles já irão possuir os mesmos atributos e só será necessário alterar algumas características.

### Cenário

Há um avião branco e queremos criar um novo avião do mesmo modelo com a cor azul, para não ter que 