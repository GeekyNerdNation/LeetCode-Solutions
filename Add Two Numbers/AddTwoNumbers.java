
public class AddTwoNumbers {

	public static void main(String[] args) {

		AddTwoNumbers objAddTwoNumbers = new AddTwoNumbers();

		ListNode nodeA = new ListNode(2);
		ListNode nodeB = new ListNode(4);
		ListNode nodeC = new ListNode(3);

		nodeA.next = nodeB;
		nodeB.next = nodeC;

		ListNode nodeX = new ListNode(5);
		ListNode nodeY = new ListNode(6);
		ListNode nodeZ = new ListNode(4);
		
		nodeX.next = nodeY;
		nodeY.next = nodeZ;

		ListNode result = objAddTwoNumbers.addTwoNumbers(nodeA, nodeX);

		while (result != null) {
			System.out.print(result.val);
			result = result.next;
			if (result != null) {
				System.out.print(" -> ");
			}
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		int carry = 0;
		ListNode result = null;
		ListNode head = null;

		while (l1 != null || l2 != null) {
			ListNode newNode = new ListNode();

			if (l1 != null && l2 == null) {
				newNode.val = (l1.val + carry) % 10;
				carry = (l1.val + carry) / 10;
				l1 = l1.next;
			} else if (l2 != null && l1 == null) {
				newNode.val = (l2.val + carry) % 10;
				carry = (l2.val + carry) / 10;
				l2 = l2.next;
			} else if (l1 != null && l2 != null) {
				newNode.val = (l1.val + l2.val + carry) % 10;
				carry = (l1.val + l2.val + carry) / 10;
				l1 = l1.next;
				l2 = l2.next;
			}
			if (result == null) {
				result = newNode;
				head = result;
			} else {
				result.next = newNode;
				result = result.next;
			}
		}

		if (carry > 0) {
			ListNode newNode = new ListNode(carry);
			result.next = newNode;
		}

		return head;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}
