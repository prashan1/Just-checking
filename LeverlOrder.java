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
	
	// public static leverOrder( Node root ){
		// int height = Height( root );
		// for( int i = 1 ; i < h + 1 ; i++ )
			// printNode( root , i );
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
	
	
	
	
	she got the mercides benz she called friend 
	how they dance some sance to remembvere some sanc 
	please brigme
			
			
			
	
	
	}
	
	
	// public static int Height( Node root ){
		// int high1 = 0;
		// int high2 = 0;
		// if ( root == null )
			// return 0 ;
		
		// high1 = Height( root.left );
		// high2 = Height( root.right );
		
		// System.out.println( high1 + " " + high2);
		// return high1 > high2 ? high1  + 1: high2 + 1 ;
	// }
	
	
	
	
	
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
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

	 
	 
	 
	 public static int getCountOfNode(Node root,int l, int h)
{
    Queue< Node > q = new LinkedList<>();
    q.offer( root );
    int count = 0;
    while( !q.isEmpty() ){
        Node store = q.poll();
        if( store.data > l && store.data < h )
            count++;
        if( store.left != null )
            q.offer( store.left );
        if( store.right != null )
            q.offer( store.right );
    }
    return count ;
}

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
		
		
	
					
		