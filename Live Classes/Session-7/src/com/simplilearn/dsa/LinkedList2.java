package com.simplilearn.dsa;

public class LinkedList2 {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void insert(int data) {
		Node node = new Node(data);

		if (head == null) {
			head = node;

		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}

	}

	public void insertAtStart(int data) {
		Node node = new Node(data);

		node.next = head;
		head = node;
	}

	public void insertAt(int index, int data) {
		Node node = new Node(data);

		if (index == 0) {
			insertAtStart(data);
		} else {
			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}

			node.next = n.next;
			n.next = node;
		}
	}

	public void deleteAt(int index) {
		if (index == 0) {
			head = head.next;
		} else {
			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			n.next = n.next.next;
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
		LinkedList2 list = new LinkedList2();

		list.insert(18);
		list.insert(45);
		list.insert(12);
		list.insertAtStart(25);

		list.insertAt(2, 20);

		list.deleteAt(2);

		list.show();
	}

}