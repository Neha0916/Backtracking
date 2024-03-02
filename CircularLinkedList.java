//class Node{
//    public int value;
//    public Node next;
//}
class circularLL{
    node head=null;
    node tail=null;
    int index;
    public node createCLL(int nodeValue){
        node temp=new node();
        head=temp;
        temp.next=temp;
        temp.value=nodeValue;
        tail=temp;
        index=1;
        return head;
    }
    public node insertCLL(int nodeValue,int location){
        node temp=new node();
        temp.value=nodeValue;
        if(head==null){
            head=createCLL(nodeValue);
        }
        else if(location==0){
            temp.next=head.next;
            head=temp;
            tail.next=temp;
            index++;
        }
        else if(location>=index){
            tail.next=temp;
            temp.next=head;
            tail=temp;
            index++;
        }
        else{
            node var=head;
            int x=0;
            while(x<location-1){
                var=var.next;
                x++;
            }
            temp.next=var.next;
            var.next=temp;
            index++;
        }
        return head;
    }
    public void display(){
        if(head==null){
            System.out.println("Circular Linked List is empty");
            return;
        }
        node temp=head;
        while(temp!=tail){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println(temp.value);
    }
    public boolean search(int nodeValue) {

        boolean b = false;
        node temp = head;
        while (temp != tail) {
            if (temp.value == nodeValue) {
                b = true;
                return b;
            }
            temp = temp.next;
        }
        if (temp.value == nodeValue) {
            b = true;
            return b;
        }
        return b;
    }
    public void delete(int location){
        if(head==null){
            System.out.println("Circular Linked List is empty");
            return ;
        }
        else if(location==0){
            head=head.next;
            index--;
        }
        else if(location>=index){
            node temp=head;
            while(temp.next.next!=head){
                temp=temp.next;
            }
            temp.next=head;
            tail=temp;
            index--;
        }
        else{
            node temp=head;
            int x=0;
            while(x<location-1){
                temp=temp.next;
                x++;
            }
            node var=temp.next;
            temp.next=temp.next.next;
            var.next=null;
            index--;
        }
    }
    public void entireDelete(){
        head=null;
        tail=null;
    }
}

public class CircularLinkedList {
    public static void main(String[] args) {
        circularLL cll=new circularLL();
        cll.createCLL(5);
        cll.display();
        cll.insertCLL(1,0);
        cll.display();
        cll.insertCLL(3,1);
        cll.display();
        cll.insertCLL(4,2);
        cll.display();
        cll.insertCLL(2,1);
        cll.display();
        System.out.println(cll.search(5));
        cll.delete(7);
        cll.display();
        cll.entireDelete();
        cll.display();
    }
}
