#!/bin/bash -x
sum=0
    for((i=0; i<=1; i++))
    {
      sum+=$(( RANDOM % 6 + 1 )) 
    }
    echo $sum/2 | bc

