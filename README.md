# Lab1 - Introduksjon til Java
I denne labben vil vi implementere et program med bruk av INF100-konsepter, men i Java-syntaks.

## Læringsmål
 * Grunnleggende programmeringsevner i Java
 * INF100-konsepter, blant annet:
    * Deklarere og bruke variabler
    * Betingelser (if-else)
    * Loop'er (for/while)
    * Opprette egne metoder (funksjoner)
    * Ta input fra brukeren
    * Importere og bruke ekstern kode

## Stein Saks Papir
Det vellkjente spillet *Stein Saks Papir* var et eksamensspørsmål i [INF100 vår 2020](https://mitt.uib.no/courses/29690/files/3490285/download?wrap=1) (oppgave 14). I denne labben vil vi implmenetere det samme programmet, men istedenfor det velkjente Python-språket vil vi bruke Java.

Målet med denne labben er å lære dere Java-syntaks. Hvis du ikke husker alle programmeringskonseptene fra INF100 og trenger en oppfriskning så har vi implementert [Stein Saks Papir i Python](https://git.app.uib.no/ii/inf101/22v/students/lab1/-/blob/master/RockPaperScissors.py).

### Oppgave
Skriv et Java-program hvor et menneske spiller mot datamaskinen. Mennesket skal bli bedt om deres valg av stein, saks eller papir i konsollen, mens datamaskinen skal velge tilfeldig mellom de tre valgene. Mennesket skal bees om de ønsker å spille videre etter hver runde. Score'en til begge spillerne skal lagres og presenteres utgjennom alle rundene. All input fra mennesket skal valideres og ikke tillate at programmet kræsjer på feil input (se runde 3).

**Viktig**: Den eksiterende koden må fobli slik den er ved kloning. Implementer programmet i ``run``. Du kan opprette hjelpemetoder (anbefalt) til dine behov. Bruk metoden ``readInput`` for innlesning av input fra brukeren.

Programmet skal printe ut det følgende i konsollen (inkludert input fra brukeren):
```
Let's play round 1
Your choice (Rock/Paper/Scissors)?
rock
Human chose rock, computer chose paper. Computer wins!
Score: human 0, computer 1
Do you wish to continue playing? (y/n)?
y
Let's play round 2
Your choice (Rock/Paper/Scissors)?
paper
Human chose paper, computer chose paper. It's a tie!
Score: human 0, computer 1
Do you wish to continue playing? (y/n)?
y
Let's play round 3
Your choice (Rock/Paper/Scissors)?
cardboard
I do not understand cardboard. Could you try again?
Your choice (Rock/Paper/Scissors)?
scissors
Human chose scissors, computer chose paper. Human wins!
Score: human 1, computer 1
Do you wish to continue playing? (y/n)?
n
Bye bye :)
```

✅ Labben er bestått når alle testene passerer (og er levert på Codegrade).

Testene sjekker hvorvidt output'en i konsollen er **akkurat** slik som i eksempel-output ovenfor.
