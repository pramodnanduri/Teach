

//insert
//Delete
//search
//printAll.


public class CustomList {

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }

    }

    static void add(Node list, int x) {
        //Step 1: Traverse to the last node.
        Node temp = list;
        while (temp.next != null) {
            temp = temp.next;
        }
        //Step 2:
        Node n = new Node(x);
        //Step 3:
        temp.next = n;
    }

    static void delete(Node list, int x) {
        Node prev = null;
        Node temp = list;
        boolean found = false;
        //Step 1 : Traverse
        while (temp != null) {
            if (temp.val == x) {
                found = true;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        //Step 2 : Change pointers.
        if (found) {
            prev.next = temp.next;
        }
    }

    static boolean search(Node list, int x) {
        Node temp = list;
        while (temp != null) {
            if (x == temp.val) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    static void printAll(Node list) {
        Node temp = list;
        while (temp != null) {
            System.out.print(temp.val + ",");
            temp = temp.next;
        }
        System.out.println();
    }

    static void replace(Node list, int x, int y) {
        Node temp = list;
        while (temp != null) {
            if (x == temp.val) {
                temp.val = y;
            }
            temp = temp.next;
        }
    }

    Node reverseList(Node list) {

        return null;
    }


    public static void main(String[] args) {
        Node head = new Node(1);
//        Node n2 = new Node(2);
        add(head, 2);
        add(head, 3);
        add(head, 4);

        printAll(head);
        boolean res = search(head, 4);
        System.out.println(res);
        replace(head, 3, 5);
        printAll(head);
        delete(head, 4);
        printAll(head);


    }


}
