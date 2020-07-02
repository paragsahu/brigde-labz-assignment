#!/bin/bash -x

x=$(( RANDOM % 2 ));
if [ $x -gt  0 ];
then
 echo "$x It's HEAD"

else
 echo "$x It's TAILS"

fi
