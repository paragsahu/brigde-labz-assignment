#!/bin/bash -x

read -p "Enter The Day: " day

if [ "$day" -ge 1 -a $day -le 7 ];
then

case $day in
       
        1) echo -n "SUNDAY " ;;
        2) echo -n "MONDAY " ;;
	3) echo -n "TUESDAY " ;;
        4) echo -n "WENESDAY " ;;
        5) echo -n "THURSDAY " ;;
        6) echo -n "FRIDAY " ;;
        7) echo -n "SATURDAY " ;;
       
    esac	 
# just print new line
echo ""

else
 echo "Invaild Input..!!! RANGE IS 1-7 "
fi
