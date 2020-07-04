#!/bin/bash -x

isPresent=1
x=$(($RANDOM%2))

if [ $isPresent -eq $x ]
then
 ratePerHrs=20
 hrs=8
 sal=$(( $ratePerHrs * hrs ))

else
 echo sal=0

fi
