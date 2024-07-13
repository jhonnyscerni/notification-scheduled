# NotificationScheduled

## Descrição
NotificationScheduled é uma aplicação Spring Boot desenvolvida a partir de um desafio da magalu para agendar e gerenciar notificações. Permite aos usuários agendar notificações para serem enviadas através de diversos canais, como e-mail, SMS, push e WhatsApp.

## Tecnologias Utilizadas
- Java
- Spring Boot
- Gradle
- JPA/Hibernate

## Instalação

### Pré-requisitos
- JDK 11 ou superior
- Gradle

![img.png](src%2Fmain%2Fresources%2Fimg%2Fimg.png)

Na normalização de base de dados, a escolha entre usar enum ou criar classes para representar entidades como Channel e Status depende de vários fatores, incluindo a complexidade dos dados, a frequência de alterações e a necessidade de armazenar informações adicionais além de um identificador e descrição.  
Uso de Enum: É mais adequado quando os valores de Channel e Status são fixos e pouco prováveis de mudar. Enum é útil para garantir a consistência dos dados e é eficiente em termos de armazenamento, pois o banco de dados só precisa armazenar uma referência ao valor do enum. No entanto, enum limita a flexibilidade, pois qualquer alteração nos valores requer uma atualização do código e do banco de dados.  
Criação de Classes: É preferível quando os valores de Channel e Status podem mudar ou quando é necessário armazenar informações adicionais sobre cada Channel ou Status. Usar classes permite adicionar, remover ou modificar registros dinamicamente através de operações de banco de dados sem necessidade de alterar o código da aplicação. Isso também facilita a expansão dos dados associados a cada entidade no futuro.  
Conclusão para Normalização
Para fins de normalização e flexibilidade em um ambiente de banco de dados que pode evoluir:  
Classes são recomendadas se você antecipa a necessidade de modificar os valores de Channel ou Status, ou se essas entidades precisam armazenar múltiplas propriedades.
Enums são recomendados para conjuntos de valores estáticos que raramente mudam, oferecendo uma maneira eficiente e tipo-segura de representar esses valores no código e no banco de dados.
Dado o contexto do seu projeto, onde Channel e Status são representados como classes com a capacidade de armazenar múltiplos campos de informação e parecem ter um conjunto de valores predefinidos (Values enum dentro das classes), você já está adotando uma abordagem híbrida que permite flexibilidade e a eficiência de enum para valores conhecidos. Esta pode ser uma boa estratégia se você precisar da flexibilidade de adicionar mais informações às entidades no futuro, mantendo um conjunto de valores padrão facilmente acessível através do enum.

```plaintext
curl -X POST http://localhost:8080/notifications -H "Content-Type: application/json" -d '{"dateTime": "2023-10-05T14:30:00", "destination": "example@example.com", "message": "Your scheduled notification message", "channel":"EMAIL"}'

curl -X GET http://localhost:8080/notifications/{notificationId}

curl -X DELETE http://localhost:8080/notifications/{notificationId}
```

```plaintext

```
### Créditos
BUILD & RUN