
public class AddTwoNumbers_2 {

	public static void main(String[] args) {
		ListNode node3 = new ListNode(3);
		ListNode node2 = new ListNode(4, node3);
		ListNode node1 = new ListNode(2, node2);

		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(6, node4);
		ListNode node6 = new ListNode(5, node5);

		ListNode result = addTwoNumbers(node1, node6);

		System.out.println(result);
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

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
