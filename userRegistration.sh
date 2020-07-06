
#!/bin/bash -x

shopt -s extglob

read -p  "enter FIRST NAME :" firstName

 #UC-1
f=^[A-Z]{3,}[a-z]$

read -p  "enter LAST NAME :" lastName

 #UC-2
l=^[A-Z]{3,}[a-z]$

read -p  "enter MOBLIE NUMBER :" num

 #UC-3
n=^[0-9]{2}\s[0-9]{10}$;

if [ $f =~ $firstName -a $l =~ $lastName -a $n =~ $num ];
then
 echo "vaild"
else
 echo "Invaild"
fi

####################### PASSWORD ** #################

read -p  "enter PASSWORD  :" passWord

 #UC- 5 6 7 8 9

pass="^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$"

if [[ $pass =~ $passWord ]];
 then
  echo "yes"

else
 echo "No"
fi

