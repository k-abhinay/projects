/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stackusingarray;

class Stack {

    static int MAX = 5;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        return (top < 0);
    }

    Stack() {
        top = -1;
    }

    boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Overflow condition reached");
            return false;
        } else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Underflow condition reached");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }

    int peek() {
        if (top < 0) {
            System.out.println("Underflow condition");
            return 0;
        } else {
            int x = a[top];
            return x;
        }
    }
}

public class StackUsingArray {

    public static void main(String[] args) {
        Stack stk = new Stack();
        stk.push(11);
        stk.push(22);
        stk.push(33);
        stk.push(44);
        stk.push(55);
        stk.push(210);

        System.out.println("element poped out : " + stk.pop());
    }
}
