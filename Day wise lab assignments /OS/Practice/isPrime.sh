#!/bin/bash
read -p "Enter the Number to check for its Prime or Not:" num
for(( i=2; i<num; i++ ))
do
if [ `expr $num % $i` -eq 0 ]
then
echo "Number is not prime"
exit
else
echo "NUmber is prime"
exit
fi
done
