package day8;

public class Merged_linkedlist {


		static class node{
			int data;
			node next;
			node(int data){
				this.data=data;
				this.next=null;
			}
		}
		public static void main(String[] args) {
			node first=new node(10);
			node second=new node(20);
			node third=new node(30);
			first.next=second;
			second.next=third;
			
			node first_2=new node(40);
			node second_2=new node(50);
			node third_2=new node(60);
			first_2.next=second_2;
			second_2.next=third_2;
			
			third.next=first_2;
			node current=first;
			while(current!=null) {
				System.out.print(current.data+" -> ");
				current=current.next;
			}
		}

	}

