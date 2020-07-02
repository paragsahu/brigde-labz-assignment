#!/bin/zsh -x
#echo ${RANDOM:0:2} # random number between 1 and 99
a=${RANDOM:0:2}
b=${RANDOM:0:2}
c=${RANDOM:0:2}
d=${RANDOM:0:2}
e=${RANDOM:0:2}
z=$(( ($a + $b + $c + $d +$e) / 5 ));
echo $z;
