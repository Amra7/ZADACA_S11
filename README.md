# ZADACA_S11
Zadaca Sedmica 11


Cilj je da napisete aplikaciju za odrzavanje knjizare.
Ispod je project podjeljen na neke manje dijelove.
 
1.1. Napravite klasu korisnik. svaki korisnik mora da ima Ime, 
Prezime i neku kontakt informaciju (mail || broj telefona), sifra.

1.2. Napravite klasu Uposlenik koja ima Ime, Prezime, sifru i kontakt informaciju. 
Uposlenik ce imati i neke dozvole koje korisnik nema.

1.3.  Napravite klasu Kupac koji ima Ime, Prezime, sifru i kontakt informaciju.
Osim toga ima spisak kupljenih knjiga.
Napomena:
Mozete ovo uraditi i sa jednom klasom Korisnik gdje cete imati neko boolean polje hasPrivilege, 
ali je bolja implementacija sa vise klasa, a usput vjezbate i polimorfizam.

2.1   Napravite klasu Knjiga, svaka knjiga treba da ima Autora, godinu izdavanja, Izdavaca, 
i ako je dio serijala knjigu koja je prethodi i sljedecu knjigu u serijalu. 
Tipa za Lord of The Rings: Two Towers, knjiga koja je prethodi je Lord of the Rings: Fellowship of the Ring, 
a knjiga koja je sljedeca bi bila Lord of the Rings: 
Return of the king, ali bi knjiga Rings: Fellowship of the Ring nema prethodnu knjigu, a sljedeca je Rings: Two Towers.

2.2   Napravite klasu Autor, klasa autor treba da ima Ime i Prezime,
kontakt informacije koje moze vidjeti samo Uposlenik, I spisak knjiga tog autora poredan po godini izdavanja knjige.

2.3   Napravite klasu Izdavac, izdavac ima Ime, kontakt informacije koje vidi samo 
Uposlenik i spisak knjiga tog izdavaca poredanih po godini izdavanja. 
Napomena
Opet, ovo je moguce uraditi na nekoliko nacina, ali bih vam preporucio da klasa knjiga bude comparable,
te da implementirate vise nacina sortiranja, tako cete olaksati ostatak ovog zadatka.

3.1   Napravite klasu Knjizara, knjizara ima uposlenike i ima kupce. Knjizara treba da ima spisak knjiga 
i mozete racunati da ce se knjige najcesce pretrazivati po imenu autora. Treba omoguciti dodavanje knjiga u knjizaru. Knjizara naravno moze i da proda knjigu pa je moguce da se broj kopija odredene knjige smanji ili da knjiga bude rasprodana. Knjige dodavati mogu samo uposlenici knjizare. Trebati omoguciti pretrazivanje knjiga po autoru, ali i po godini izdavanja, naslovu i izdavacu.

3.2   Kupcima treba omoguciti da kupe knjigu. Ako kupe knjigu ta knjiga treba da se doda na spisak
kupljenih knjiga. Ako odredena knjiga nije na stanju onda kupac treba da moze naruciti knjigu 
I kad se knjiga jednom pojavi na stanju kupci dobiju knjige po principu “ko prvi djevoci…”.


3.3   Kupci mogu traziti i da im program preporuci knjigu, preporuka knjige treba ici ovako: 
Ako je kupljena jedna knjiga iz serijala program treba da preporuci sljedecu I prethodnu knjigu
ukoliko one nisu procitane. Ako takvih knjiga nema onda treba da preporuci neku drugu knjigu od
autora kojeg je kupac najcesce citao. Ako ni takvih knjiga nema onda treba da preporuci knjigu 
izdavaca koji je izdao najvise knjiga koje je kupac citao.

4.1   Napisite program koji pokrece sve ovo, program nakon paljenja treba da trazi Ime I sifru I
ako takvo ime I sifra postoje treba da “prijavi” korisnka. Korisnik treba da ima opcije kako su 
prikazane iznad (iskoristite instanceof fazon). Imajte na umu da korisnik moze pretrazivati samo 
sa kljucnom rijeci a ne obavezno sa punim imenom knjige, autora i izdavaca. Tipa pretraga moze biti
“java”, gdje trebate vratiti sve knjige koje u nazivu sadrzavaju rijec “java”. Ako pretraga vrati
vise od jedne knjige omogucite korisniku da knjige sortira po imenu, autoru, izdavacu i godini 
izdavanja. Ako odredena knjiga nije na stanju pored imena knjige ispisite “Nije dostupno”. 
Ako kojim slucajem pretraga vrati samo jednu knjigu (korisnik je koristio puno ime), onda mu
predlozite jos neku knjigu. Uposlenik treba da moze dodati nove kupce.

5.1   Dodajte i GUI za ovu aplikaciju. Dizajn GUI-a je na vama ali bi trebao da omoguci sve sto
je bilo moguce sa konzolom, i mozda malo vise.

5.2   Ako ste stigli do ovog dijela: Saka cast! Do sad smo vjerovatno obradili I csv/xml/json pa 
iskoristite to da spremite stanje vase knjizare u file I da se na sljedecem pokretanju programa
to stanje ucita (koliko knjiga, ko su korisnici….)
