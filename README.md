# ��������� ��������� �������
## ���������� ������
* �) ����� ������ ���� ������ �� �������� ����������� ������ � ������
* �) �������� ���������� ���� �� ����� ��������� ������� ���������� ���� ������������ ������ ~
* �) ������ �������� �� �������� ���� ����������� �������
* �) ��������� � ������ ������ ������� ������ ���� ��������� �����
* �) ��������� � ������ � ������ ���������� ���� �� ����� �������� |
* �) ����� � ������ �� ���������/�������� ������ ������ ���� �� ������ �������
* �) ������ ������� ����������� � ��������
* �) ������ ������� �� �������� � ���� ������� ����� � ������ �� ���������/��������
* �) ��� ���������� ����������������� ����� ������ ����������� �������
* �) ��������� ������� ������ ���� ��������� �� ������ �������� 
* �) ������ ������ � ������ ���������� ���� �� ����� (� �� ���������) ������� �������� -
* �) ��� �������� �� ����� ������ ������ �������������� ��������� ����������� �����
* �) ������ �������� �� �������� � ���� ����������� ����� 
* �) ���� ��������� ��� �������� �� ��������� � ��������� �����, �� �������� ������ ���� ������������� �������
* �) ���������� ������ ������������� �� ������� ����, ���� ��� ��������
* �) ���� ��������� �� ������� ���� ���������� - �� ��������� ����� ���������� �����
* �) �������� ����� �������� ����� ������ ����� ���� � ����
* �) ��������� �������� � ���� ��� ����� (��. ������ � settings.xml)
* �) ������ �������� � ���� TAB-delimited ����� � ��������� UTF-16 (��. ������ � source-data.tsv)
* �) ��������� ������ ���� ������� � ���� � ��������� UTF-16
* �) ������������ ����� ���� Java
* �) ����������� ������������ ����� ������� ����������
* �) ��� ��������� ������, �� ���������������� ����, �������� �� ���������� ������������
* �) ��� �������, �������� �������������, ������ ���� ������� � ���������������� �������
* �) ����������� ������ ����� ����������
* �) ����� ��������� � ����������� ������ ���� ������� � ���������������� �������

2) ������� ��������

```

������: 32
������: 12
�������:
- �����, 8 ��������
- ����, 7 ��������
- ���, 7 ��������
```

��. settings.xml

3) ������� �������� �������� ������

��������, ����� ������ ���� � ��������� � ��������. � ����� ��� ������� � � �������� ������������ ������������ ���������!

```

 "1", "25/11", "������ �������"
 "2", "26/11", "������ ����������"
 "3", "27/11", "�/�"
 "4", "28/11", "��� ��� ��"
 "5", "29/11/2009", "�������-������ ������-��������"
```


## ������ ���������� �� ��������� ������
������ �������� � �������������� maven 
```
git clone https://github.com/vils007/repgen.git
cd repgen
mvn clean package
java -jar target\RepGen-1.0-jar-with-dependencies.jar settings.xml source-data.tsv my-report.txt```



(����� ������������� maven � java)

��������� ���������� 
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


##����������
* **java se 8**
* **maven**
* **javax** 

