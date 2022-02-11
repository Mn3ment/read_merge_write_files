Программа для слияния максимум 3 файлов, с дальнейшей сортировкой по возрастанию или убыванию и с записью в новый файл.


* Аргументы при запуске программы 

* -a --asc - сортировка по возрастанию(по умолчанию)
* -d --desc - сортировка по убыванию
* -i --integers - для числовых значений 
* -s --strings - для строковых значений
* -inp1 <arg> - имя первого входного файла
* -inp2 <arg> - имя второго входного файла
* -inp3 <arg> - имя третьего входного файла
* -otp <arg> - имя выходного файла

* Пример запуска команды после сборки:

java -jar mergeSort-0.1.jar -d -i -inp1 input.txt -inp2 input2.txt -otp out.txt

* использованы:
- Java v16.0.1
- Maven v4.0
- Apache Commons Cli v1.3.1

/ <dependency>
            <groupId>commons-cli</groupId>
            <artifactId>commons-cli</artifactId>
            <version>1.3.1</version>
</dependency>