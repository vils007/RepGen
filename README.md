# Генератор текстовых отчетов
## Постановка задачи
* а) отчет должен быть разбит на страницы определённой ширины и высоты
* б) страницы отделяются друг от друга отдельной строкой содержащей один единственный символ ~
* в) высота страницы не включает себя разделитель страниц
* г) заголовок и данные внутри колонки должны быть выравнены влево
* д) заголовки и данные в строке отделяются друг от друга символом |
* е) слева и справа от заголовка/значения всегда должно быть по одному пробелу
* ё) ширина колонок фиксирована в символах
* ж) ширина колонок не включает в себя пробелы слева и справа от заголовка/значения
* з) для заполнения неиспользованного места справа добавляются пробелы
* и) заголовки колонок должны быть повторены на каждой странице 
* й) строки данных в отчете отделяются друг от друга (и от заголовка) строкой символов -
* к) для перехода на новую строку должен использоваться системный разделитель строк
* л) ширина страницы не включает в себя разделитель строк 
* м) если заголовок или значение не умещается в отведённое место, то значение должно быть принудительно разбито
* н) разбиенние должно производиться по границе слов, если это возможно
* о) если разбиение по границе слов невозможно - то разбивать прямо посередине слова
* п) границей слова является любой символ кроме букв и цифр
* р) настройки подаются в виде ХМЛ файла (см. пример в settings.xml)
* с) данные подаются в виде TAB-delimited файла в кодировке UTF-16 (см. пример в source-data.tsv)
* т) результат должен быть записан в файл в кодировке UTF-16
* у) использовать нужно язык Java
* ф) разрешается использовать любые готовые библиотеки
* х) все остальные нюансы, не детализированные выше, остаются на усмотрение разработчика
* ц) все решения, принятые разработчиком, должны быть описаны в сопроводительной записке
* ч) разрешается менять любое требование
* ш) любые изменения к требованиям должны быть описаны в сопроводительной записке

2) Образец настроек

```

Ширина: 32
Высота: 12
Колонки:
- Номер, 8 символов
- Дата, 7 символов
- ФИО, 7 символов
```

см. settings.xml

3) Образец настроек исходных данных

Внимание, здесь данные даны с кавычками и запятыми. В файле нет кавычек и в качестве разделителей используется табуляция!

```

 "1", "25/11", "Павлов Дмитрий"
 "2", "26/11", "Павлов Константин"
 "3", "27/11", "Н/Д"
 "4", "28/11", "Ким Чен Ир"
 "5", "29/11/2009", "Юлианна-Оксана Сухово-Кобылина"
```


## Запуск приложения из командной строки
проект выполнен с использованием maven 
```
git clone https://github.com/vils007/repgen.git
cd repgen
mvn clean package
java -jar target\RepGen-1.0-jar-with-dependencies.jar settings.xml source-data.tsv my-report.txt```
```
(нужен установленный maven и java)

##Технологии
* **java se 8**
* **maven**
* **javax** 



