1. [Introduzione](#introduzione)

  - [Informazioni sul progetto](#informazioni-sul-progetto)

  - [Abstract](#abstract)

  - [Scopo](#scopo)

1. [Analisi](#analisi)

  - [Analisi del dominio](#analisi-del-dominio)

  - [Analisi dei mezzi](#analisi-dei-mezzi)

  - [Analisi e specifica dei requisiti](#analisi-e-specifica-dei-requisiti)

  - [Use case](#use-case)

  - [Pianificazione](#pianificazione)

1. [Progettazione](#progettazione)

  - [Design dell’architettura del sistema](#design-dell’architettura-del-sistema)

  - [Design dei dati e database](#design-dei-dati-e-database)

1. [Implementazione](#implementazione)

1. [Test](#test)

  - [Protocollo di test](#protocollo-di-test)

  - [Risultati test](#risultati-test)

  - [Mancanze/limitazioni conosciute](#mancanze/limitazioni-conosciute)

1. [Consuntivo](#consuntivo)

1. [Conclusioni](#conclusioni)

  - [Sviluppi futuri](#sviluppi-futuri)

  - [Considerazioni personali](#considerazioni-personali)

1. [Sitografia](#sitografia)

1. [Allegati](#allegati)


## Introduzione

### Informazioni sul progetto

  In questo capitolo vengono raccolte diverse informazioni relative al proggetto:

  -   Allievo: Pierpaolo Casati (Sviluppatore)
  -   Docenti: Geo Petrini e Luca Muggiasca (clienti e superiori professionali)

  -   Scuola Arti e Mestieri / CPT Trevano-Canobbio , sezione informatica, modulo 306 - Realizzare un piccolo proggetto IT

  -   data inizio: 6 settembre 2019, data fine: 20 dicembre 2019

  -   Nome progetto: Fiocco di neve

### Abstract

Sono Pierpaolo Casati, un allievo della scuola Arti e Mestieri Trevano. Durante il primo semestre tutti gli allievi del terzo anno della sezione informatica devono gestire e realizzare un proggetto IT. Il nome del proggetto si chiama Fiocco di neve ed è un software che permette di generare dei fiocchi di neve. Questo proggetto viene realizzato in modo individuale da ogni allievo. Alla fine del proggetto deve essere presentato e mostrato davanti a tutta la classe.


### Scopo

  Il primo scopo di questo proggetto è mettere in pratica le nezioni che abbiamo imparato quest'anno e negli anni precedenti. Invece il secondo scopo di questo proggetto è imparare a realizzare e gestire in modo corretto un piccolo proggetto IT.


## Analisi

### Analisi del dominio

  Il software deve funzionare su delle piattaforme sul quale funziona Java e deve generare un fiocco di neve a partire dei tagli su un triangolo. Questo prodotto funziona anche con delle forbici e della carta, però con questo software viene generato più velocemente il fiocco. Questo prodotto può essere utilizzato per lo svago e quindi non è un prodotto da utilizzare in azienda. Può essere utilizzato da qualsiasi utenti anche quelli meno esperti, perché è un'applicazione intuitiva e facile da utilizzare.


### Analisi e specifica dei requisiti

  Il software deve essere funzionante e semplice da utilizzare per il committente. Il prodotto permette di generare un fiocco di neve partendo da un triangolo ritagliato. L'utente può scegliere come tagliare il triangolo, cioè quanti sono i numeri di punti di taglio e il tipo di poligono con cui tagliare il triangolo. Il prodotto parte con una finestra home dove si può caricare un modello già salvato (miniatura) o creare un nuovo taglio del triangolo. Nella finestra di taglio c'è un menu opzioni (menu a tendina) alto a sinistra, pulsante genera per vedere anteprima fiocco di neve e pulsante reset per rimuovere punto. Per tagliare viene utilizzato click sinistro (opzioni click destro per mancini) e ad ogni click viene mostrato in basso a destra il fiocco di neve (live). Nella schermata anteprima si può salvare modello cliccando un pulsante e si può anche creare un immagine PNG o SVG (scegliendo anche dimesnione 500px - 1000px) cliccando dei pulsanti. La finestra può essere ridimensionabile con dimensione minime 1024x768 px. Questo prodotto è accessibile a tutti su un sito web e non c'è un tipo di sicurezza.



  |**ID**	|**Categoria** |**Nome**			|**Priorità**|**Vers**
  |----|------------|----------------|--------|----|
  |req-00|Linguaggio |Deve essere fatto in java|1|1.0|
  |req-01|Sistema|Creare file salvataggio|2|1.0|
  |req-02|Grafica e linguaggio | Creare schermata home con caricamento miniatura o nuovo taglio|2|1.0|
  |req-03|Grafica e linguaggio | Creare barra menu in alto a sinistra|2|1.0|
  |req-04|Grafica e linguaggio|Schermata di caricamento con miniatura|2|1.0|
  |req-05|Grafica e linguaggio|La finestra deve essere ridimensionabile (Min: 1024x768)|2|1.0|
  |req-06|Grafica e linguaggio|Triangolo ridimensionabile|2|1.0|
  |req-07|Linguaggio|Creare pulsante opzione numero e tipo di poligono utilizzare|3|1.0|
  |req-08|Linguaggio |Sistema per tagliare il triangolo|1|1.0|
  |req-09|Linguaggio |Sistema per potere aggiungere (click sinistro del mouse) e resettare i punti (pulsante)|1|1.0|
  |req-010|Linguaggio e grafica |Creare tasto "Genera" per anteprima Fiocco|1|1.0|
  |req-011|Linguaggio  |Generare il fiocco di neve in tempo reale da subito (la live viene visualizzata in basso a sinistra della finestra)|3|1.0|
  |req-012|Linguaggio |Sistema per salvare fiocco di neve generato in immagine (nella schermata anteprima)|1|1.0|
  |req-013|Grafica e linguaggio |Creare pulsante opzione PNG e SVG (dimensioni: 500px)|1|1.0|
  |req-014|Sistema|Sistema per salvare i punti per modifiche o rigenerazioni future (database + miniature)|1|1.0|
  |req-015|Sistema|Salvataggio percorso in un file CSV|2|1.0|
  |req-016|Web|Creare un sito web|2|1.0|
  |req-017|Web e contesto|Sito web deve contenere lista req. di sistema, JRE, guida con screenshots|2|1.0|
  |req-018|Web e sistema|Sistema per scaricare l'applicazione|2|1.0|





**Spiegazione elementi tabella dei requisiti:**

**ID**: identificativo univoco del requisito

**Categoria**: tipo di categoria del requisito

**Nome**: breve descrizione del requisito

**Priorità**: indica l’importanza di un requisito nell’insieme del
progetto.

**Versione**: indica la versione del requisito.



### Use case

I casi d’uso rappresentano l’interazione tra i vari attori e le
funzionalità del prodotto.

### Pianificazione
- [Gantt](../Progettazione/Fiocco%20di%20neve.pdf)

### Analisi dei mezzi

- 1 PC fisso della scuola con tool necessari preinstallati
- 1 PC portatile (MacBook Pro  2015) con tool e SW necessari
- Java: JDK 12, NetBeans 11.1
- SW: Atom 1.40.1, GitHub Desktop 2.1.3 e ProjectLibre 1.9.1

## Progettazione

Questo capitolo descrive esaustivamente come deve essere realizzato il
prodotto fin nei suoi dettagli. Una buona progettazione permette
all’esecutore di evitare fraintendimenti e imprecisioni
nell’implementazione del prodotto.

### Design dell’architettura del sistema

Descrive:

-   La struttura del programma/sistema lo schema di rete...

-   Gli oggetti/moduli/componenti che lo compongono.

-   I flussi di informazione in ingresso ed in uscita e le
    relative elaborazioni. Può utilizzare *diagrammi di flusso dei
    dati* (DFD).

-   Eventuale sitemap

### Design dei dati e database

Descrizione delle strutture di dati utilizzate dal programma in base
agli attributi e le relazioni degli oggetti in uso.

### Schema E-R, schema logico e descrizione.

Se il diagramma E-R viene modificato, sulla doc dovrà apparire l’ultima
versione, mentre le vecchie saranno sui diari.

### Design delle interfacce

Descrizione delle interfacce interne ed esterne del sistema e
dell’interfaccia utente. La progettazione delle interfacce è basata
sulle informazioni ricavate durante la fase di analisi e realizzata
tramite mockups.

### Design procedurale

Descrive i concetti dettagliati dell’architettura/sviluppo utilizzando
ad esempio:

-   Diagrammi di flusso e Nassi.

-   Tabelle.

-   Classi e metodi.

-   Tabelle di routing

-   Diritti di accesso a condivisioni …

Questi documenti permetteranno di rappresentare i dettagli procedurali
per la realizzazione del prodotto.

## Implementazione

In questo capitolo dovrà essere mostrato come è stato realizzato il
lavoro. Questa parte può differenziarsi dalla progettazione in quanto il
risultato ottenuto non per forza può essere come era stato progettato.

Sulla base di queste informazioni il lavoro svolto dovrà essere
riproducibile.

In questa parte è richiesto l’inserimento di codice sorgente/print
screen di maschere solamente per quei passaggi particolarmente
significativi e/o critici.

Inoltre dovranno essere descritte eventuali varianti di soluzione o
scelte di prodotti con motivazione delle scelte.

Non deve apparire nessuna forma di guida d’uso di librerie o di
componenti utilizzati. Eventualmente questa va allegata.

Per eventuali dettagli si possono inserire riferimenti ai diari.

## Test

### Protocollo di test

Definire in modo accurato tutti i test che devono essere realizzati per
garantire l’adempimento delle richieste formulate nei requisiti. I test
fungono da garanzia di qualità del prodotto. Ogni test deve essere
ripetibile alle stesse condizioni.


|Test Case      | TC-001                               |
|---------------|--------------------------------------|
|**Nome**       |Import a card, but not shown with the GUI |
|**Riferimento**|REQ-012                               |
|**Descrizione**|Import a card with KIC, KID and KIK keys with no obfuscation, but not shown with the GUI |
|**Prerequisiti**|Store on local PC: Profile\_1.2.001.xml (appendix n\_n) and Cards\_1.2.001.txt (appendix n\_n) |
|**Procedura**     | - Go to “Cards manager” menu, in main page click “Import Profiles” link, Select the “1.2.001.xml” file, Import the Profile - Go to “Cards manager” menu, in main page click “Import Cards” link, Select the “1.2.001.txt” file, Delete the cards, Select the “1.2.001.txt” file, Import the cards |
|**Risultati attesi** |Keys visible in the DB (OtaCardKey) but not visible in the GUI (Card details) |


### Risultati test

Tabella riassuntiva in cui si inseriscono i test riusciti e non del
prodotto finale. Se un test non riesce e viene corretto l’errore, questo
dovrà risultare nel documento finale come riuscito (la procedura della
correzione apparirà nel diario), altrimenti dovrà essere descritto
l’errore con eventuali ipotesi di correzione.

### Mancanze/limitazioni conosciute

Descrizione con motivazione di eventuali elementi mancanti o non
completamente implementati, al di fuori dei test case. Non devono essere
riportati gli errori e i problemi riscontrati e poi risolti durante il
progetto.

## Consuntivo

Consuntivo del tempo di lavoro effettivo e considerazioni riguardo le
differenze rispetto alla pianificazione (cap 1.7) (ad esempio Gannt
consuntivo).

## Conclusioni

Quali sono le implicazioni della mia soluzione? Che impatto avrà?
Cambierà il mondo? È un successo importante? È solo un’aggiunta
marginale o è semplicemente servita per scoprire che questo percorso è
stato una perdita di tempo? I risultati ottenuti sono generali,
facilmente generalizzabili o sono specifici di un caso particolare? ecc

### Sviluppi futuri
  Migliorie o estensioni che possono essere sviluppate sul prodotto.

### Considerazioni personali
  Cosa ho imparato in questo progetto? ecc

## Bibliografia

### Bibliografia per articoli di riviste
1.  Cognome e nome (o iniziali) dell’autore o degli autori, o nome
    dell’organizzazione,

2.  Titolo dell’articolo (tra virgolette),

3.  Titolo della rivista (in italico),

4.  Anno e numero

5.  Pagina iniziale dell’articolo,

### Bibliografia per libri


1.  Cognome e nome (o iniziali) dell’autore o degli autori, o nome
    dell’organizzazione,

2.  Titolo del libro (in italico),

3.  ev. Numero di edizione,

4.  Nome dell’editore,

5.  Anno di pubblicazione,

6.  ISBN.

### Sitografia

1.  URL del sito (se troppo lungo solo dominio, evt completo nel
    diario),

2.  Eventuale titolo della pagina (in italico),

3.  Data di consultazione (GG-MM-AAAA).

**Esempio:**

-   http://standards.ieee.org/guides/style/section7.html, *IEEE
    Standards Style Manual*, 07-06-2008.

## Allegati

Elenco degli allegati, esempio:

-   Diari di lavoro

-   Codici sorgente/documentazione macchine virtuali

-   Istruzioni di installazione del prodotto (con credenziali
    di accesso) e/o di eventuali prodotti terzi

-   Documentazione di prodotti di terzi

-   Eventuali guide utente / Manuali di utilizzo

-   Mandato e/o Qdc

-   Prodotto

-   …
