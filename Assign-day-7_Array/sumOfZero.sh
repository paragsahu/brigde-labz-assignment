#!/bin/bash

echo "Enter Three Values "
if [ $var -eq 3 ];then
read -a var

var=$(echo $var); 
x="$((${var// /+}))"
echo $x

if [ ${x[@]} -eq 0 ]
then 
   echo Vaild Sum

else
 echo InVaild Sum 
fi

echo "not allowed!"
exit 1

fi
