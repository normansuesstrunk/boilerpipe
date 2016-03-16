# Notizen zu Boilerpipe

**Project Website: https://github.com/kohlschutter/boilerpipe**

Ich habe das Projekt geforked, jetzt verfügbar unter https://github.com/normansuesstrunk/boilerpipe.git

## Forks:

Gregors: https://github.com/gregors/boilerpipe/commits/master
Seems like he made alot of improvements.


# Testen Textextract aus ausgewählten Seiten

## watson.ch

### Startseite

Ausgabe:

```
Wie wird dein Leben in zehn Jahren aussehen?
2
Super Tuesday: Clinton gewinnt alle fünf Bundesstaaten + Trump vier + Rubio wirft …
3
Wie die fette Katze aus Kloten abmagern und gesunden kann
4
Die coolste Bar von Zürich laut der «New York Times»? Darauf kommt ihr nie, nie, nie!
5
Vorher vs. nachher: Ohne Special Effects sehen diese Filmszenen ganz schön …
Meistkommentiert
Conte hört als Italiens Natitrainer auf +++ Neuer Bayern-Trainer Ancelotti scharf …
2
Nach AfD-Wahlerfolg: Hier sitzen die Rechtspopulisten Europas
3
Die AfD und ihr «Vorbild» SVP – ketzerische Gedanken zum Polit-Erdbeben in …
4
Das Geheim-Papier: So schreiben Lobbyisten vor, was wir zu denken haben
5
Rassen-Diskriminierung: SVP auch vor Obergericht wegen «Schlitzer-Inserat» verurteilt
Meistgeteilt
Wortspielsport!​ Hochintelligente Wortspiele – ultraprofessionell illustriert
2
Die Überraschung ist perfekt: Aussenseiter Ajoie eliminiert Olten und steht im …
3
Werbung fürs «Bedingungslose Grundeinkommen» – am Zürcher HB gab's echte …
4
1000 Berner Kiffer im Glück: Sie bekommen ihr Gras bald in der Apotheke
5
```

Es wird einiges rausgefiltert, die grossen Teaser fehlen eigentlich komplett




Problem bei Watso
n: Wird ein Artikel aufgerufen, kommt an Ende des Artikels bereits der nächste.
 http://www.watson.ch/International/Syrien/774288644-5-Jahre-Krieg-in-Syrien--Die-Folgen-in-9-ersch%C3%BCtternden-Zahlen
Danach kommt bereits der Artikel "Spielball der Mächte: Weshalb der Syrien-Konflikt..." Test mit Boilerpipe ergibt, dass nur der gewollte Artikel ausgelesen wird.

## srf.ch

### Einzelartikel

http://www.srf.ch/news/schweiz/vier-maenner-aus-der-schweiz-in-den-personalunterlagen-des-is

Ausgabe:

```
Vier Männer aus der Schweiz in den Personalunterlagen des IS
Heute, 14:59 Uhr
4 Kommentare
In den internen Dokumenten der Terrormiliz «Islamischer Staat» (IS), die kürzlich öffentlich wurden, finden sich mindestens vier Personen mit Bezügen zur Schweiz. Die Befragungsbögen liegen der Redaktion von «10vor10» und dem Tages-Anzeiger vor und geben Einblick in die Rekrutierung von Schweizern.
Bild in Lightbox öffnen.
Bildlegende: In den IS-internen Personalunterlagen sind mindestens vier Schweizer aufgeführt, die sich der Miliz angeschlossen haben. SRF
Vier Männer, die in der Schweiz gelebt haben, tauchen in den Dokumenten auf, die der Terrormiliz «Islamischer Staat» abhandengekommen sind. Der Verlust der Daten, die als «geheim» eingestuft sind und offenbar von der «General-Grenzverwaltung» erstellt worden sind, ist vergangene Woche bekannt geworden. Die Unterlagen scheinen aus Befragungen des IS zu stammen, die die Terrormiliz mit Bewerbern durchführte.
Dschihadreisende
39
unbekannt
Wie die SRF-Sendung «10vor10» und der Tages-Anzeiger nun berichten, sind im Fundus von über 20'000 Dokumenten zumindest vier Personen aus der Schweiz zu finden.
Dschihadist gab Telefonnummer seiner Eltern an
Die nun in den Unterlagen entdeckten Schweizer wurden zwischen August 2013 und März 2014 befragt. Einer der Schweizer ist heute 32 Jahre alt, er war vor seiner Reise zum IS nach Syrien im Wallis wohnhaft. Er gab in der Befragung an, als Sanitäter und Fotograf gearbeitet zu haben. Als Kontakt nannte der Schweizer Bürger eine Telefonnummer mit Schweizer Vorwahl.
Die Überprüfung der Nummer durch «10vor10» ergab, dass sie korrekt ist und seinen Eltern gehört. Der Mann war via die Türkei nach Syrien eingereist und meldete sich beim IS als Kämpfer. Der Mann ist inzwischen in die Schweiz zurückgekehrt und wurde von der Bundesanwaltschaft per Strafbefehl zu 600 Stunden gemeinnütziger Arbeit verurteilt, begleitet von einer Psychotherapie.
Mehr zum Thema sehen Sie heute Abend um 21:50 Uhr in der Sendung «10vor10» auf SRF1.
Eine Person ist zurückgekehrt
Auch die zweite Person stammt aus der Westschweiz, der Mann ist heute 25 Jahre alt, auch er ist Schweizer Bürger. Seine religiösen Kenntnisse werden im Personalbogen als «niedrig» bezeichnet. Der Mann gab an, er habe zuvor für eine andere Gruppe gekämpft, nTesten der ämlich den syrischen Al Kaida-Ableger «Jabhat al Nusra».
Der dritte Mann stammt ursprünglich aus Ägypten. In seinem Personalbogen des IS heisst es, er sei 45 Jahre alt, sei ledig und habe ein Kind. Als Wohnort hat er eine Gemeinde am Genfer See angegeben. Er meldete sich als Kämpfer.
Bei der vierten Person handelt es sich um einen Mann aus Marokko, er ist gemäss IS-Dokument 39 Jahre alt, verheiratet und hat zwei Kinder. Auch er wollte beim IS Kämpfer werden. Gemäss Unterlagen lebte er elf Monate in der Schweiz. Über seinen Wohnort in der Schweiz ist nichts bekannt.
Einer der vier Männer ist nachweislich in die Schweiz zurückgekehrt, die anderen drei dürften sich noch im Kriegsgebiet befinden, allerdings ist ihr Verbleib offen.
Terrorismus-Forscher Vidino: «IS ist in militärischem Denken verhaftet»
Warum der IS über seine Mitglieder so detaillierte Akten anlegt, liegt für Terrorismus-Forscher Lorenzo G. Vidino auf der Hand. Er sagt gegenüber: «Der IS ist eine riesige Organisation. Sie haben Zehntausende von Rekruten. Deshalb sind sie gezwungen, eine Struktur zu schaffen und eine Bürokratie zu betreiben. Viele der Anführer des IS sind ehemalige Angehörige der irakischen Armee. Sie sind in militärischem Denken verhaftet und sind davon überzeugt, dass sie alles gut organisieren müssen, um selbst den Überblick behalten zu können.»
Vidino ist Programmdirektor für Extremismus an der George Washington University in den USA. Für die ETH hat Vidino Ende 2013 eine der ersten Studien verfasst über «dschihadistische Radikalisierung» in der Schweiz.
Akribischer Fragebogen: Blutgruppe? Selbstmordattentäter?
Die Fragebögen sind stets nach dem gleichen Muster aufgebaut, es werden 23 Fragen gestellt: Bürgerliche Name, Kampfname, bisheriger Wohnort, Blutgruppe, und auch Angaben zu Schleusern, die bei der Einreise geholfen haben. Dann mussten die IS-Freiwilligen auch einen Bürgen angeben, also eine Art Referenz-Person wie bei einer Stellenbewerbung. Zudem konnten die Einreisenden angeben, wo sie im IS tätig werden möchten: Ob als Kämpfer, in der Scharia-Justiz, dem Geheimdienst oder in der Verwaltung.
Bei einem gewünschten Einsatz als Kämpfer wurde zudem gefragt, ob man als gewöhnlicher Soldat dienen möchte oder sich Spezialkräften für besonders riskante Einsätze anschliessen will. Es bestand auch die Möglichkeit, Selbstmordattentäter zu werden. Wie weit der IS diesen Wünschen nachgekommen ist, ist aus den Dokumenten nicht ersichtlich.
«Der Beweis, dass der IS seine Geheimnisse nicht schützen kann»
An die Personalbögen des IS gelangt sind Journalisten der Rechercheverbunds von NDR, WDR und der Süddeutschen Zeitung. Einer der Beteiligten ist der Berliner Journalist Georg Heil vom WDR.
Anfangs sei man gegenüber den Unterlagen natürlich skeptisch gewesen, sagt Heil gegenüber «10vor10»: «Doch in den Unterlagen gibt es unzählige biographische Details, die sich überprüfen lassen: Namen, Adressen, Telefonnummern, Namen von Angehörigen etc. Und überall, wo wir diese Daten überprüft haben, haben sie einer Überprüfung standgehalten.»
Unterlagen sind strafrechtlich relevant
Recherche-Journalist Heil geht davon aus, dass die aufgetauchten Unterlagen für darin genannte IS-Anhänger auch strafrechtliche Konsequenzen haben dürften.
«Diese Unterlagen sind der Beweis dafür, dass der IS seine Geheimnisse nicht schützen kann. Das ist gut für die Strafverfolger. Anhänger, die bisher noch nicht auf Radar der Behörden waren, müssen nun damit rechnen, dass ihnen bei einer Rückkehr strafrechtliche Konsequenzen drohen.»

```

Feststellungen:

* Gutes Removal der Titel, Artikelteasers rechts etc.
* Tabelle wird nicht gut erkannt


## Blick.ch

### Startseite

* Es werden zuerst "Bilder des Tages" ausgelesen, obwohl die weit unten kommen.
* Die grossen Bilder-Teaser am Anfang werden nicht erkannt, ist aber bei Bildern auch nicht weiter verwunderlich

### Einzelartikel

http://www.blick.ch/news/politik/korb-fuer-unternehmer-an-der-cebit-merkel-verschmaeht-schweizer-geschenk-id4808073.html

Gibt unter anderem folgendes aus:

```
Abonniere den Newsletter
Immer informiert - Abonnieren Sie den Blick Newsletter!
Bitte geben Sie eine gültige E-Mail-Adresse ein.
Schön, dass wir Ihnen unsere BLICK News des Tages senden dürfen. Möchten Sie zusätzlich den BLICK Sport Newsletter erhalten?
Ja, gerne
Bitte geben Sie eine gültige E-Mail-Adresse ein.
Top 3
Melden
```

* Ein Kommentar wird auch noch ausgegeben
* Der Rest wird aber gut gefiltert

## Bote.at

### Startseite

* Probleme mit Umlauten
* Probleme mit Frames (siehe Ausgabe)

```
Bayern M�nchen geht mit einer guten Ausgangslage ins Achtelfinal-R�ckspiel der Champions League. Bereits ein 0:0 daheim w�rde nach dem 2:2 im Hinspiel zum Weiterkommen gegen Juventus Turin reichen.
Liveticker-Programm
Ihr Browser kann leider keine eingebetteten Frames anzeigen:   Sie können die eingebettete Seite über den folgenden Verweis     aufrufen: Liveticker Programm
Regiofussball Ticker
```

### Einzelartikel

http://www.bote.ch/nachrichten/zentralschweiz/ur/uri/Kanton-Uri-wirtschaftet-erfolgreicher-als-vorgesehen;art97,700653

* Soweit sehr gut, es wird nur der relevante Text
* Probleme mit den Umlauten

```
Kanton Uri wirtschaftet erfolgreicher als vorgesehen
Das Bild passt zu den Kantonsfinanzen: Hoch fliegende Urner Fahne. (Archiv / Neue UZ)
FINANZEN ⋅ 21 Millionen Franken Mehrertrag resultieren aus der Jahresrechnung des Kantons Uri � deutlich mehr als budgetiert. Bei r�ckl�ufigen Investitionen ist der Selbstfinanzierungsgrad deutlich gestiegen.
0 Kommentare - Schreiben Sie den ersten
Das Ergebnis der Erfolgsrechnung 2015 liegt mit einem Ertrags�berschuss von 21,1 Millionen Franken um 16,6 Millionen Franken �ber dem Budget. Diese positive Abweichung setzt sich aus Mehrertr�gen von 10,4 Millionen Franken und Minderaufwendungen von 6,2 Millionen Franken zusammen, die Urner Regierung in einer Mitteilung schreibt.
Mehr Ertrag, weniger Aufwand
Der Aufwand in der Kantonsrechnung 2015 betr�gt 392,9 Millionen Franken. Das sind 6,2 Millionen oder 1,6 Prozent weniger als budgetiert. Die wesentlichen Abweichungen sind Minderausgaben bei den Erg�nzungsleistungen AHV/IV (minus 1.2 Mio.), bei der Umsetzung der Neuen Regionalpolitik  (minus 1.1 Mio.) oder bei der Wirtschafts-, Regional- und Tourismusentwicklung (minus 1.0 Mio.). Mehr ausgegeben hat der Kanton haupts�chlich f�r den Kantonsanteil an innerkantonalen Spitalbehandlungen (plus 1.1 Mio.), beim Beitrag an das Kantonsspital Uri (plus 0.7 Mio.) und bei der R�ckstellung f�r Ruhegeh�lter der Regierungsr�te (plus 0.8 Mio.)
Auf der Ertragsseite stehen 414 Millionen Franken, 10,4 Millionen Franken oder 2,6 Prozent mehr als budgetiert. Dazu beigetragen haben im Wesentlichen Mehreinnahmen bei den Kantonssteuern der nat�rlichen Personen (plus 3.6 Mio.) und der juristische Personen (plus 0.5 Mio.),  dank dem Anteil am Ertrag der Schweizerische Nationalbank (plus 2.9 Mio.) und wegen der �berf�hrung freier Mittel an das Amt f�r Betrieb der Nationalstrassen (plus 1.5 Mio.). Weniger Einnahmen gab es haupts�chlich bei den Wasserzinsen und Entsch�digungen (minus 1.4 Mio.), bei den Erbschafts- und Schenkungssteuern (minus 0.4 Mio.) und wegen Bussen und Geldstrafen der Staatsanwalt (minus 0.5 Mio.)
Weniger Investitionen
Die Nettoinvestitionen sind mit 22,3 Millionen Franken um 2,5 Millionen Franken tiefer ausgefallen als budgetiert. Dabei betragen die Bruttoinvestitionen 36,7 Millionen Franken und liegen damit um 23,2 Millionen Franken unter dem Budget. Der Selbstfinanzierungsgrad von 166.3 Prozent liegt damit deutlich �ber dem Budgetwert von 78.2 Prozent.
(ur.ch)

```

## diepresse.com

### Frontseite

Ausgabe:
```
„Millionenshow“-Quiz: Würden Sie die Million holen?
Quiz Armin Assinger stellte wieder die „Millionenfrage“: Kandidatin Riki Rittberg beantwortete in der Show 14 Fragen richtig. Bei der letzten Frage war ihr das Risiko aber zu hoch. Sie ging mit 300.000 Euro nach Hause. Können Sie alle Fragen richtig beantworten?
```
Das ist nur der Text von einem Teaser. Das ist jedoch nur der Bruchteil der Startseite.


### Einzelseite

http://diepresse.com/home/politik/aussenpolitik/4947132/USStudent-in-Nordkorea-zu-15-Jahren-Arbeitslager-verurteilt?_vl_backlink=/home/index.do

Ausgabe:
```
US-Student in Nordkorea zu 15 Jahren Arbeitslager verurteilt
US-Student Otto Frederick Warmbier bei einer Verhandlung im Februar 2016. / Bild: (c) AFP (KCNA) 
Der 21-Jährige soll den Diebstahl von Propagandamaterial zugegeben haben. Er wurde wegen "feindlicher Aktivitäten" verurteilt.
16.03.2016 | 06:32 | 
 (DiePresse.com)
Ein wegen "feindlicher Aktivitäten" in Nordkorea festgenommener US-Student ist zu 15 Jahren Arbeitslager verurteilt worden. Dies habe der Oberste Gerichtshof Nordkoreas entschieden, meldete die chinesische Nachrichtenagentur Xinhua am Mittwoch. Der 21-jährige Otto Frederick Warmbier von der Universität Virginia hatte sich nach nordkoreanischen Angaben zum Diebstahl von Propagandamaterial bekannt.
Laut nordkoreanischen Staatsmedien gab Warmbier zu, eine politische Botschaft aus einem Mitarbeiterbereich seines Hotels in Pjöngjang entwendet zu haben. Demnach hatte ihn die Mutter eines Freunds, eine Methodistin, um "eine Trophäe" gebeten. Sie habe ihm ein Auto im Wert von 10.000 Dollar (gut 9.000 Euro) oder für den Fall seiner Festnahme 200.000 Dollar für seine Familie versprochen.
"Unter Anleitung der US-Regierung gehandelt"
Der junge Mann war den nordkoreanischen Angaben zufolge mit einem Touristenvisum eingereist, um die "Fundamente der Einheit" des Landes zu erschüttern. Dabei habe der Student "unter der Anleitung der US-Regierung" gehandelt.
In Nordkorea wurden in den vergangenen Jahren wiederholt Ausländer festgenommen, zu langjährigen Haftstrafen verurteilt und dann nach Gegenleistungen ausländischer Regierungen freigelassen. Häufig versucht Pjöngjang, die Gefangenen als Faustpfand in Verhandlungen einzusetzen.
(APA/AFP)
```

Soweit sehr gut



# Boilerpipe

Im Package com.kohlschuetter.boilerpipe.filters sind alle Extraktoren drin



## Installation

### Maven 3
Das Projekt benötigt Maven 3 -> ich installieren das gemäss folgender Anleitung: http://stackoverflow.com/questions/15630055/how-to-install-maven-3-on-ubuntu-15-10-15-04-14-10-14-04-lts-13-10-13-04-12-10-1

Eintragen des Repos:

```
sudo -H gedit /etc/apt/sources.list
```
Folgende Zeilen eintragen:
```
deb http://ppa.launchpad.net/natecarlson/maven3/ubuntu precise main
deb-src http://ppa.launchpad.net/natecarlson/maven3/ubuntu precise main
```
Maven 3 innstallieren

```
sudo apt-get update && sudo apt-get install maven3
```
Symlink machen:
```
sudo ln -s /usr/share/maven3/bin/mvn /usr/bin/mvn3
```
