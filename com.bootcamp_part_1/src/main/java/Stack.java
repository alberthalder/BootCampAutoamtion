
public class Stack {

	final static int RogueValue = -999999;
	Node top = null;

	public boolean empty() {
		return top == null;
	}

	public void push(int n) {
		Node p = new Node(n);
		p.next = top;
		top = p;
	} // end push

	public int pop() {
		if (this.empty())
			return RogueValue; // a symbolic constant
		int hold = top.data;
		top = top.next;
		return hold;
	} // end pop

	public void display() {
		Node tempDisplay = top; // start at the beginning of linkedList
		while (tempDisplay != null) { // Executes until we don't find end of list.
			System.out.println(tempDisplay.data);
			tempDisplay = tempDisplay.next; // move to next Node
		}
	}

	public int peek() {
		if (empty()) {
			System.out.printf("Stack is empty!");
			return RogueValue;
		} else {
			return top.data;
		}
	}
}