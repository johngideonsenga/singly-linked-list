public class SLL<T>{

   private SLLNode<T> head, tail;
      
    public String toString(){
        SLLNode<T> p;
        String s = "";
        for(p = head; p != null; p = p.next)
            s = s + p.info.toString() + " ";
         return s;
    }
   
    public void addToHead(T el){
        head = new SLLNode<T>(el, head);
        if(tail == null)
           tail = head;
    }
    
    public void addToTail(T el){
        if(tail == null){ 
            head = new SLLNode<T>(el, head);
            tail = head;
        }
        
        else{
        tail.next = new SLLNode<T>(el);
            tail = tail.next;
        }
    }
    
    public void addBefore(T el, T before){
        if(isEmpty()){ 
            head = new SLLNode<T>(el, head);
            tail = head;
        }
        else{
            SLLNode<T> p;
            for(p = head; p.next != null; p = p.next){
                if(p.next.info.equals(before)){
                    p.next = new SLLNode<T>(el,p.next);
                    break;
                }
            }
        }
    
    }
    
    public T deleteFromHead(){
       if(isEmpty()) {
           System.out.println("List is Empty!");
           return null;
       }
       T el = head.info;
       if(head == tail){
           head = tail = null;
           System.out.println("Deleted!");
       }
       else{
           head = head.next;
           
       }
       return el;
   }
    
   
    public T deleteFromTail(){
       if(isEmpty()) {
           System.out.println("List is Empty!");
           return null;
       }
       T el = tail.info;
       if(head == tail){
           head = tail = null;
           System.out.println("Deleted!");
       }
       else{
           SLLNode<T> p;
           for(p = head; p.next != tail; p = p.next);
           tail = p;
           tail.next = null;
           System.out.println("Deleted!");
       }
       return el;
   }
    public T delete(T el){
        if(isEmpty()) {
           System.out.println("List is Empty!");
           return null;
        }
        if(el.equals(head.info)){
           return deleteFromHead();
        }
        if(el.equals(tail.info)){
           return deleteFromTail();
        }
        
        SLLNode<T> pred = head;
        SLLNode<T> t = head.next;
        while(t != null && !t.info.equals(el)){
            pred = pred.next;
            t = t.next;
        }
        
        if(t == null) return null;
        else{
            pred.next = t.next;
            delete(el);
        }
     
        return el;
    }
    
    public boolean isEmpty(){
        return (head == null);
    }

}
