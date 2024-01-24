@echo off
:LOOP
java -jar "D:\WorkSpace\work\Application\CognicxContactCenter\target\CognicxContactCenter.jar"
timeout /t 30 /nobreak >nul
goto LOOP
