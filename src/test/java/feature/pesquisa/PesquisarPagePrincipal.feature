#language: pt

Funcionalidade:  Executar pesquisa
  Como: usuaria
  Quero: Executar uma pesquisa a partir da home
  Para: Conferir os resultados encontrados

  Contexto: Acessar tela de home
    Dado que estou na tela de Home
    E clico na lupa pesquisar

  Cenario: Validar pesquisa com dado valido deve direcionar para tela de resultado lista de resultados encontrados
    E informo um dado valido para pesquisa
#    Quando clico no botao pesquisar
#    Entao dereciona para a tela de resultado
#    E lista os resultados encontrados
