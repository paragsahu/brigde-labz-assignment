#!/bin/bash

leng=10
count=1

while [ $count -le $leng ];
do
   num[$count]=${RANDOM:0:3} 
   let "count +=   1"
    		
done
#echo  ${num[@]}
b=($(for l in ${num[@]}; do echo $l; done | sort))
echo "Sorted Array  ${b[@]}"
echo ${b[1]} ${b[8]}
