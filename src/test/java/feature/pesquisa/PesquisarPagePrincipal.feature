#language: pt

Funcionalidade:  Executar pesquisa a partir da tela de home
  Como: Usuario
  Quero: Executar uma pesquisa a partir da home
  Para: Conferir os resultados encontrados

  Contexto: Acessar tela de home
    Dado que estou na tela de Home
    E clico na lupa pesquisar

  Cenario: Validar pesquisa com dado valido deve direcionar para tela de resultado lista de resultados encontrados
    E informo um dado valido para pesquisa "Agibank"
    Quando clico no botao pesquisar
    Entao dereciona para a tela de resultado "https://blogdoagi.com.br/?s=Agibank"
    E apresenta o texto "Resultados da busca por: Agibank"

  Cenario: Validar pesquisa com dado inválido deve direcionar para tela de resultado com informação de nenhum resultado
    E informo um dado valido para pesquisa "XXXXXXXX"
    Quando clico no botao pesquisar
    Entao dereciona para a tela de resultado "https://blogdoagi.com.br/?s=XXXXXXXX"
    E apresenta o texto informando que "Nenhum resultado"
    E apresenta orientacao para tentar novamente "Não encontramos nada para estes termos de busca. Tente novamente com palavras-chave diferentes."
