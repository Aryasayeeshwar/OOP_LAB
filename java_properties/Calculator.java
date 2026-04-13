import java.util.Scanner;
class Calculator
{
public static void main(String args[]){
Scanner inp = new Scanner(System.in);
char op;
double n1, n2, n3;
System.out.print("Enter the first number:");
n1=inp.nextDouble();
System.out.print("Enter the second number:");
n2=inp.nextDouble();
System.out.print("Enter the operator:");
op = inp.next().charAt(0);
switch (op){
case '+':
n3 = n1 + n2;
break;
case '-':
n3 = n1 - n2;
break;
case '*':
n3 = n1*n2;
break;
case '/':
n3 = n1/n2;
break;
default:
n3 = 0;}
System.out.println("Output = "+n3);
}}