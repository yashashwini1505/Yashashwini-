package day8;

public class circular_linkedlist{
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
			third.next=first;
			node current=first;
			for(int i=0;i<6;i++){
				System.out.print(current.data+" -> ");
				current=current.next;
			}
		}

	}


