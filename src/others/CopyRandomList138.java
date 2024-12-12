package others;

public class CopyRandomList138 {
    public Node copyRandomList(Node head) {
        if (head == null) return null; // Check for null head

        Node result = new Node(head.val);
        Node r_current = result;
        Node h_current = head.next;

        // First pass: create the next pointers
        while (h_current != null) {
            r_current.next = new Node(h_current.val);
            r_current = r_current.next;
            h_current = h_current.next;
        }

        // Reset pointers for the second pass
        r_current = result;
        h_current = head;

        // Second pass: set the random pointers
        while (h_current != null) {
            if (h_current.random != null) {
                r_current.random = getNode(h_current.random, result);
            }
            r_current = r_current.next;
            h_current = h_current.next;
        }

        return result;
    }

    public Node getNode(Node h_current, Node result) {
        Node current = result;
        while (current != null) {
            if (current.val == h_current.val) {
                return current;
            }
            current = current.next;
        }
        return null; // In case no matching node is found
    }
}
