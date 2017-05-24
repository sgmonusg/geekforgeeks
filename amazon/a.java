class node{
	int data ;
	node left;
	node right;
	public node(int data){
		this.data = data;
		left = null;
		right = null;
	}
}
class bst{
	boolean ismirror(node a  , node b){
		if(a == null && b ==null){
			return true;
		}	
		else if(a == null && b != null || a!= null && b == null){
			return false;
		}
		else{
			if(a.data == b.data && ismirror(a.left , b.right) && ismirror(a.right , b.left)){
				return true;
		}
	}
	return false;
	}
	int sum(node a){
		if(node == null){
			return 0;
		}
		return sum(a.left) + a.data + sum(a.right);
	}
	boolean issumtree(node a){
		if(a == null || (a.left == null && a.right ==null)){
			return true;
		}
		else{
			if((a.data == sum(a.left)+sum(a.right)) && (issumtree(a.left)!= 0 )&& (issumtree(a.right)!= 0)){
				return true;
			}
		}
		return false;

	}

}
public class a{
	public static void main(){

	}
}

