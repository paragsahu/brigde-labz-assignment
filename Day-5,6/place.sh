#!/bin/bash -x

read -p "Enter the number: " number

case ${#number} in 
    1)
    echo "unit";;
    2)
    echo "tens";;
    3)
    echo "hundreds";;
    4)
    echo "thousand";;
    *)
    echo "no";;
esac
