1. Vytvořte abstraktní třídu Zboží, která bude obsahovat následující:

   1. Název zboží (datový typ String), cenu bez dph (reálné číslo) a statickou proměnnou DPH=21%
   2. Konstruktor, pomocí kterého lze zadat název a cenu zboží (bez dph)
   3. Gettery a Settery pro jednotlivé proměnné, přičemž getter pro parametr cena vrací cenu včetně dph
   4. Abstraktní metodu getJednotka neobsahující žádný formální parametr a vracející datový typ String

2. Dále vytvořte třídu Potravina, která je potomkem třídy Zboží a tuto třídu rozšiřuje o:

    1. Parametr trvanlivosti (celá čísla)
    2. Kontruktor, pomocí, kterého lze trvanlivost zadat
    3. Getter a Setter pro parametr trvanlivosti
    4. Implementaci metody getJednotka, která bude vracet textový řetězec „dnů“

3. Dále vytvořte třídu Nářadí, která je potomkem třídy Zboží a tuto třídu rozšiřuje o:

    1. Parametr záruční doby (celá čísla)
    2. Kontruktor, pomocí, kterého lze záruční dobu zadat
    3. Getter a Setter pro parametr záruky
    4. Implementaci metody getJednotka, která bude vracet textový řetězec „měsíců“

4. Nakonec vytvořte třídu Test, která bude obsahovat metodu main, ve které:

    1. Vytvořte pole objektů Zboží o velikost 4 a naplňte je zbožím s následujícími parametry:
        - Potravina, název: Rohlík, cena: 1,5, trvanlivost: 1
        - Nářadí, název: Kleště, cena: 278,0, záruka: 24
        - Potravina, název: Chleba, cena:20,8, trvanlivost: 6
        - Potravina, název: Jablko, cena: 51,0, trvanlivost: 20

    2. Pomocí for cyklu vypište pro jednotlivé položky pole jejich název a cenu. V případě potravin vypište i trvanlivost včetně jednotky.
        - Rohlík, cena: 1,815, trvanlivost: 1 dnů
        - Kleště, cena: 278,38
        - Chleba, cena: 20,168, trvanlivost: 6 dnů
        - Jablko, cena: 61,71, trvanlivost: 20 dnů 
