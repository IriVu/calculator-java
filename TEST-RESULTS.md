# IZVEŠTAJ O TESTIRANJU KORIŠĆENJEM METODE CRNE KUTIJE (BLACK-BOX)

Projekat: calculator-java
Datum testiranja: Maj 2026.

Tokom sistemskog testiranja aplikacije izvršeni su različiti test scenariji kako bi se proverila stabilnost sistema, prioritet računskih operacija i rukovanje neispravnim unosima korisnika.

---

### 1. Pouzdani scenariji (Happy Path) - Provera funkcionalnosti

* **Test Case ID: TC-01**
    * **Opis:** Provera osnovnog prioriteta računskih operacija.
    * **Unos:** `10+5*4+3`
    * **Očekivani rezultat:** `33.0` (jer množenje ima prioritet)
    * **Status:** PASSED / FAILED (Dopiši stvarno stanje u zavisnosti od toga kako tvoj kod trenutno računa)

* **Test Case ID: TC-02**
    * **Opis:** Unos jednostavnog izraza sa razmacima.
    * **Unos:** ` 4 + 5 - 2 `
    * **Očekivani rezultat:** `7.0` (Aplikacija uspešno čisti razmake pre računanja)
    * **Status:** PASSED / FAILED

---

### 2. Robusnost i rukovanje greškama (Edge Cases & Negative Testing)

Ovi testovi služe za pronalaženje eventualnih propusta, nedostataka i kritičnih tačaka pucanja programa.

* **Test Case ID: TC-03**
    * **Opis:** Testiranje deljenja nulom.
    * **Unos:** `10/0` ili `5+4/0`
    * **Očekivani rezultat:** Program treba da prikaže tekstualnu poruku o grešci (npr. "Deljenje nulom nije dozvoljeno") i nastavi sa radom.
    * **Uočeni nedostatak (Propust):** Ukoliko program baci neobrađeni `ArithmeticException` i potpuno se ugasi (crash), ovo se beleži kao kritična greška.

* **Test Case ID: TC-04**
    * **Opis:** Unos nedozvoljenih karaktera (slova i specijalni znaci).
    * **Unos:** `5+abc*2` ili `10$2`
    * **Očekivani rezultat:** Program treba da validira unos i ispiše "Sintaksna greška: Neispravan unos".
    * **Uočeni nedostatak:** Ukoliko program pokuša da parsira slova i baci `NumberFormatException` ili se ponaša nepredvidivo.

* **Test Case ID: TC-05**
    * **Opis:** Uzastopni operatori i nekompletni izrazi.
    * **Unos:** `5++3` ili `10+5*`
    * **Očekivani rezultat:** Program prijavljuje grešku u strukturi izraza.
    * **Uočeni nedostatak:** Program se ruši jer ne može da pronađe broj sa desne strane operatora.

* **Test Case ID: TC-06**
    * **Opis:** Unos praznog stringa (Korisnik samo pritisne Enter).
    * **Unos:** `` (prazan unos)
    * **Očekivani rezultat:** Program traži ponovni unos ili bezbedno izlazi bez greške.
    * **Uočeni nedostatak:** Pucanje programa usled pokušaja čitanja prvog karaktera koji ne postoji.

---

### ZAKLJUČAK I ZAPAŽANJA:
Glavni uočeni nedostaci aplikacije se uglavnom odnose na nedostatak **validacije korisničkog unosa** (Input Validation). Da bi aplikacija prošla test prihvatljivosti, potrebno je implementirati Try-Catch blokove i Regex proveru pre slanja izraza metodu za računanje.
