#!/bin/bash
echo "Simple Calculator"

echo "Enter first number:"
read a
echo "Enter second number:"
read b
echo "Enter operation (+, -, *, /):"
read op

case $op in
  +) result=$((a + b));;
  -) result=$((a - b));;
  \*) result=$((a * b));;
  /) result=$((a / b));;
  *) echo "Invalid operation"; continue;;
esac

echo "Result: $result"
echo "Do you want to perform another calculation? (yes/no)"
read choice
if [ "$choice" != "yes" ]; then
    break
fi

echo "Exiting calculator..."
