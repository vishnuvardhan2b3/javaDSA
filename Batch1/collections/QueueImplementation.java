class QueueImplementation{
    int SIZE=5,rear=-1,front=-1;
   int[] queue=new int[SIZE];
    public boolean isEmpty(){
        if (front==-1 || front== rear+1){
             
                return true;
        }
        else {
            return false;
        }
    }
    public boolean isFull(){ 
        if(rear==SIZE-1){
            return true;
        }
        else{
            return false;
        }
        
    }
    public void enqueue(int ele){
      if (isFull()){
        System.out.println("queue over flow");
        System.exit(0);
      }
      if (front==-1){
        front=0;
      }
      rear++;
      queue[rear]=ele;
    }
    public int dequeue(){
       if(isEmpty()) {
        System.out.println("Queue is underflow");
        System.exit(0);
       }
       return queue[front++];
    }
    public int peek(){
       if(isEmpty()){
        System.out.println("queue is empty");
        return -1;
       } 
       return queue[front];
    }
    public void display(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return;
        }
        for(int i=front;i<=rear;i++){
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        QueueImplementation qImp=new QueueImplementation();
        qImp.display();
        qImp.enqueue(10);
        qImp.enqueue(30);
        qImp.enqueue(20);
        qImp.enqueue(40);
        qImp.display();
        System.out.println(qImp.dequeue());
        qImp.dequeue();
        qImp.enqueue(50);
        qImp.display();
        System.out.println(qImp.peek());
   }
}