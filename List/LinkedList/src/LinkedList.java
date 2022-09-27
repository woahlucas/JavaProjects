abstract class List{
    abstract void insert(int index, int data); //inserts <data> at <index>

    abstract void remove(int data); //removes the first occurrence of <data>

    abstract int count(int data); //counts how many <data> are present in the list

    abstract void clear(); //erases the list

    abstract int index(int data); //returns the index of the first occurrence of <data>

    abstract int length(); //returns the length of the list
}

public class LinkedList extends List {
    Node head;
    int length = 0;

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(2);
        ll.add(4);
        ll.add(4);
        ll.add(4);
        System.out.println(ll.toString());
        System.out.println(ll.length);
        System.out.println(ll.index(2));
    }



    void insert(int index, int data){
        //TODO insert method
    }

    void remove(int data){
        boolean removed = false;
        if(this.head == null){
            System.out.print("The list is empty! Try another operation.");
        } else{
            Node curr = head;
            if (curr.data == data){ //special case: element is at head
                this.head = curr.next;
                length--;
                removed = true;
            }
            while(curr.next != null && !removed){
                Node prev = curr;
                curr = curr.next;
                if(curr.data == data){
                    prev.next = curr.next;
                    removed = true;
                    length--;
                }
            }
        }
    }

    int count(int data){
        Node curr = head;
        int count = 0;
        while(curr.next != null){
            if(curr.data == data){
                count++;
            }
            curr = curr.next;
        }
        return count;
    }

    void clear(){
        this.head = null;
        length = 0;
    }

    int index(int data){
        Node curr = head;
        int count = 0;
        boolean found = false;
        while(curr.next != null && !found){
            if(curr.data == data){
                found = true;
            }else {
                count++;
                curr = curr.next;
            }
        }
        return count;
    }

    int length(){
        return this.length;
    }

    void add(int data){
        //if the list is empty
        if(this.head == null){
            this.head = new Node(data);
        } else{
            //list is not empty
            Node newNode = new Node(data);
            newNode.next = this.head;
            this.head = newNode;
        }
        length++;
    }

    public String toString(){
        String retStr = "Linked List: ";

        Node current = head;
        while(current != null){
            if(current.next != null) {
                retStr += current.data + "-";
            }else{
                retStr += current.data;
            }
            current = current.next;
        }

        return retStr;
    }
}
