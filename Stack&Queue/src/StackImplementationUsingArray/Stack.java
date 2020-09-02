package StackImplementationUsingArray;

import java.util.Arrays;

public class Stack {

	private int [] stack;
	private int top;

	public Stack(int size) {
		stack = new int[size];
		top = -1;
	}

	public void push(int data) {
		top++;
		if (top == stack.length) {
			System.out.println("Stack is full");
		} else {
			stack[top] = data;
		}
		System.out.println(Arrays.toString(stack));
	}

	public int pop() {
		if (top == -1) {
			return -1;
		} else {

			return stack[top--];
		}

	}

	public int peek() {
		if (top == -1) {
			return -1;
		} else {

			return stack[top];
		}
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == stack.length - 1;
	}

}
