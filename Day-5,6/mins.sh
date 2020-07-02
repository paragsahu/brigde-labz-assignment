#!/bin/bash -x
clear

read -p  "enter the Value  A :" a
read -p  "enter the Value  B :" b
read -p  "enter the Value  C :" c

p=$(( $a + $b * $c )) 
q=$(( $c + $a / $b )) 
r=$(( $a % $b + $c)) 
s=$(( $a * $b + $c))  
arr=( $p $q $r $s ) 
echo -e "$p\n$q\n$r\n$s" | sort -n 
z=$(( $p + $s ))
echo $z
echo ${arr[0]} + ${arr[3]}
