class StackAsLinkedList {

    StackNode root = null;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            // Constructor here
            this.data = data;
        }
    }

    public boolean isEmpty() {
        // Write your code here for the condition if stack is empty.
        return root == null;
    }

    public void push(int data) {
        // Write code to push data to the stack.
        StackNode sn = new StackNode(data);
        sn.next = root;
        root = sn;
    }

    public int pop() {
        if (isEmpty()) {
            System.err.println("stack underflow");
            return 0;
        }
        int poppedElement = root.data;
        root = root.next;
        return poppedElement;
        // If Stack Empty Return 0 and print "Stack Underflow"
        // Write code to pop the topmost element of stack.
        // Also return the popped element
    }

    public int peek() {
        return root.data;
        // Write code to just return the topmost element without removing it.
    }

    // Driver code
    public static void main(String[] args) {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
}
