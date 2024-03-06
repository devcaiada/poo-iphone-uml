# Modelagem e Diagramação UML do iPhone

Com base no vídeo de lançamento do iPhone conforme link abaixo, elaborei a diagramação UML das classes e interfaces com a proposta de representar os papéis do iPhone: **Reprodutor Musicial**, **Aparelho Telefônico** e **Navegador na Internet**. Em seguida criei as classes e interfaces em Java.

[Lançamento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8&ab_channel=TuchilaRino)

- Minutos relevantes do 00:15 até 00:55

## Diagrama UML

![01](https://uploaddeimagens.com.br/images/004/752/811/original/uml-iphone.jpg?1709750765)

Conforme diagrama acima podemos perceber como os equipamentos são destacados como interface e o objeto iPhone implementa todos os eles.

Abaixo podemos ter uma noção melhor das classes através de outro diagrama.

```
@startuml
class iPhone {
  + tocar()
  + pausar()
  + selecionarMusica()
  + ligar()
  + atender()
  + iniciarCorreioVoz()
  + exibirPagina()
  + adicionarNovaAba()
  + atualizarPagina()
}

class ReprodutorMusical {
  + tocar()
  + pausar()
  + selecionarMusica()
}

class AparelhoTelefonico {
  + ligar()
  + atender()
  + iniciarCorreioVoz()
}

class NavegadorInternet {
  + exibirPagina()
  + adicionarNovaAba()
  + atualizarPagina()
}

iPhone -> ReprodutorMusical
iPhone -> AparelhoTelefonico
iPhone -> NavegadorInternet
@enduml
```

Neste diagrama, a classe **iPhone** representa o dispositivo como um todo, com métodos que correspondem aos comportamentos esperados para cada papel:

- **Reprodutor Musical**: Os métodos **tocar()**, **pausar()** e **selecionarMusica()** permitem controlar a reprodução de músicas.

- **Aparelho Telefônico**: Os métodos **ligar()**, **atender()** e **iniciarCorreioVoz()** estão relacionados à funcionalidade de telefone.

- **Navegador na Internet**: Os métodos **exibirPagina()**, **adicionarNovaAba()** e **atualizarPagina()** representam a navegação na web.

O projeto completo encontra-se na pasa "Iphone".
