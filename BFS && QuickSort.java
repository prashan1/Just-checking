import java.util.*;
import java.util.LinkedList;
class Node{
	int data ;
	Node left;
	Node right ;
	public Node(int daa ){
		data = daa;
		left = null ;
		right = null;
	}
}
class LevelOrder {
	static Node root ;
	public LevelOrder(){
		root = null;
	}
	public static void main(String[] arg){
		LevelOrder tree = new LevelOrder();
		tree.root = new Node( 1 );
		tree.root.left = new Node( 2 );
		tree.root.right = new Node ( 3 );
		tree.root.left.left = new Node( 4 );
		tree.root.left.right = new Node( 5 );
		System.out.println( "The leverlorder traversal of this tree is ");
		 Level( root ); 
	}
	public static void Level( Node root ){
		   Queue<Node> queue = new LinkedList< Node >(); 
  
		queue.offer( root );
		while( !queue.isEmpty() ){
			Node tempNode=queue.poll();
			System.out.printf("%d ",tempNode.data);
			if(tempNode.left!=null)
				queue.add(tempNode.left);
			if(tempNode.right!=null)
				queue.add(tempNode.right);
			
		}	
	
	}
	
	

	
	 // QuickSort
	
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner e = new Scanner( System.in );
	 int test = e.nextInt();
	 while( test-- > 0 ){
	     int size = e.nextInt();
	     int[] a = new int[ size ];
	     for (int i = 0 ; i < size ; i++)
	      a[ i ] = e.nextInt();
	      
	      int k = e.nextInt();
	      
	     System.out.println( quickSort( a , 0 , a.length - 1, k));
	   }
	 }
	 public static  int quickSort( int[] a ,int low , int high, int k){
	     if( low < high ){
	     int pivot = findPivot( a , low , high);
	     if( pivot == k - 1)
	     return a[ pivot ];
	     
	     quickSort( a , low , pivot - 1 , k);
	     quickSort( a , pivot + 1 , high , k);
	 }
	 }
	 
	 public static int findPivot( int[] a , int low ,int high ){
	     
	     int pivot = a[ high ];
	     int i = low - 1;
	     for(int j = low ; j < high ; j++ ){
	      
	      if( a[ j ] <= pivot ){
	          i++;
	          int temp = a[ i ] ;
	          a[ i ] = a[ j ] ;
	          a[ j ] = temp;
	      }
	             
	     }
	     int temp = a[ i + 1 ];
	     a[ i + 1 ] = a[ high ];
	     a[ high ] = temp;
	     
	     return i + 1;
	 }
	     
	     
	     
 }
	 
	 
	
	 
	 
	 
	 
		
	
					
		
