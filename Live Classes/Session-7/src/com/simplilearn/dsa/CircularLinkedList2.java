package com.simplilearn.dsa;

public class CircularLinkedList2 {
	Node head = null;
	Node tail = null;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void insertStart(int data) {
		Node node = new Node(data);

		if (head == null) {
			head = node;
			tail = node;
			node.next = node;
		} else {
			node.next = head;
			head = node;
			tail.next = head;

		}
	}

	public void insertEnd(int data) {
		Node node = new Node(data);

		if (head == null) {
			head = node;
			tail = node;
			node.next = node;
		} else {
			tail.next = node;
			tail = node;
			node.next = head;

		}

	}

	public void show() {
		Node node = head;

		do {
			System.out.println(node.data);
			node = node.next;
		} while (node != head);
	}

	public static void main(String[] args) {
		CircularLinkedList2 circularLinkedList = new CircularLinkedList2();

		circularLinkedList.insertEnd(18);
		circularLinkedList.insertEnd(45);
		circularLinkedList.insertEnd(12);

		circularLinkedList.insertStart(12);
		circularLinkedList.insertStart(24);
		circularLinkedList.insertStart(36);

		circularLinkedList.show();
	}

}
