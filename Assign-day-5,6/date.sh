#!/bin/bash -x

date_a=2020-03-20
date_b=2020-06-20

if [[ "$date_a" >= "$date_b" && "$date_a" =< "$date_b" ]] ;
then
    echo "true"
fi
