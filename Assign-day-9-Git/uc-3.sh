#!/bin/bash -x

isFullTime=1
isPartTime=2
x=$(($RANDOM%3))

if [ $isFullTime -eq $x ]
then
 ratePerHrs=20
 hrs=8
 
elif [ $isPartTime -eq $x ]
 then
   #ratePerHrs=10
    hrs=4

else
 echo sal=0

sal=$(( $ratePerHrs * hrs ))
echo $sal
fi

