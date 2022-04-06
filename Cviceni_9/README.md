# PC2T - Cvičení 9

1. Vytvořte třídu **Employee** , která bude obsahovat privátní atributy **nickname, email, password**
    (jako **char[]** typ) a atribut **employeeType** (samostatná třída (enum) EmployeeType), který bude
    jako enumerace (enum), která obsahuje 3 položky (ACTIVE, INACTIVE, DELETED).
2. Vytvořte třídy **Manager** (atributy: stejné jako Employee + atribut **listOfEmployees**
    (List<Employee> ...)) a **Secretarian** (atributy: stejné jako Employee + atribut **age** ),
3. Přidejte do třídy **Manager** další atribut, který bude generický s názvem **listOfRelationships**.
4. Vytvořte třídu **App** , ve které vytvořte metodu **main**. V této metodě vytvořte 5 instancí typu
    **Employee** , 1 instanci typu **Manager** a 2 instance typu **Secretarian**. Třídu **Manager** vytvořte
    genericky, tak aby jste do atributu **listOfRelationships** přidali jednu z výše vytvořených instancí
    **Secretarian**. Přidejte do instance typu **Manager** všech 5 zaměstnanců. Spusťe program a
    vypište všechny zaměstnance **Managera** a **Secretarian** s kterou má vztah.
5. Implementujte v metodě **Employee** možnost řazení zaměstnanců podle jejich emailu.
6. Vytvořte abstraktní třídu **AbstractAnimal** s jedinou abstraktní metodou sound() a atributem
    třídy s názvem **age** (bude typu byte). Dále vytvořte třídy **Cat** , **Dog** , **Pig, Cow, Goat**. Tyto třídy
    budou dědit z abstraktní třídy **AbstractAnimal** a budou přepisovat („@Override“) metodu
    sound(), tak že v těle metody bude výpis do konzole s příslušným zvukem daného zvířete. V již
    vytvořené třídě **App** vytvořte instance třídy **Cat, Dog, Pig, Cow, Goat** , tak aby typ této instance
    byl **AbstractAnimal**. Na těchto instancích zavolejte metodu sound().
7. Udělejte to stejné jako v bodě 6 s tím rozdílem, že vytvoříte místo AbstractAnimal třídu
    **Animal** , která bude interface a implementující třídy se budou jmenovat **CatImpl, DogImpl,**
    **PigImpl, CowImpl, GoatImpl** (všechny tyto třídy budou obsahovat atribut age) a přepíšou opět
    metodu sound() s výpisem do konzole. Opět doplňte v třídě App 5 instancí typu **Animal** a
    zavolejte metodu sound().
8. Implementujte ve všech datových třídách metodu toString() a implementujte možnost uložení
    instancí CatImpl, ... do souboru (stačí daný String představující zvuk)
9. Vysvětlete, kdy používat abstraktní třídu a kdy interface (napište do třídy App Java docs
    komentář nad třídu, kde toto stručně popíšete, rovněž zde doplňte @author tag s Vaším
    jménem.
10. Vysvětlete zde rovněž proč se používá v některých případech enumerace místo Stringu.
