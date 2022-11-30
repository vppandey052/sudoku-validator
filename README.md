Create a command line tool (running on jvm) for validating a standard 9x9 Sudoku puzzle:

Command line: validate.bat puzzleName.txt

File format: csv format each line representing a row e.g.:

```
1,2,3,4,5,6,7,8,9
1,2,3,4,5,6,7,8,9
1,2,3,4,5,6,7,8,9
1,2,3,4,5,6,7,8,9
1,2,3,4,5,6,7,8,9
1,2,3,4,5,6,7,8,9
1,2,3,4,5,6,7,8,9
1,2,3,4,5,6,7,8,9
1,2,3,4,5,6,7,8,9
```

The program should return 0 (VALID) or non-zero (INVALID) value with an error text on stdout (in case of
an invalid solution or file).

### INSTRUCTION


## to build 

mvn clean install 

## to generate report

mvn surefire-report:report

## to run

Please use validate.bat or validate.sh

