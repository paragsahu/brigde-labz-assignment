#!/bin/bash -x

a=${RANDOM:0:3}
b=${RANDOM:0:3}
c=${RANDOM:0:3}
d=${RANDOM:0:3}
e=${RANDOM:0:3}
z=$(( ($a + $b + $c + $d +$e) / 5 )) 
echo $z;
echo -e "\n$a\n$b\n$c\n$d\n$e" | sort 
p=$(( $a + $e ))
echo $p
