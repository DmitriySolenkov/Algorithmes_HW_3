
public class Ex1 {
    public static void main(String[] args) {
        Node node = new Node();
        node.value = 1;
        node.previous = null;
        node.next = null;

        Node head = node;
        Node tail = null;

        for (int i = 2; i < 10; i++) {
            Node nodeNext = new Node();
            nodeNext.value = i;
            nodeNext.previous = node;
            node.next = nodeNext;
            nodeNext.next = null;
            if (i != 9) {
                node = nodeNext;
            } else {
                tail = nodeNext;
            }
        }
        node = head;
        while (true) {
            if (node.next != null) {
                System.out.println(node.value);
                node = node.next;
            } else {
                System.out.println(node.value);
                break;
            }
        }
        System.out.println("------------");
        reverse(head, tail);
    }

    public static void reverse(Node head, Node tail) {
        Node node = tail;
        boolean headCheck=true;
        while (true) {
            Node temp = node.previous;
            node.previous = node.next;
            node.next = temp;
            if (headCheck){
                head=node;
                headCheck=false;
            }
            if (node.next==null){
                tail=node;
                break;
            }
            node=node.next;
        }
        node = head;
        while (true) {
            if (node.next != null) {
                System.out.println(node.value);
                node = node.next;
            } else {
                System.out.println(node.value);
                break;
            }
        }
       
    }
}
