#!/bin/bash

declare -A set=( ["configuracion1A"]=1
["configuracion1B"]=2
["configuracion2A"]=3
["configuracion2B"]=4
["configuracion3A"]=5
["configuracion3B"]=6
["configuracion4A"]=7
["configuracion4B"]=8
["configuracion5A"]=9
["configuracion5B"]=10
["configuracion6A"]=11
["configuracion6B"]=12
["configuracion7A"]=13
["configuracion7B"]=14
["configuracion8A"]=15
["configuracion8B"]=16
["configuracion9A"]=17
["configuracion9B"]=18
["configuracion10A"]=19
["configuracion10B"]=20
["configuracion11A"]=21
["configuracion11B"]=22
["configuracion12A"]=23
["configuracion12B"]=24)

cd src;

for config in "${!set[@]}" 
	do 
	echo "Corriendo $config y almacenando resultados en $config.txt"; 
	java modeloscajas.MiMain "${set[$config]}" > ../resultados/"$config.txt"; 
done
