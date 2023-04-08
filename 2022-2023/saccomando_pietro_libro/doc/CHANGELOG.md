# Libro


## Descrizione
Si crea un'applicazione che prendendo in input dei film dal file *libro.txt* restituisce il libro con il numero di pagine maggiore, la lista di libri riordinata dal libro più breve al più lungo, e scelto un regista stampare i libri che ha scritto. 

**Classe Libro**
| METODI | VISIBILITA'| SCOPO |
|-------|--------|---------|
|setTitolo | public | Imposta il titolo del libro.
|getTitolo | public | Restituisce il titolo del libro.
|setAutore | public | Imposta l'autore del libro.
|getAutore | public | Restituisce l'autore del libro.
|setNumPagine | public | Imposta il numero di pagine del libro.
|getDurata | public	| Restituisce il numero di pagine del libro.
|toString | public | Restituisce una stringa che contiene i valori delle variabili di istanza. 


**Classe FilmCalculator**
| METODI | VISIBILITA'| SCOPO |
|-------|--------|---------|
|start | public	 | Richiama i metodi descriviAttività, getInput, scriviFile.
|descrviAttività | public | Descrive cosa fa l'applicazione.
|getInput | public | Prende in input dall'utente il nome del file da dove prelevare i dati e il nome del'autore per vedere quali libri ha scritto.
|leggiFile | public	| Legge i dati dal file preso in ingresso nel metodo precedente.
|scriviFile | public | Scrive sul file *risultato.txt* i libri presi dal file dato in input, il libri con il numero di pagine maggiore, il libro scritto dall'autore scelto dall'utente, e i libri riordinati per numero di pagine dal più breve al pià lungo.
|stampaLibriDiAutore | public | In base all'autore scelto dall'utente visualizza quali libri ha scritto.
|trovaLibroConNumPagineMaggiore | public | Trova il libro con il numero di pagine maggiore.  
|stampaLibriPerNumPagine | public | Riordina l'arraylist dal libro più breve a quello più lungo.
## Author
***Saccomando Pietro***