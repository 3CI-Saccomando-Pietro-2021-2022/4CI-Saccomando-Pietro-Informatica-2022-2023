# Film


## Descrizione
Si crea un'applicazione che prendendo in input dei film dal file *film.txt* restituisce il film con durata maggiore, la lista di film riordinata dal film meno lungo al più lungo, e scelto un autore stampare i film che ha fatto. 

**Classe Film**
| METODI | VISIBILITA'| SCOPO |
|-------|--------|---------|
|setTitolo | public | Imposta il titolo del film.
|getTitolo | public | Restituisce il titolo del film.
|setRegista | public | Imposta il regista del film.
|getRegista | public | Restituisce il regista del film.
|setDurata | public | Imposta la durata del film.
|getDurata | public	| Restituisce la durata del film.
|toString | public | Restituisce una stringa che contiene i valori delle variabili di istanza. 


**Classe FilmCalculator**
| METODI | VISIBILITA'| SCOPO |
|-------|--------|---------|
|start | public	 | Richiama i metodi descriviAttività, getInput, scriviFile.
|descrviAttività | public | Descrive cosa fa l'applicazione.
|getInput | public | Prende in input dall'utente il nome del file da dove prelevare i dati e il nome del regista per vedere quali fil ha fatto.
|leggiFile | public	| Legge i dati dal file preso in ingresso nel metodo precedente.
|scriviFile | public | Scrive sul file *risultato.txt* i film presi dal file dato in input, il film con durata maggiore, il film fatto dal regista scelto dall'utente, e i film riordinati per durata dal più breve al pià lungo.
|scegliRegista | public | In base al regista scelto dall'utente visualizza quali film ha fatto.
|trovaFilmConDurataMaggiore | public | Trova il film con durata maggiore.  
|stampaFilmPerDurata | public | Riordina l'arraylist dal film più breve a quello più lungo.
## Author
***Saccomando Pietro***