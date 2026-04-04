![CI workflow status badge for qa-loops-project-java showing current build results](https://github.com/aantonie/qa-loops-project-java/actions/workflows/ci.yml/badge.svg)

```
Fisierul cuprinde doua parti: descrierea cerintelor proiectului si detalii tehnice ale fluxului de lucru al pipeline-lui:

- **Cerințe Tehnice și Pași de Urmat:**

1.	Creeaza un nou proiect Java cu Maven
2.	Creează Structura pentru Cod Sursă:
○	Până acum, aveai doar folderul src/test/java/. Acum, vei crea structura standard Maven pentru codul sursă al aplicației:
○	src/main/java/com/yourname/homework/
○	(💡 Notă: Înlocuiește yourname cu același identificator pe care l-ai folosit și la src/test/java/).
3.	Scrie Codul Java (UsernameValidator.java):
○	În noul folder src/main/java/com/yourname/homework/, creează un fișier Java numit UsernameValidator.java.
○	În acest fișier, implementează logica "Validatorului de Username" folosind o metodă main.
○	Programul trebuie să ceară în mod repetat utilizatorului să introducă un username, până când acesta respectă toate regulile de mai jos.
4.	Reguli de Validare:
○	Lungimea: Trebuie să fie între 6 și 12 caractere, inclusiv.
○	Fără Spații: Nu trebuie să conțină spații. Dacă se introduce un username cu spații, programul trebuie să afișeze o eroare specifică și să ceară din nou input (fără a mai verifica celelalte reguli pentru inputul curent).
○	Cifre: Trebuie să conțină cel puțin o cifră (0-9).
5.	Indicații:
○	Folosește o buclă do-while pentru a repeta cererea de input.
○	Folosește o buclă for pentru a itera prin caracterele username-ului și a verifica regulile 2 și 3.
○	La final, când un username este corect, afișează mesajul: Username acceptat: [username-ul valid].
6.	**Exemplu de Rulare (Consolă)**:
Introdu un username: user
Eroare: Username-ul trebuie sa aiba intre 6 si 12 caractere.

Introdu un username: user nume
Eroare: Username-ul nu poate contine spatii.

Introdu un username: usernamevalid
Eroare: Username-ul trebuie sa contina cel putin o cifra.

Introdu un username: user123
Username acceptat: user123

- **Detalii Tehnice:**

- La fiecare push pe main, CI build compilează proiectul, rulează testele cu Java 23 și afișează rezultatul în badge-ul de build; dacă build-ul eșuează, logurile detaliate ale fiecărui pas pot fi vizualizate în GitHub Actions.
- **Flow-ul pipeline**

Push către main
          │
          ▼
GitHub Actions detectează event-ul
          │
          ▼
Job: build (runs-on: ubuntu-latest)
          │
          ▼
Step 1: Checkout repository
  - Codul tău de pe GitHub este clonat în runner
          │
          ▼
Step 2: Set up Temurin JDK 23
  - GitHub instalează Java 23 de la distribuția Temurin
  - `java -version` va confirma versiunea
          │
          ▼
Step 3: Build project with Maven
  - Maven compilează codul (`mvn clean install`)
  - Maven rulează testele din `src/test/java`
          │
          ▼
Step 4: Rezultatele pipeline-ului
  - Build successful → testele au trecut
  - Build failed → vezi logurile pentru erori
```
