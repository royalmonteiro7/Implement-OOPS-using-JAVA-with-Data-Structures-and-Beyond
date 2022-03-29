package com.simplilearn.dsa;

public class DoublyLinkedList {
	Node head;

	class Node {
		int data;
		Node prev;
		Node next;

		Node(int data) {
			this.data = data;
			this.prev = null;
			this.next = null;
		}
	}

	void insertAtStart(int data) {
		Node node = new Node(data);

		if (head == null) {
			head = node;
		} else {
			node.next = head;
			head.prev = node;
			head = node;
		}
	}

	void insertAtEnd(int data) {
		Node node = new Node(data);

		if (head == null) {
			head = node;

		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
			node.prev = head;

		}
	}

	public void show() {
		Node node = head;

		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

//		doublyLinkedList.insertAtStart(5);
//		doublyLinkedList.insertAtStart(15);
//		doublyLinkedList.insertAtStart(25);

		doublyLinkedList.insertAtEnd(35);
		doublyLinkedList.insertAtEnd(45);
		doublyLinkedList.insertAtEnd(55);
		doublyLinkedList.insertAtEnd(65);

		doublyLinkedList.show();

	}

}
