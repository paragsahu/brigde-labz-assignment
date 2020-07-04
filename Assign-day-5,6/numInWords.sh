#!/bin/bash -x

read -p "Enter the Number: " digit   

if [ $digit -ge 0 -a $digit -le 9 ];
then

case $digit in
        0) echo -n "zero " ;;
        1) echo -n "one " ;;
        2) echo -n "two " ;;
        3) echo -n "three " ;;
        4) echo -n "four " ;;
        5) echo -n "five " ;;
        6) echo -n "six " ;;
        7) echo -n "seven " ;;
        8) echo -n "eight " ;;
        9) echo -n "nine " ;;
    esac	 
# just print new line
echo ""

else
  echo "Invaild Input...!!! RANGE IS 0-9  "
fi
