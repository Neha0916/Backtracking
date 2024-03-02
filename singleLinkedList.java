
public class singleLinkedList {
   public node head;
   public node tail;
   public int size;

   public node createSingleLinkedList(int nodeValue){
       head=new node();
       node Node=new node();
       Node.next=null;
       Node.value=nodeValue;
       head=Node;
       tail=Node;
       size=1;
       return head;
   }
   public void insertSingleLinkedList(int nodeValue, int location){
       node Node=new node();
       Node.value=nodeValue;
       if(head==null){
           createSingleLinkedList(nodeValue);
       }
       else if(location==0){
           Node.next=head;
           head=Node;
           size++;
       }
       else if(location>=size){
           tail.next=Node;
           Node.next=null;
           tail=Node;
           size++;
       }
       else{
            node tempNode= head;
            int index=0;
            while(index<location-1){
                tempNode=tempNode.next;
                index++;
            }
            node var=tempNode.next;
            tempNode.next=Node;
           Node.next=var;
           size++;
       }
   }
   public void display(){
       node temp=head;
       if(head==null){
           System.out.println("SLL does not exist");
           return;
       }
       while(temp.next!=null){
           System.out.print(temp.value+"->");
           temp=temp.next;
       }
       System.out.println(temp.value);
   }
   public boolean search(int nodeValue){

         boolean b=false;
         node temp=head;
         while(temp!=null){
             if(temp.value==nodeValue){
                 b=true;
                 return b;
             }
             temp=temp.next;
         }
       return b;
   }
   public node delete(int nodeValue){
       if(head==null){
           System.out.println("SLL is empty");
           return head;
       }
       else{
           node temp=head;
           if(temp.value==nodeValue)
           {
               if(temp.next==null)
                   head=null;
               else {
                   head = temp.next;
                   temp.next = null;
                   return head;
               }
           }

           while(temp!=null){
               if(temp.next!=null&&temp.next.value==nodeValue){
                   node var=temp.next;
                   temp.next=temp.next.next;
                   var.next=null;
               }
               temp=temp.next;
           }
       }
       size--;
       return head;
   }
}
