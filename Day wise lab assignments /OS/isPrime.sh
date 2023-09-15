#!/bin/bash
read -p "Enter the  Number:" num
for(( i=2; i<=num/2; i++ ))
do
if [ `expr $num %  $i` -eq 0 ]
then
echo "Number is Not Prime"
exit
else
echo "Number is Prime"
exit
fi
done
