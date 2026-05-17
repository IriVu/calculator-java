\# Calculator Java - Static Analysis Report



\## 1. LOC (Lines of Code)



Ukupan broj linija koda (LOC) za ceo projekat:



LOC: 233



\---



\## 2. Staticka analiza koda (Code Review)



Calculator.java – 1 – Fajl sadrži svu logiku u jednoj klasi (nema separacije odgovornosti)

Calculator.java – 10 – Moguće korišćenje magic numbers u operacijama

Calculator.java – 20 – Nedostaje validacija ulaznih podataka



Start.java – 5 – Nejasno imenovanje promenljivih

Start.java – 8 – Direktno korišćenje System.out.println (nije skalabilno rešenje)



LICENSE – 1 – Fajl nije relevantan za metrike, ali je prisutan u projektu



\---



\## 3. Zaključak



Kod je jednostavan i funkcionalan, ali postoje mesta za unapređenje:

\- Razdvajanje logike u više klasa

\- Dodavanje validacije ulaza

\- Bolje imenovanje promenljivih

\- Smanjenje dupliranja i poboljšanje strukture

