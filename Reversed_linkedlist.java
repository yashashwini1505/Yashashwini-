package day8;

public class Reversed_linkedlist {

		static class node{
			int data;
			node next;
			node(int data){
				this.data=data;
				
			}
		}
		public static void main(String[] args) {
			node first=new node(10);
			node second=new node(20);
			node third=new node(30);
			first.next=second;
			second.next=third;
			node previous=null;
			
			node current=first;
			while(current!=null) {
				node next=current.next;
				current.next=previous;
				previous=current;
				current=next;
			}
		
			current=previous;
			while(current!=null) {
				System.out.print(current.data+" -> ");
				current=current.next;

	}
			System.out.println("null");
			}
		}


