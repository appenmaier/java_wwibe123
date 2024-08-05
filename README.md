# Arbeiten mit diesem Repository

## Vorbereitungen

- Installiere ein [JDK](https://www.oracle.com/java/technologies/downloads/#jdk21-windows)
- Installiere [Eclipse](https://www.eclipse.org/), [BlueJ](https://www.bluej.org/index.html) oder eine andere IDE
- Installiere [Git](https://git-scm.com/downloads)

## Klone das remote Repository

- Starte die Kommandozeile (z.B. Windows PowerShell)
- Führe den Befehl `git clone https://github.com/appenmaier/java_wwibe123 "[Pfad/Der Name Deines lokalen Repositorys]"` aus, um das remote Repository zu klonen

## Binde das lokale Repository in Eclipse oder in BlueJ ein

### Option 1: Eclipse

- Starte Eclipse
- Führe die Funktion `File - Import... - General - Projects from Folder or Archive` aus und betätige die Drucktaste `Next >`
- Gib nachfolgende Informationen ein und betätige die Drucktaste `Finish`
  - Import source: `[Pfad/Der Name Deines lokalen Repositorys]`

### Option 2: BlueJ

- Starte BlueJ
- Führe die Funktion `Projekt - Fremdprojekt öffnen...` aus
- Navigiere zu `[Pfad/Der Name Deines lokalen Repositorys]` betätige die Drucktaste `Select Folder`

## Richte die Lombok User Library ein

- Lade die Datei [lombok.jar](https://projectlombok.org/) herunter
- Führe die Datei `lombok.jar` aus
- Betätige die Drucktaste `Install / Update`
- Betätige die Drucktaste `Quit Installer`
- Starte Eclipse
- Navigiere zu `Window – Preferences – Java – Build Path – User Libraries`
- Betätige die Drucktaste `New...`
- Gib beim Feld `User library name` den Wert `Lombok` ein und betätige die Drucktaste `OK`
- Wähle den Eintrag `Lombok` aus und betätige die Drucktaste `Add External JARs...`
- Wähle die .jar-Datei des Ordners `[Pfad zu Eclipse]/lombok.jar` aus und betätige die Drucktaste `Open` 
- Betätige die Drucktaste `Apply and Close`

## Binde die Lombok User Library in das Projekt ein

- Starte Eclipse
- Navigiere im Package Explorer zum Projekt `java_apps` und wähle dieses aus
- Navigiere zu `Project - Properties - Java Build Path` und wähle den Reiter `Libraries` aus
- Wähle die Option `Classpath` aus und betätige die Drucktaste `Add Library...`
- Wähle die Option `User Library` aus und betätige die Drucktaste `Next >`
- Wähle die Option `Lombok` aus und betätige die Drucktase `Finish`
- Betätige die Drucktaste `Apply and Close`

## Aktualisiere das lokale Repository

- Starte die Kommandozeile (z.B. Windows PowerShell)
- Führe den Befehl `cd "[Pfad/Der Name Deines lokalen Repositorys]"` aus, um zum Arbeitsbereich Deines lokalen Repositorys zu wechseln
- Führe den Befehl `git pull` aus, um den Arbeitsbereich zu aktualisieren
