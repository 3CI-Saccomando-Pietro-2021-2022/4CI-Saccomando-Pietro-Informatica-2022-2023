# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [1.0] 2023-01-24
## Added
Creo la classe model *ContatoreGas*,l'applicazione *BollettaCalculator*, e il main *BollettaTest*.

Classe **ContatoreGas**
| Method | Visibility | Purpose|
|-|-|-|
**setConsumoPrecedente** | **public** | **Dà un valore alla variabile di istanza rilevazionePrec.**
**getConsumoPrecedente** | **public** | **Resistuisce il valore della variabile di istanza rilevazionePrec.**
**setConsumoAttuale** | **public** | **Dà un valore alla variabile di istanza rilevazioneAtt.**
**getConsumoAttuale** | **public** | **Resistuisce il valore della variabile di istanza rilevazioneAtt.**
**rilevazionePrecedente** | **public** | **Calcola il costo del consumo precedente**
**rilevazioneAttuale** | **public** | **Calcola il costo del consumo attuale**
**toString** | **public** | **Resistuisce una stringa con i valori delle variabili rilevazionePrec e rilevazioneAtt, e il costo del consumo precedente e attuale.**


Classe **BollettaCalculator**
|Method	|Visibility|Purpose|
|-|-|-|
**start** | **public** | **Richiama i metodi che servono per far funzionare l'applicazione avviandola.**
**descrizioneApp** | **public** | **Dà una breve descrizione del programma.**
**visualizzaRisultati** | **public** | **Visualizza a schermo i risultati.**
**prendiInput** | **public** | **Prende in input i valori delle variabili rilevazionePrec e rilevazioneAtt.**
