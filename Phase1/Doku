# Web-basierte Anwendungen 2

## Dokumentation Phase 1

### Author: Patrick Reimringer

## Aufgabe 1

### Wohlgeformt:

Wohlgeformt ist ein XML-Dokument dann, wenn es den Regeln von Xml entspricht. 
* Das bedeutet zu Beginn des XML-Dokuments steht eine XML-Deklaration 
(z.B. <?xml version="1.0"?>)
* Es muss ein Root-Element vorhanden sein, welches alle anderen Elemente umschließt.
* Jedes Element das geöffnet wurde muss auch wieder geschlossen werden.

### Validität:

* Valide ist ein XML-Dokument dann, wenn es wohlgeformt ist und ein zugehörige Dokument Type Definition (DTD) besitzt. Diese definiert die Regeln und die  Struktur der erlaubten Tags. 

### Namespace:

* Dient zur eindeutigen identifizierung eines XML-Dokuments.
Dies ist zum Beispiel nützlich, wenn man in einem XML-Dokument mehrere XML-Schemas verwendet. 

## Aufgabe 2

* Siehe Aufgabe2.xml und Aufgabe 2.json
* Das Dokument erfasst alle Daten des Formulars und ist mit einen Beispieldatensatz gefüllt.  
* Der Gruppenleiter wird mit den Tag „Leiter“ im Element Formular dargestellt. 
* „Formular“ kann mehrere „Personen“ aber nur einen Leiter beinhalten und dies muss im DTD eindeutig festgelegt werden. 
* Die Elemente „Vorname“, „Nachname“, „Email“, „GDatum“, „Erfahrung“, „Schlagzeug“ enthalten sowohl „Person“ als auch „Leiter“ nur das dieser auch das Element „Anmerkung“ besitzt.  

## Aufgabe 3
#### a)

* Siehe Aufgabe3.xml

#### b)

* Die Struktur bei allen Rezepten ist gleich, es unterscheidet sich nur im Inhalt, wie z.B. Variation der Zutaten, Anzahl der Kommentare 
* Es gibt eine Überschrift und Bilder, eine Zutatenliste, eine Anleitung und Kommentare. Die Unterschiede liegen in der Anzahl der Daten, den es gibt unterschiedlich viele Zutaten, Bilder und Kommentare. 

#### c)

* Für die Erstellung des XML-Schemas habe ich mir die Anforderungen des Rezeptes genau angeschaut. Ich habe mir Regeln überlegt welche das XML-Dokument einhalten muss und habe nach diesen Regeln mein Schema erstellt. 
z.B gibt es mehrere unterschiedliche Zutaten welche von der Bezeichnung her offen sein können, aber die Einheit der Zutat ist eine bestimmte. Um diese Regel umzusetzen habe ich eine Enumeration angelegt, welche die Einheiten beinhalten. So kann ein XML-Dokument mit diesem Schema nur Einheiten aus diesem Enum enthalten.
Für alle SimpleType Elemente habe ich einen Typ vergeben, damit die Daten in dem XML-Dokument möglichst Korrekt sind. So kann z.B die Arbeitszeit keinen String enthalten sondern nur einen Integer.

Welche Daten müssen in simple und welche in complex-types abgebildet werden? 
* Elemente welche andere Elemente beinhalten wie z.B. „Chefkoch“, „Rezept“, „info“, „Zutatenliste“, „Zutat“, „Zubereitung“ und „Kommentare“ sind ComplexType.
* Elemente welche Daten enthalten sind SimpleType.

Für welche Daten ist die Abbildung in Attributen sinnvoller?
* Für Daten die eindeutig identifiziert werden sollen ist es sinnvoller, wie z.B. in unserem fall  „Rezept“ für das ein Attribut „id“ Vorgesehen ist. 

Welche Datentypen müssen für die Elemente defniert werden?
* Verschiedene Elemente werden durch Eindeutige Datentypen definiert, wie z.B. Bild-Elemente haben den Datentyp „anyURI“, Zahlen haben den Datentypen „integer“ und alle anderen Elemente haben den Datentypen „string“.

Welche Restriktionen müssen definiert werden?
* Es müssen IDs vorhanden sein und zum es muss mindestens eine Zutat und einen Zubereitungsschritt geben.

## Aufgabe 4

* Siehe Src Ordner

## Aufgabe 5

* JSON und XML erlaubt die Strukturiete speicherung von Daten in gewöhnliche Daten und ist von Menschen als auch vom Computer lesbar.
* XML kann von eineem Schema kontrolliert werden im gegensatz zu JSON.
* JSON und XML sind sehr gut zum schnellen und einfachen Austausch von strukturierten Daten geeignet.
