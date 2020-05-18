package LinkedList;

/**
 * 7 kyu - Linked Lists - Append
 * @author Jiayu Zhang
 * @version 2020-05-16
 * 
 * Linked Lists - Append
 * Write an Append() function which appends one linked list to another. 
 * The head of the resulting list should be returned.
 *
 * var listA = 1 -> 2 -> 3 -> null
 * var listB = 4 -> 5 -> 6 -> null
 * append(listA, listB) === 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
 * 
 * If both listA and listB are null/NULL/None/nil, return null/NULL/None/nil. 
 * If one list is null/NULL/None/nil and the other is not, simply return the non-null/NULL/None/nil list.
 * 
 * All the linked list related challenges can be found here:
 * https://www.codewars.com/kata/55d17ddd6d7868493e000074
 */
class Node {

	int data;
	Node next = null;

	Node(final int data) {
		this.data = data;
	}

	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	public static Node append(Node listA, Node listB) {
		 if (listA == null && listB == null) {
		      return null;
		    } else if (listA != null && listB != null) {
		      Node last = listA;
		      while (last.next != null) {
		        last = last.next;
		      }
		      last.next = listB;
		      return listA;
		    }
		    return listA != null ? listA : listB;
		  }
	
}

/**
 * import static org.junit.Assert.assertNull;

import org.junit.Test;

public class NodeTest {

  @Test
  public void twoEmpty() throws Exception {
    assertNull( Node.append( null, null ) );
  }

  @Test
  public void oneEmpty() throws Exception {
    NodeHelper.assertEquals( Node.append( null, new Node( 1 ) ), new Node( 1 ) );
    NodeHelper.assertEquals( Node.append( new Node( 1 ), null ), new Node( 1 ) );
  }

  @Test
  public void oneOne() throws Exception {
    NodeHelper.assertEquals( Node.append( new Node( 1 ), new Node( 2 ) ), NodeHelper.build( new int[] { 1, 2 } ) );
    NodeHelper.assertEquals( Node.append( new Node( 2 ), new Node( 1 ) ), NodeHelper.build( new int[] { 2, 1 } ) );
  }

  @Test
  public void bigLists() throws Exception {
    NodeHelper.assertEquals(
        Node.append( NodeHelper.build( new int[] { 1, 2 } ), NodeHelper.build( new int[] { 3, 4 } ) ),
        NodeHelper.build( new int[] { 1, 2, 3, 4 } )
    );
    NodeHelper.assertEquals(
        Node.append( NodeHelper.build( new int[] { 1, 2, 3, 4, 5 } ), NodeHelper.build( new int[] { 6, 7, 8 } ) ),
        NodeHelper.build( new int[] { 1, 2, 3, 4, 5, 6, 7, 8 } )
    );
  }

}
*/
