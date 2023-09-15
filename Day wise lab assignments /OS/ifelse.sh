#!/bin/bash
read -p "Enter the First Number" num1
read -p "Enter the Second Number" num2
if [ $num1 -eq $num2 ]
then
echo "Number are Equal"
else
echo "Number are Not Equal"
fi
