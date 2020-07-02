#!/bin/bash

declare -A dice

dice[1]=0
dice[2]=0
dice[3]=0
dice[4]=0
dice[5]=0
dice[6]=0

while [ ${dice[1]} != 10 ] && [ ${dice[2]} != 10 ] &&  [ ${dice[3]} != 10 ] && [ ${dice[4]} != 10 ] && [ ${dice[5]} != 10 ] && [ ${dice[6]} != 10 ]
do
    r=$((RANDOM%6+1))
    case $r in
    1)
    dice[1]=$((${dice[1]}+1));;
    2)
    dice[2]=$((${dice[2]}+1));;
    3)
    dice[3]=$((${dice[3]}+1));;
    4)
    dice[4]=$((${dice[4]}+1));;
    5)
    dice[5]=$((${dice[5]}+1));;
    6)
    dice[6]=$((${dice[6]}+1));;
    esac
done

for i in ${!dice[@]}
do
    echo $i" : "${dice[$i]}
done

L=${dice[1]}
S=${dice[1]}

for i in ${!dice[@]}
do            
    if [ ${dice[$i]} -gt $L ]
    then 
    L=${dice[$i]}   
    a=$i  
 fi

    if [ ${dice[$i]} -lt $S ]
    then
    S=${dice[$i]}
    b=${!dice[$i]}
    echo $b
    fi 
done

echo $a
echo $b
