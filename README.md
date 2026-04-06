# Padroes-de-Projeto

## Observer

- Padrão comportamental
- Utiliza um mecanismo de "Publish and Subscribe".

### Como funciona

Existem objetos que possuem interesse em algum estado de um objeto específico, conhecido como Subject, então eles irão se inscrever nesse objeto e serão conhecidos como Subscribers. O objeto que irá notificar caso haja alguma mudança no estado será conhecido como Publisher, nesse caso ele também será o Subject.