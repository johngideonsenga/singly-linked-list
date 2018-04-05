import java.io.*;

public class main {
    public static void main(String Args[])throws IOException{
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        SLL<String> slist1 = new SLL<String>();
        int select;
        
        do{
            menu();
            select = Integer.parseInt(x.readLine());
            
            switch(select){ 
                case 1: //add to head
                    System.out.print("Input an Element: ");
                    slist1.addToHead(x.readLine());
                    break;
                case 2:
                    System.out.print("Input an Element: ");
                    slist1.addToTail(x.readLine());
                    break;
                case 3:
                    System.out.print("Input an Element: ");
                    String el =  x.readLine();
                    System.out.print("before: ");
                    String before = x.readLine();
                    slist1.addBefore(el,before);
                    break;
                case 4:
                    slist1.deleteFromHead();
                    break;
                case 5: //delete from tail
                    slist1.deleteFromTail();
                    break;
                case 6:
                    System.out.print("el: ");
                    slist1.delete(x.readLine());
                    break;
                case 7: //show list
                    System.out.println("List: " + slist1.toString());
                    break;
            }
            
        }
        while (select != 8);
        
    }
    
    public static void menu(){
        System.out.print(
                  "1. Add to head\n"
                + "2. Add to tail\n"
                + "3. Add before\n"
                + "4. Delete from head\n"
                + "5. Delete from tail\n"
                + "6. Delete \n"          
                + "7. Show list\n"
                + "8. Quit\n"
                + "Please select: ");
    }
          
}
