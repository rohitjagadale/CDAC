#!/bin/bash
read -p "Enter the number :" num1
read -p "Enter the second number :" num2
if [ $num1 -eq $num2 ]
then
echo "Number is equal"
fi
if [ $num1 -ne $num2 ]
then
echo "Number is Not Equal"
fi
