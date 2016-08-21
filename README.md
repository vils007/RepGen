# Генератор текстовых отчетов
## Постановка задачи
* à) îò÷åò äîëæåí áûòü ðàçáèò íà ñòðàíèöû îïðåäåë¸ííîé øèðèíû è âûñîòû
* á) ñòðàíèöû îòäåëÿþòñÿ äðóã îò äðóãà îòäåëüíîé ñòðîêîé ñîäåðæàùåé îäèí åäèíñòâåííûé ñèìâîë ~
* â) âûñîòà ñòðàíèöû íå âêëþ÷àåò ñåáÿ ðàçäåëèòåëü ñòðàíèö
* ã) çàãîëîâîê è äàííûå âíóòðè êîëîíêè äîëæíû áûòü âûðàâíåíû âëåâî
* ä) çàãîëîâêè è äàííûå â ñòðîêå îòäåëÿþòñÿ äðóã îò äðóãà ñèìâîëîì |
* å) ñëåâà è ñïðàâà îò çàãîëîâêà/çíà÷åíèÿ âñåãäà äîëæíî áûòü ïî îäíîìó ïðîáåëó
* ¸) øèðèíà êîëîíîê ôèêñèðîâàíà â ñèìâîëàõ
* æ) øèðèíà êîëîíîê íå âêëþ÷àåò â ñåáÿ ïðîáåëû ñëåâà è ñïðàâà îò çàãîëîâêà/çíà÷åíèÿ
* ç) äëÿ çàïîëíåíèÿ íåèñïîëüçîâàííîãî ìåñòà ñïðàâà äîáàâëÿþòñÿ ïðîáåëû
* è) çàãîëîâêè êîëîíîê äîëæíû áûòü ïîâòîðåíû íà êàæäîé ñòðàíèöå 
* é) ñòðîêè äàííûõ â îò÷åòå îòäåëÿþòñÿ äðóã îò äðóãà (è îò çàãîëîâêà) ñòðîêîé ñèìâîëîâ -
* ê) äëÿ ïåðåõîäà íà íîâóþ ñòðîêó äîëæåí èñïîëüçîâàòüñÿ ñèñòåìíûé ðàçäåëèòåëü ñòðîê
* ë) øèðèíà ñòðàíèöû íå âêëþ÷àåò â ñåáÿ ðàçäåëèòåëü ñòðîê 
* ì) åñëè çàãîëîâîê èëè çíà÷åíèå íå óìåùàåòñÿ â îòâåä¸ííîå ìåñòî, òî çíà÷åíèå äîëæíî áûòü ïðèíóäèòåëüíî ðàçáèòî
* í) ðàçáèåííèå äîëæíî ïðîèçâîäèòüñÿ ïî ãðàíèöå ñëîâ, åñëè ýòî âîçìîæíî
* î) åñëè ðàçáèåíèå ïî ãðàíèöå ñëîâ íåâîçìîæíî - òî ðàçáèâàòü ïðÿìî ïîñåðåäèíå ñëîâà
* ï) ãðàíèöåé ñëîâà ÿâëÿåòñÿ ëþáîé ñèìâîë êðîìå áóêâ è öèôð
* ð) íàñòðîéêè ïîäàþòñÿ â âèäå ÕÌË ôàéëà (ñì. ïðèìåð â settings.xml)
* ñ) äàííûå ïîäàþòñÿ â âèäå TAB-delimited ôàéëà â êîäèðîâêå UTF-16 (ñì. ïðèìåð â source-data.tsv)
* ò) ðåçóëüòàò äîëæåí áûòü çàïèñàí â ôàéë â êîäèðîâêå UTF-16
* ó) èñïîëüçîâàòü íóæíî ÿçûê Java
* ô) ðàçðåøàåòñÿ èñïîëüçîâàòü ëþáûå ãîòîâûå áèáëèîòåêè
* õ) âñå îñòàëüíûå íþàíñû, íå äåòàëèçèðîâàííûå âûøå, îñòàþòñÿ íà óñìîòðåíèå ðàçðàáîò÷èêà
* ö) âñå ðåøåíèÿ, ïðèíÿòûå ðàçðàáîò÷èêîì, äîëæíû áûòü îïèñàíû â ñîïðîâîäèòåëüíîé çàïèñêå
* ÷) ðàçðåøàåòñÿ ìåíÿòü ëþáîå òðåáîâàíèå
* ø) ëþáûå èçìåíåíèÿ ê òðåáîâàíèÿì äîëæíû áûòü îïèñàíû â ñîïðîâîäèòåëüíîé çàïèñêå

2) Îáðàçåö íàñòðîåê

```

Øèðèíà: 32
Âûñîòà: 12
Êîëîíêè:
- Íîìåð, 8 ñèìâîëîâ
- Äàòà, 7 ñèìâîëîâ
- ÔÈÎ, 7 ñèìâîëîâ
```

ñì. settings.xml

3) Îáðàçåö íàñòðîåê èñõîäíûõ äàííûõ

Âíèìàíèå, çäåñü äàííûå äàíû ñ êàâû÷êàìè è çàïÿòûìè. Â ôàéëå íåò êàâû÷åê è â êà÷åñòâå ðàçäåëèòåëåé èñïîëüçóåòñÿ òàáóëÿöèÿ!

```

 "1", "25/11", "Ïàâëîâ Äìèòðèé"
 "2", "26/11", "Ïàâëîâ Êîíñòàíòèí"
 "3", "27/11", "Í/Ä"
 "4", "28/11", "Êèì ×åí Èð"
 "5", "29/11/2009", "Þëèàííà-Îêñàíà Ñóõîâî-Êîáûëèíà"
```


## Çàïóñê ïðèëîæåíèÿ èç êîìàíäíîé ñòðîêè
ïðîåêò âûïîëíåí ñ èñïîëüçîâàíèåì maven 
```
git clone https://github.com/vils007/repgen.git
cd repgen
mvn clean package
java -jar target\RepGen-1.0-jar-with-dependencies.jar settings.xml source-data.tsv my-report.txt```



(íóæåí óñòàíîâëåííûé maven è java)

Ðåçóëüòàò âûïîëíåíèÿ 
```

C:\workspacests\repGen01> mvn clean package
[INFO] Scanning for projects...
[WARNING]
[WARNING] Some problems were encountered while building the effective model for
com.texuna:RepGen:jar:1.0
[WARNING] 'build.plugins.plugin.(groupId:artifactId)' must be unique but found d
uplicate declaration of plugin org.apache.maven.plugins:maven-assembly-plugin @
line 59, column 12
[WARNING]
[WARNING] It is highly recommended to fix these problems because they threaten t
he stability of your build.
[WARNING]
[WARNING] For this reason, future Maven versions might no longer support buildin
g such malformed projects.
[WARNING]
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building Report 1.0
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ RepGen ---
[INFO] Deleting C:\workspacests\repGen01\target
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ RepGen ---

[WARNING] Using platform encoding (Cp1251 actually) to copy filtered resources,
i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory C:\workspacests\repGen01\src\main\res
ources
[INFO]
[INFO] --- maven-compiler-plugin:2.3.2:compile (default-compile) @ RepGen ---
[INFO] Compiling 9 source files to C:\workspacests\repGen01\target\classes
[INFO]
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ Re
pGen ---
[WARNING] Using platform encoding (Cp1251 actually) to copy filtered resources,
i.e. build is platform dependent!
[INFO] Copying 15 resources
[INFO]
[INFO] --- maven-compiler-plugin:2.3.2:testCompile (default-testCompile) @ RepGe
n ---
[INFO] Compiling 2 source files to C:\workspacests\repGen01\target\test-classes
[INFO]
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ RepGen ---
[INFO] Surefire report directory: C:\workspacests\repGen01\target\surefire-repor
ts

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.texuna.TestPrint
test00
test01
test02
test03
test04
test05
test06
test07
test08
test09
test10
testConfig
Tests run: 12, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.388 sec
Running com.texuna.TestPrintLong
testLong
Test Config Long
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.003 sec

Results :

Tests run: 14, Failures: 0, Errors: 0, Skipped: 0

[INFO]
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ RepGen ---
[INFO] Building jar: C:\workspacests\repGen01\target\RepGen-1.0.jar
[INFO]
[INFO] --- maven-assembly-plugin:2.2-beta-5:single (default) @ RepGen ---
[INFO] META-INF/ already added, skipping
[INFO] META-INF/MANIFEST.MF already added, skipping
[INFO] META-INF/maven/ already added, skipping
[INFO] Building jar: C:\workspacests\repGen01\target\RepGen-1.0-jar-with-depende
ncies.jar
[INFO] META-INF/ already added, skipping
[INFO] META-INF/MANIFEST.MF already added, skipping
[INFO] META-INF/maven/ already added, skipping
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 15.224 s
[INFO] Finished at: 2016-08-21T22:20:01+03:00
[INFO] Final Memory: 21M/115M
[INFO] ------------------------------------------------------------------------

C:\workspacests\repGen01>java -jar target\RepGen-1.0-jar-with-dependencies.jar s
ettings.xml source-data.tsv my-report.txt

```


##Òåõíîëîãèè
* **java se 8**
* **maven**
* **javax** 

