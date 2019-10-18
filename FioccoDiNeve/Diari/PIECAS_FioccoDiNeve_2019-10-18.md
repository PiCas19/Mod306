# Fiocco di neve | Diario di lavoro
##### Pierpaolo Casati
### Canobbio, 18.10.2019

## Lavori svolti


|Data|Orario        |Lavoro svolto                 |
|-----|--------------|------------------------------|
|18.10.2019|10:05-16:00|Inserimento pulsante render e cut|
|18.10.2019|16:00-16:30|Documentazione|


##  Problemi riscontrati e soluzioni adottate
#### Ho avuto molti problemi per inserire dei button. Nella classe Window (Jpanel dell'applicazione) ho creato all'inizio un pulsante, all'inizio questo pulsante occupava tutto lo spazio. Per risolvere questo problema ho settato il layout del JPanel a null in modo che dopo potessi scegliere io la dimensione e posizione del pulsante. Il secondo problema che ho riscontrato è la funzione che permette di tagliare il triangolo. All'inizio il pulsante cut è disabilitato dopo tre punti di taglio si può tagliare il triangolo.Per ogni pulsanti ho definito un ActionCommand cioè un specie di ID che permette di sapere quale pulsante si sta cliccando. All'inizio avevo una variabile globale che diceva se il pulsante cut era stato premuto, se quest'ultimo era premuto doveva cancellare i punti di taglio e cambiare il background del poligono di taglio (colore di background uguale al background della finestra). Purtoppo non ha funzionato, quindi ho deciso creare un pulsante render che è un pulsante uguale cut ma d'aiuto. Per farlo ho creato un metodo che permette di cambiare il colore ed ogni volta che clicco render mi cambia il background del poligono di taglio.



##  Punto della situazione rispetto alla pianificazione

#### Oggi non ero molto produttivo, quindi ho deciso di continuare la documentazione.


## Programma di massima per la prossima giornata di lavoro
#### Terminare la problematica del taglio e iniziare l'algoritmo.
