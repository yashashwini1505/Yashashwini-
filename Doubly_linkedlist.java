package day8;

public class Doubly_linkedlist {
		static class node{
			int data;
			node previous;
			node next;
			node(int data){
				this.data=data;
			}}
		public static void main(String[] args) {
			node first=new node(10);
			node second=new node(20);
			node third=new node(30);
			first.next=second;
			second.next=third;
			second.previous=first;
			third.previous=second;
			node current=first;
			System.out.println("forward:");
			while(current!=null) {
				System.out.print(current.data+" ");
				current=current.next;
			}
			System.out.println();
			current=third;
			System.out.println("backward:");
			while(current!=null) {
				System.out.print(current.data+" ");
				current=current.previous;
			}
	}
	}


