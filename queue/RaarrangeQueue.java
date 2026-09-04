
// This is the question of GFG practice(RearrangeQueue)

// class solution{
//  static Queue<Integer> RearnageQueue(Queue<Integer> q){
//     Queue<Integer> q2 = new LinkedList<>();

//     int n = q.size();

//     for(int i=1;i<=n/2;i++){
//         q2.add(q.remove());
//     }

//     while(q2.size()>0){
//         q.add(q2.remove());
//         q.add(q.remove());
//     }

//     return q;
//  }
// }




//Mehtod 2 via stack



// static Queue<Integer> rearrange(Queue<Integer> q){
//     Stack<Integer> st = new Stack<>();

//     int n = q.size();
    

//     //half ele ko queue se stack me daalo
//     for(int i = 1;i<=n/2;i++){
//         st.push(q.remove());
//     }

//     //ab stack se queue me daalo
//     while(st.size()>0){
//         q.add(st.pop());
//     }
     
//     //ab fir se queue se stack
//     for(int i=1;i<=n/2;i++){
//         st.push(q.remove());
//     }

//     //st se remove and q se add&remove

//     while(st.size()>0){
//         q.add(st.pop());
//         q.add(q.remove());
//     }

//     //now reverse the stack
//     while(q.size()>0){
//         st.push(q.remove());
//     }
//     while(st.size()>0){
//         q.add(st.pop());
//     }

//     return q;
// }