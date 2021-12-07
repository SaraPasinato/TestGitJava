# Pangram

>A pangram is a sentence that contains every single letter of the alphabet at least once.

For example,

the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).

Given a string, detect whether or not it is a pangram. 

Return True if it is, False if not. Ignore numbers and punctuation.

---

## Descrizione:

1. PangramTest file per il test dei risultati
1. PangramChecker file per il funzione check pangramma
    - prendo la frase ed elimino ogni spazio e sotto stringa non richiesta nell'espressione regolare 
    - Creo un Set di lettere dove inserisco tutte le lettere senza duplicazioni.
    - poi se le lettere sono > = 26 vuol dire che la frase è un pangramma.



