package queue.implementation;

class MyCircularQueue {

    int[] arr;
    int f;
    int r;
    int size;

    public MyCircularQueue(int length) {  //decide the size of circular queue
        arr = new int[length];
    }

    void add(int val) {
        if (arr.length == size) {
            System.out.println("queue is full");
        }
        arr[r++] = val;
        if (r == arr.length) {
            r = 0;
        }
        size++;
    }

    int remove() {
        if (size == 0) {
            return -1;
        }
        int ele = arr[f];
        f++;
        if (f == arr.length) {
            f = 0;
        }
        size--;
        return ele;
    }

    int peek() {
        if (size == 0) {
            return -1;
        }
        return arr[f];
    }

    void print(){
        if(size ==0){
            System.out.println("queue is empty");
            return;
        }
        if(f>=r){  //is condtion me front rear se aage rahta hai
            for(int i=f;i<arr.length;i++){ //front to end
                System.out.print(arr[i] + " ");
            }
            for(int i=0;i<r;i++){ //start to rear - 1d
                System.out.print(arr[i]+ " ");
            }
        }
        System.out.println();

        for(int i=f;i<r;i++){  // jab rear front se aage hai
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


}

public class ByArray {

    public static void main(String[] args) {
        MyCircularQueue q = new MyCircularQueue(10);

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        q.remove();
        q.print();
        System.out.println(q.peek());
    }
}
