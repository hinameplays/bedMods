@ECHO off
ECHO Packing...
"C:\Program Files\7-Zip\7z.exe" a -tzip -y "tsetB.mcpack" %~dp0\behaviors\* > nul
"C:\Program Files\7-Zip\7z.exe" a -tzip -y "tsetR.mcpack" %~dp0\resources\* > nul
"C:\Program Files\7-Zip\7z.exe" a -tzip -y "tset.mcaddon" %~dp0\*.mcpack > nul
ECHO Done!