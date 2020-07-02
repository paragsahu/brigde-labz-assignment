!#/bin/bash -x

echo "Enter the year (YYYY)"
read year

if [ $((year % 4)) -eq 0 ]
then
  if [ $((year % 100)) -eq 0 ]
    then
    if [ $((year % 400)) -eq 0 ]
          then
        echo "$year a leap year"
    else
           echo "$year not a leap year"
    fi
  else
  echo "$year a leap year"
  fi
else
 echo "$year not a leap year"

fi
