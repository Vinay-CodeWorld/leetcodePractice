public class QueueArrayImplementation {
   
    public static class Queue{
        int front=-1;
        int rear=-1;
        int val;
        int size=0;
         int arr[]= new int[10];
    
         //make queue
    public void add(int val){
        if(front==-1){
            front++;
            rear++;
            size++;
            arr[front]=val;
         //   System.out.println(front+" <-> "+ rear);
        }
        else  if(rear==arr.length-1){
            //   System.out.println(front+" <-> "+ rear);
              System.out.println("queue is full ");
        }
        else{
            
            arr[++rear]=val;
            size++;
            //System.out.println(front+" <-> "+ rear);
        }
    }

    //remove element 
    public int remove(){
        if(size==0){
            return -1;
        }
          front++;
          size--;
          return arr[front-1];
    }

    //get first element
    public int  peek(){
        if(size==0){
            return -1;
        }
        return arr[front];

    }

    //traverse
    public void display(){
        for(int i=front;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
    }

    }
   
   
  

    public static void main(String[] args) {
        Queue q =new Queue();

         q.add(0);
        q.add(1);

        q.add(2);
        q.add(3);
        q.add(4);
        // q.add(5);

         q.remove();
          q.add(5);
          q.add(6);
       // System.out.println(q.peek()+" peeked element");
      
        System.out.println(q.size+" size of queue");
        q.display();


    }
}
