# Padroes-de-Projeto

## Observer

- Padrão comportamental
- Utiliza um mecanismo de "Publish and Subscribe".

### Como funciona

Existem objetos que possuem interesse em algum estado de um objeto específico, conhecido como Subject, então eles irão se inscrever nesse objeto e serão conhecidos como Subscribers (ou Observer). O objeto que irá notificar caso haja alguma mudança no estado será conhecido como Publisher, nesse caso ele também será o Subject.

### Cenário

Um cliente está interessado num produto de uma loja, porém a loja ainda não possui o produto, então esse cliente irá informar a loja que ele deseja tal produto. Assim que o produto estiver disponível, a loja irá notificá-lo.

### Por que utilizar

Um dos problemas que ocorreriam caso não fosse utilizado o Observer é que a loja teria que notificar todos os clientes, pois não saberia quem é cliente que está interessado, causando notificações desnecessárias(spam). Portanto, o uso do Observer garante que apenas os clientes que buscam aquele produto serão notificados.
