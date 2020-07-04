#!/bin/bash -x

a=$(($RANDOM%2))

if [ $a -eq 1 ]
then
 echo "is Present.."

else 
  echo "is Absent..."
fi
