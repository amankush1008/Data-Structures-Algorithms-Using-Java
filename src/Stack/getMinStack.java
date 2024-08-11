package stack;
import java.util.Stack;
public class getMinStack {
	public static Stack<Integer> pushFunc(int arr[],int n){
		Stack<Integer>s=new Stack<>();
		s.push(arr[0]);
		for(int i=1;i<n;i++) {
			int curr=arr[i];
			int prevMin=s.peek();
			int min=Math.max(prevMin, curr);
			s.push(min);
			}
		return s;
		
	}
	
	static void getMinPop(Stack<Integer>s) {
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int n=arr.length;
		System.out.println(pushFunc(arr,n));
		
	}

}
