# Treno-estensibile

- Vogliamo simulare un treno estensibile che viaggia da Milano a Roma effettuando N tappe.
- Ad ogni tappa il treno carica X passeggieri e ne scarica Y.
- Il treno ha inizialmente 5 vagoni, ognuno con capienza K.
- Ad un certo punto, in una o più delle fermate intermedie, sul treno salgono piè passeggeri rispetto al numero totale di posti disponibili.
- Ecco che ogni volta il treno si estende dinamicamente aggiungendo uno o più vagoni a seconda dell’esigenza.
- Per simulare questo scenario, si consiglia di costruire una classe Treno come array di interi (numero attuale passeggeri per ogni vagone).
-Il Viaggio costituirà la classe Main.
-Le tappe modificano il numero di viaggiatori in ogni vagone tramite un metodo random che decide quanti salgono e quanti scendono. Si riempie prima il primo vagone, quindi i successivi.
- Si propone di istanziare più treni di lunghezza diversa e di “interscambiarli” (copiarli)  fra di loro all’occorrenza (quando tutti i vagoni sono pieni).
- Per fare ciò, utilizzate il metodo appena spiegato Arrays.copyOf contenuto nella libreria util.Arrays.
