public class MergeTwoSortedLists {

  public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
      val = x;
    }
  }

  public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode node1 = l1;
    ListNode node2 = l2;
    // step 1 先判断非空
    if (l1 == null) {
      return l2;
    } else if (l2 == null) {
      return l1;
    }
    ListNode next;
    ListNode result;
    if (l1.val < l2.val) {
      result = l1;
    } else {
      result = l2;
    }

    while (node1 != null) {
      while (node2 != null) {
        if (node1.val > node2.val) {
          result = node2;
          node2 = node2.next;
        } else {
          result = node1;
          node1 = node1.next;
          break;
        }
      }
    }
    return null;
  }
}
