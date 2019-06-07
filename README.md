# API REST para os resultados da última corrida de fórmula 1 do ano

* Para testar a api é necessário criar uma base de dados do MongoDB no localhost:27017 chamada <b>desafio-icarros</b>.

* Para acessar a documentação do swagger acesse: http://localhost:8080/swagger-ui.html

* A API conta com 2 endpoints onde 1 retorna a lista completa de competidores da ultima corrida da fórmula 1 do ano e a outra retorna os 3 primeiros (O Pódio).

  Os endpoints são:</br>
    http://localhost:8080/resultGrandPrix/{ano} - para a lista completa, onde {ano} é o ano que se quer procurar</br>
    http://localhost:8080/resultGrandPrixPodium/{ano} - para o pódio da corrida, onde {ano} é o ano que se quer procurar
