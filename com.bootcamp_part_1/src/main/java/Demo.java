
public class Demo {

	Node head;
	   static class Node {
	      int data;
	      Node next_element;
	      Node(int element){
	         data = element;
	         next_element = null;
	      }
	   }
	   public static Demo insert(Demo input_list, int data){
	      Node new_node = new Node(data);
	      new_node.next_element = null;
	      if (input_list.head == null) {
	         input_list.head = new_node;
	      }
	      else {
	         Node last = input_list.head;
	         while (last.next_element != null) {
	            last = last.next_element;
	         }
	         last.next_element = new_node;
	      }
	      return input_list;
	   }
	   public static void main(String[] args){
	      Demo input_list = new Demo();
	      System.out.print("A linked list is declared: \n");
	      input_list = insert(input_list, 100);
	      input_list = insert(input_list, 150);
	      input_list = insert(input_list, 200);
	      input_list = insert(input_list, 250);
	      Node current_node = input_list.head;
	      System.out.print("The elements of the linked list are: \n");
	      while (current_node != null) {
	         System.out.print(current_node.data + " ");
	         current_node = current_node.next_element;
	      }
	   }
	}

