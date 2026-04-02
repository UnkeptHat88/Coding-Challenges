package leet_code

fun main() {
    val l1 = ListNode(2, ListNode(4, ListNode(3)))
    val l2 = ListNode(5, ListNode(6, ListNode(4)))


}

class ListNode {
    val `val`: Int
    var next: ListNode? = null

    internal constructor(`val`: Int) {
        this.`val` = `val`
    }

    internal constructor(`val`: Int, next: ListNode?) {
        this.`val` = `val`
        this.next = next
    }
}

fun addTwoNumbers(o1: ListNode, o2: ListNode): ListNode? {
    var l1: ListNode? = o1
    var l2: ListNode? = o2

    var carry = 0
    var total: Int

    var dummy = ListNode(0)
    val res = dummy

    while (l1 != null || l2 != null || carry != 0) {
        total = carry

        if (l1 != null) {
            total += l1.`val`
            l1 = l1.next
        }

        if (l2 != null) {
            total += l2.`val`
            l2 = l2.next
        }

        val num = total % 10
        carry = total / 10
        dummy.next = ListNode(num)
        dummy = dummy.next!!
    }

    return res.next
}