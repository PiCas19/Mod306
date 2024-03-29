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
  -   Docenti: Geo Petrini e Luca Muggiasca (superiori professionali)

  -   Scuola Arti e Mestieri / CPT Trevano-Canobbio , sezione informatica, modulo 306 - Realizzare un piccolo proggetto IT

  -   data inizio: 6 settembre 2019, data fine: 20 dicembre 2019

  -   Nome progetto: Fiocco di neve

### Abstract

Sono Pierpaolo Casati, un allievo della scuola Arti e Mestieri di Trevano. Durante il primo semestre tutti gli allievi del terzo anno della sezione informatica devono gestire e realizzare un proggetto IT. Il nome del proggetto si chiama Fiocco di neve ed è un software che permette di generare dei fiocchi di neve. Questo proggetto viene realizzato in modo individuale da ogni allievo. Alla fine del proggetto deve essere presentato e mostrato davanti a tutta la classe.


### Scopo

  Il primo scopo di questo proggetto è mettere in pratica le nozioni che abbiamo imparato quest'anno e negli anni precedenti. Invece il secondo scopo è quello di imparare a realizzare e gestire in modo corretto un piccolo proggetto IT.


## Analisi

### Analisi del dominio

  Il software deve funzionare su delle piattaforme sul quale funziona Java e deve generare un fiocco di neve a partire dei tagli su un triangolo. Questo prodotto funziona anche con delle forbici e della carta, però con questo software viene generato più velocemente il fiocco. Questo prodotto può essere utilizzato per lo svago e quindi non è un prodotto da utilizzare in azienda. Può essere utilizzato da qualsiasi utenti anche quelli meno esperti, perché è un'applicazione intuitiva e facile da utilizzare.


### Analisi e specifica dei requisiti

  Il software deve essere funzionante e semplice da utilizzare per il committente. Il prodotto permette di generare un fiocco di neve partendo da un triangolo ritagliato. L'utente può scegliere come tagliare il triangolo, cioè quanti sono i numeri di punti di taglio e il tipo di poligono con cui tagliare il triangolo. Il prodotto parte con una finestra home dove si può caricare un modello già salvato (miniatura) o creare un nuovo taglio del triangolo. Nella finestra di taglio c'è un menu opzioni (menu a tendina) alto a sinistra, pulsante genera per vedere anteprima fiocco di neve e pulsante reset per rimuovere punto. Per tagliare viene utilizzato click sinistro (opzioni click destro per mancini) e ad ogni click viene mostrato in basso a destra il fiocco di neve (live). Nella schermata anteprima si può salvare modello cliccando un pulsante e si può anche creare un immagine PNG o SVG (scegliendo anche dimensione 500px - 1000px) cliccando dei pulsanti. La finestra può essere ridimensionabile con dimensione minime 1024x768 px. Questo prodotto è accessibile a tutti su un sito web.



  |**ID**	|**Categoria** |**Nome**			|**Priorità**|**Vers**
  |----|------------|----------------|--------|----|
  |req-00|Linguaggio |Deve essere fatto in java|1|1.0|
  |req-01|Sistema|Creare file di salvataggio|2|1.0|
  |req-02|Grafica e linguaggio | Creare schermata home con caricamento miniatura o nuovo taglio|2|1.0|
  |req-03|Grafica e linguaggio | Creare barra menu in alto a sinistra|2|1.0|
  |req-04|Grafica e linguaggio|Schermata di caricamento con miniatura|2|1.0|
  |req-05|Grafica e linguaggio|La finestra deve essere ridimensionabile (Min: 1024x768)|2|1.0|
  |req-06|Grafica e linguaggio|Triangolo ridimensionabile|2|1.0|
  |req-07|Linguaggio|Creare pulsante opzione "numero" e "tipo di poligono da utilizzare"|3|1.0|
  |req-08|Linguaggio |Sistema per tagliare il triangolo|1|1.0|
  |req-09|Linguaggio |Sistema per potere aggiungere (click sinistro del mouse) e resettare i punti (pulsante)|1|1.0|
  |req-010|Linguaggio e grafica |Creare tasto "Genera" per anteprima Fiocco|1|1.0|
  |req-011|Linguaggio  |Generare il fiocco di neve in tempo reale (la live viene visualizzata in basso a sinistra della finestra)|3|1.0|
  |req-012|Linguaggio |Sistema per salvare fiocco di neve generato in immagine (nella schermata anteprima)|1|1.0|
  |req-013|Grafica e linguaggio |Creare pulsante opzione PNG e SVG (dimensioni: 500px 0 1000px)|1|1.0|
  |req-014|Sistema|Sistema per salvare i punti per modifiche o rigenerazioni future (database + miniature)|1|1.0|
  |req-015|Sistema|Salvataggio percorso in un file CSV|2|1.0|
  |req-016|Web|Creare un sito web|2|1.0|
  |req-017|Web e contesto|Sito web deve contenere lista req. di sistema, JRE, guida con screenshots|2|1.0|
  |req-018|Web e sistema|Sistema per scaricare l'applicazione|2|1.0|






**Spiegazione elementi tabella dei requisiti:**

**ID**: identificativo univoco del requisito

**Categoria**: tipo di categoria del requisito

**Nome**: Nome del requisito

**Priorità**: indica l’importanza di un requisito nell’insieme del
progetto.

**Versione**: indica la versione del requisito.



### Use case

![use case](img/use_case.png)


### Pianificazione
- [Gantt](../Progettazione/Fiocco%20di%20neve.pdf)

### Analisi dei mezzi

- 1 PC fisso della scuola con tool necessari preinstallati
- 1 PC portatile (MacBook Pro  2015) con tool e SW necessari
- Java: JDK 12, NetBeans 11.1
- SW: Atom 1.40.1, GitHub Desktop 2.1.3 e ProjectLibre 1.9.1

## Progettazione

### Design dei dati e dei database

```
npoints, [xpoints],[ypoints]
```

**Spiegazioni elementi ne lfile csv:**

**npoints**: numero di punti presenti in un poligono
**xpoints**: coordinate x dei punti
**ypoints**: coordinate y dei punti


### Design dell’architettura del sistema

```
SnowflakeGenerator
│  
└─── Source Packages
│   │   
│   └─── Frame
│   │   │   LivePanel.java
│   │   │   MainFrame.java
│   │   │   SnowflakeFrame.java
│   │   │   SnowflakePanel.java
│   │
│   └─── Image
│   │     │ home.png
│   │     │ mouse.png
│   │     │ new.png
│   │     │ open.png
│   │     │ snowflake.png
│   │
│   └─── Shapes
│       │ CutPolygon.java
│       │ SnowflakeTriangle.java
│
└─── Test Packages
│
└─── Libraries
│   │ batik-rasterizer-1.12.jar
│   │ batik-slideshow-1.12.jar
│   │ batik-squiggle-1.12.jar
│   │ batik-svgpp-1.12.jar
│   │ batik-all-1.12.jar
│   │ JDK 12
│
└─── Test Libraries   
```

### Schema E-R, schema logico e descrizione.

![uml snowflake](img/uml_snowflake.png)

### Design delle interfacce

![window design](img/window_snowflake.png)

![website design](img/design_website.png)


### Design procedurale

- [Javadoc](../Javadoc)

## Implementazione

Per realizzare questo proggetto ho pensato a quattro fasi di implementazione:
- Disegnare triangolo, punti/poligoni di taglio e responsive della finestra.
- Generazione del fiocco di neve e generazione immagini PNG o SVG.
- Salvataggio punti e creazione menu principale.
- Creazione sito web




#### Classe SnowflakeTriangle

Ho creato la classe SnowflakeTriangle che rappresenta il modello astratto del triangolo che viene utilizzato per generare il fiocco di neve.

```java

public void setCoordinates(){
        this.x[0] = this.width * 20 / 100;
        this.y[0] = this.height * 10 / 100;
        this.x[1] = this.width * 80 / 100;
        this.y[1] = this.height * 10 / 100;


        double a = Math.pow(this.x[1] - this.x[0], 2);
        double b =  Math.pow(this.y[1] - this.y[0], 2);

        double d = Math.sqrt(a + b);

        double angle = Math.acos((x[1] - this.x[0]) / d);

        this.x[2] = (int) ((2 * d) * Math.cos(Math.PI / 3 + angle) + this.x[0]);
        this.y[2] = (int) ((2 * d) * Math.sin(Math.PI / 3 + angle) + this.y[0]);
    }


```

Questo metodo permette di settare le coordinate del triangolo.

**x0 e y0: Spigolo in alto a sinistra**
**x1 e y1: Spigolo in alto a destro**
**x3 e y3: Spigolo in centro in basso**

Le coordinate 0 e 1 sono posizionate in proporzione rispetto la finestra di taglio.
Invece la coordinata 3 è posizionata in modo che il triangolo sia un triangolo 30, 60 e 90.

#### Classe SnowflakePanel

In questa classe viene disegnata l'area di taglio in cui è inscritto il triangolo.

```java
private void draw() {
        //Rettangolo nel quale è insritto il triangolo snowflake.
        g2.setColor(new Color(26, 26,26));
        g2.fillRect(0, 0, WIDTH, HEIGHT);

        //SnowflakeTriangle
        g2.setColor(this.flake);  
        g2.fill(this.areaTriangle);
        this.cutPolygon.drawCutPolygon(g2, polygons, new Color(255, 0, 0, 100));

        //Disegno i punti di taglio sulla finestra.
        g2.setColor(new Color(160,160,160));
        for (int i = 0; i < this.cutPoints.size(); i++) {
            Point p = this.cutPoints.get(i);
            g2.fillOval(p.x - RADIUS, p.y - RADIUS, RADIUS * 2, RADIUS * 2);
        }



        //connetto i vari punti
        this.cutPolygon = new CutPolygon(this.cutPoints);

        this.cutPolygon.connectPointsPolygon(g2);


    }


```

Il metodo draw permette di disegnare lo stato dell'area di taglio.
In questo metodo vengono disegnati:
  - SnowflakeTriangle (prima e dopo il taglio)
  - Punti di taglio
  - Poligoni di taglio

In questo metodo utilizzo la variabile g2 di tipo Graphics2D che è una libreria di grafica con funzioni più avanzate rispetto alla libreria Graphics.


##### Resposnsive

Per fare il responsive del triangolo e dei punti di taglio ho utilizzato una tecnica di grafica chiamata doppio buffering. Questa tecnica permette di fare tutti i calcoli di ridimensionamento su una buffered image e inseguito viene disegnata l'immagine sulla finestra.

Qui sotto viene mostrato come creare una buffered image.

```Java
  img = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
  g2 = (Graphics2D) img.getGraphics();

```


Metodo per ridimensionare bufferd image.

```java
private BufferedImage resized(Dimension scale) {
        //immagine buffered temporanea ridimensionata
        Image tmp = img.getScaledInstance((int) scale.getWidth(), (int) scale.getHeight(), Image.SCALE_SMOOTH);
        //immagine buffered nuova
        BufferedImage resized = new BufferedImage((int) scale.getWidth(), (int) scale.getHeight(),
                BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = resized.createGraphics();
        //disegno l'immagine ridimensionata
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();
        return resized;
    }



```

Metodo che serve per ridimensionare la finestra.

```java


    //altezza e altezza originale
    int original_width = WIDTH;
    int original_height = HEIGHT;

    //altezza e larghezza dello SnowflakePanel
    int bound_width = this.getWidth();
    int bound_height = this.getHeight();

    //nuove altezze e altezze
    int new_width = original_width;
    int new_height = original_height;


    if (original_width > bound_width) {
        new_width = bound_width;
        new_height = (new_width * original_height) / original_width;
    }

    if (new_height > bound_height) {
        new_height = bound_height;
        new_width = (new_height * original_width) / original_height;
    }

    return new Dimension(new_width, new_height);
}


```


#### Aggiungere punti di taglio

Ad ogni click sinistro del mouse aggiungo un nuovo punto alla lista dei punti di taglio.

```Java
public void addPoint(Point p) {
    Dimension scale = this.getScaledDimension();
    // i punti sono salvati in coordinate dell'immagine
    p.x -= (int) (this.getWidth() - scale.getWidth()) / 2;
    p.y -= (int) (this.getHeight() - scale.getHeight()) / 2;
    p.x *= (WIDTH / scale.getWidth());
    p.y *= (HEIGHT / scale.getHeight());
    if (p.x < 0 || p.y < 10 || p.x > WIDTH  ||
            p.y > HEIGHT - 10) {
        return;
    }
    this.cutPoints.add(p);
}

```

In questo metodo controllo che ogni punto sia all'interno dell'area di taglio.



#### Generazione fiocco di neve

Per generare il fiocco neve o creato due classi:
- CutPolygon (poligoni di taglio)
- LivePanel (finestra sulla quale viene generato il fiocco di neve)


##### CutPolygon

In questa classe faccio i vari calcoli per disegnare e per collegare i punti di taglio. L'area del triangolo viene modificata solo quando clicco il pulsante "Cut". Quando clicco quest'ultimo mi richiama un metodo che permette di rimuovere solamente l'area di intersezione tra l'area del triangolo e l'area dei poligini di taglio.

```java

public void cut(){
       if( this.polygons.size() > 0){
           this.cut = true;
           for(int i = 0; i < polygons.size(); i++){
               this.clonePolygons.add(this.polygons.get(i));
               Area areaPolygon = new Area(polygons.get(i));
               this.areaTriangle.subtract(areaPolygon);
           }
           this.polygons.clear();
       }
       repaint();
   }

```
##### LivePanel

In questa classe viene generato e disegnato il fiocco di neve. Per realizzare il fiocco di neve ho utilizzato AffineTransform. Quest'ultima è un libreria matematica che utilizza i vettori.






##### Generazione immagine PNG e svg

Per la generazione dell'immagine PNG ho creato una nuova immagine di tipo PNG sulla quale ho disegnato il fiocco di neve rifacendo i calcoli. Invece per l'immagine SVG ho scaricato una libreria chiamata [batik](https://xmlgraphics.apache.org/batik/).


##### Salvataggio Punti
Per il salvataggio ho utilizzato la libreria JFileChooser che permette di aprire una finestra sulla quale posso aprire o salvare un file. Inseguto ho utilizzato il seguente metodo per poter scrivere all'interno di un file CSV.

```java

public void createCSV(File directory) throws IOException{


     //creazione file
     File fileName = new File(
                     directory.toPath().toAbsolutePath().toString() +"/template_ " + new Date().toString() +".csv"
     );




     //contenuto che ci deve essere all'interno del csv
     List<List<String>> rows = new ArrayList<>();
     for(Polygon p : this.clonePolygons){
         rows.add(
                 Arrays.asList(
                         String.valueOf(p.npoints),
                         Arrays.toString(p.xpoints),
                         Arrays.toString(p.ypoints)
                 )
         );

     }

     //scrivo all'intrno del file

     FileWriter csvWriter = new FileWriter(fileName);



     for (List<String> rowData : rows) {
         csvWriter.append(String.join("; ", rowData));
         csvWriter.append("\n");
     }

     csvWriter.flush();
     csvWriter.close();

     fileName.setReadOnly();
     fileName.setWritable(false);
     JOptionPane.showMessageDialog(
             null, "Save cut polygons");
 }
```

Per poter leggere il contenuto ho lavorato con le stringhe.

##### Menu principale

Per il menu principale mi sono isparato molto a delle applicazioni già esistenti, come ad esempio Sketch.

![sketch](img/sketch.png)


Per aprire un sito web da java ho utilizzato il seguente metodo.


```java
public void goToWebSite(String url){
       try {
           java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
       } catch (IOException ex) {
       }
   }
```

#### Creazione sito web

Per realizzare la pagina web del progetto ho scaricato dal sito https://freehtml5.co il template "cube". Inseguito ho soltanto modificato il contenuto della pagina web.


## Test

### Protocollo di test

|**ID**	|**Referimento** |**Nome** |**Descrizione** |**Procedura** |**Risultati attesi**
|----------|----------------|---------|----------------|--------------|--------------------|
|tc-01 | req-01|Creare file di salvataggio|File sul quale vengono salvati i punti di taglio| Nel menu bar del frame principale si deve cliccare la voce "File" => "Save". Quest'ultimo permette di salvare i punti di taglio| Ogni volta che salvo i punti di taglio l'applicazione deve creare un file di salvataggio di punti|
|tc-02| req-02 | Finestra home con caricamento miniatura o nuovo taglio|Un Frame sul quale posso scegliere se creare un nuovo taglio o caricare dei tagli già esistenti|Quando avvio l'applicazione ho due opzioni:</br>1. Caricare dei tagli già esistenti.</br> 2. Creare un nuovo taglio.</br>| Se scelgo di caricare dei tagli già esistenti, mi crea il triangolo con i vari poligoni di taglio. Invece se scelgo l'opzione nuovo, mi crea una finestra con un nuovo triangolo|
|tc-03|req-03|Creare barra menu in alto a sinistra|MenuBar in alto a sinistra con opzione file, nel quale si può salvare punti di taglio, craere un nuovo Snowflake e aprire dei tagli esistenti|Cliccare nella menubar l'opzione file| Quando clicco il menu "File" apre un menu a tendina nel quale si trovano le opzioni "New", "Open", "Save"|
tc-04|req-04|Schermata di caricamento con miniatura|Quando avvio l'applicazione si apre per prima una schermata di caricamento dove posso scegliere se creare un nuovo fiocco o caricare una miniatura|Avviare l'applicazione. Nella schermata di caricamento posso scegliere due opzione.|Se scelgo l'opzione "New", mi permette di creare un nuovo fiocco di neve. Se invece clicco "Open", mi permette di caricare dei punti che ho salvato in precedenti tagli. Quest'ultimi posso utilizzarli come template di partenza.|
|tc-05  |req-05|Finestra ridimensionabile|La finestra dell'applicazione deve essere ridimensionabile|1. Aprire l'applicazione e con il mouse cercare di ridimensionare la finestra <br/> 2. Diminuire la finestra per verificare che le dimensioni minime sono di 1024x768| La finestra è ridimensionabile e le sue dimensioni minime siano di 1024x768|
|tc-06|req-06|Triangolo ridimensionabile|Quandi ridimensiono la finestra, si deve anche ridimensionare il triangolo|Ridimensionare la finestra e verificare che il triangolo mantenga le sue proporzioni| Il triangolo mantiene le sue proporzioni indipendentemente dalla dimensione della finestra|
|tc-07|req-07|Creare pulsante opzione "numero" e "tipo di poligono da utilizzare"|"Un combo box che permette di definire la figura geometrica per tagliare il triangolo.Un'altro pulsante invece permette di aggiungere una nuovo poligono o figura per tagliare il triangolo|Cliccare sul combo box e scgliere la figura gemetrica da utilizzare per tagliare il triangolo. Cliccare il pulsante per aggiungere un nuovo poligono o figura geometrica|Se clicco sul combo box posso scegliere quale figura geometrica serve per tagliare il triangolo. Invece quando clicco il pulsante mi permette di aggiungere una nuovo poligono|
|tc-08|req-08|Sistema per tagliare il triangolo|Sistema che mi permette di tagliare il triangolo|Ad ogni click mi permette di aggiungere un punto di taglio. Quest'ultimi vengono collegati e generano un poligono. Cliccando un pulsante "Cut" taglia il triangolo e genera il fiocco di neve|Fiocco di neve generato|
|tc-09|Sistema per potere aggiungere (click sinistro del mouse) e resettare i punti (pulsante)|Click sinistro permette di aggiungere un punto di taglio e un pulsante "reset" mi resetta tutti i punti aggiunti|Quando faccio il click sinistro del mouse mi aggiunge un punto di taglio. Invece quando clicco il pulsante "reset" mi permette di rimuovere tutti i punti di taglio|Ad ogni click sinistro del mouse mi aggiunge un nuovo punto di taglio. Ogni volta che clicco sul pulsante "reset" mi rimuove i punti|Quando faccio il click sinistro del mouse deve essere aggiunto un punto. Quando clicco il pulsante "reset" si deve rimuovere tutti i punti|
|tc-10|req-10|Creare tasto "Genera" per anteprima Fiocco| Pulsante che permette di generare il fiocco di neve|Dopo avere inserito tutti i poligoni di taglio, cliccare il pulsante "Cut" che permette di generare il fiocco di neve|Fiocco di neve generato|
|tc-11|req-11|Generare il fiocco di neve in tempo reale da subito (la live viene visualizzata in basso a sinistra della finestra)|Permette di generare il fiocco in tempo reale|Ad ogni click del mouse mi genera in tempo reale il fiocco di neve|Fiocco di neve generato in tempo reale|
|tc-12|req-12|Sistema per salvare fiocco di neve generato in immagine (nella schermata anteprima)|Permette di salvare il fiocco in png e svg|Cliccare un pulsante per generare un immagine png e un'altro pulsante per svg|Immagine del fiocco di neve in formato png o svg|
|tc-13|req-13|Creare pulsante opzione PNG e SVG (dimensioni: 500px 0 1000px)|Permette di definire la dimensione dell'immagine|Cliccare un radio button specifico (500px o 1000px) in modo che posso creare un immagine con una determinata dimensione|Immagine con dimensioni 500px o 1000px|
|tc-14|req-14|Sistema per salvare i punti per modifiche o rigenerazioni future (database + miniature)|File template nel quale ho i vari punti per generazioni future|Cliccare un pulsante che mi permette d generare un file csv con all'interno tutte le coordinate die vari punti di taglio|File template|
|tc-15|req-15|Salvataggio percorso in un file CSV|File csv con le varie coordinate|Ogni volta che si salvano i punti vengono scritti all'interno del file csv|Punti salvati nel file csv|
|tc-16|req-16|Creare un sito web|Sito web con i vari contenuti|Aprire il sito web e verificare che ci siano tutti contenuti neccessari|Sito web|
|tc-17|req-17|Web e contesto|Sito web deve contenere lista req. di sistema, JRE, guida con screenshots|Aprire il sito per potere capire come funziona l'applicazione guida|Verificare che nel sito una guida per capire come funziona l'applicazione|
|tc-18|req-18| Web e sistema|Pulsante che permette di scaricare l'applicazione| Entrare nel sito e cliccare il pulsante per scaricare applicazione|Potere scaricare l'applicazione|


**Spiegazione elementi tabella dei test case:**

**ID**: identificativo univoco del test case

**Referimento**: Requisito del referimento

**Nome**: Nome del requisito

**Desrcizione**: breve descrizione del requisito

**Procedura**: Vari passaggi per verificare il Requisito

**Risultati attesi**: Risultati attesi dopo la verifica



### Risultati test

|**ID**	| **Funziona**|**Note**|
|-------|-------------|--------|
|tc-01  |Sì           |Menu diverso|
|tc-02  |Parzialmente |Manca solo miniatura|
|tc-03  |Sì           |Menu si trova a ovest nel frame|
|tc-04  |Parzialmente |Manca solo caricamneto miniatura|
|tc-05  |Sì           ||
|tc-06  |Sì           ||
|tc-07  |Parzialmente |Manca solo combobox per scegliere tipo di figura|
|tc-08  |Sì           ||
|tc-09  |Sì           ||
|tc-10  |Sì           |Bottone si chiama "Cut"|
|tc-11  |No           ||
|tc-12  |Sì           ||
|tc-13  |Sì           ||
|tc-14  |Sì           ||
|tc-15  |Sì           ||
|tc-16  |Sì           ||
|tc-17  |Sì           ||
|tc-18  |Sì           ||



## Consuntivo

- [Gantt consuntivo](../Progettazione/Fiocco%20di%20neve%20consuntivo.pdf)

## Conclusioni

Questo proggetto mi ha permesso di rafforzare le mie nozioni in java e nella proggettazione. Quindi ritengo le mie conclusioni molto positive. In effetti all'inizio non sapevo che cosa dovevo fare per prima, ma grazie alla teoria che ho messo in pratica sono riuscito a realizzare un snowflake generator abbastanza performante.


### Sviluppi futuri
Per rendere l'applicazione ancora più performante: aggiungerei la possibilità di muovere i punti, di decidere quale punti rimuovere e di aggiungere anche la generazione in tempo reale del fiocco di neve.

### Considerazioni personali

Grazie a questo progetto ho imparato a realizzare e gestire in modo corretto un piccolo proggetto IT e ho anche aumentato le mie nozioni in Java.

## Bibliografia


### Sitografia

- https://www.iconfinder.com, *Sito web per scaricare icone**, 19-12-2019
- https://stackoverflow.com, *Sito web che contiene risposte o domande ad argomenti di programmazione**, 13-12-2019
- https://docs.oracle.com/javase/7/docs/api/index.html, *Java Platform, Standard Edition 7 API Specification*, 13-12-2019
- https://freehtml5.co, *Sito web per scaricare template html5*, 16-12-2019
- http://www.samtinfo.ch/i17caspie/Snowflake%20website/, *Sito web dell'applicazione**, 20-12-2019

## Allegati

Elenco degli allegati:

-   [diari](../Diari)

-   [Codice sorgente](../SnowflakeGenerator)

-   [Qdc](../QdC_Primo%20Semestre%20-%20Fiocco%20di%20neve.pdf)
