package leet_code

import util.ListNode

fun main() {
    var a = reverseLinkedList(createLinearInput())
    while (a != null) {
        print("${a.`val`}-")
        a = a.next
    }
}

private fun createLinearInput(): ListNode {
    val head = ListNode(10)
    head.next = ListNode(20)
    head.next!!.next = ListNode(30)
    // No cycle here, the last node's next is null
    return head
}

fun reverseLinkedList(head: ListNode): ListNode? {
    var node: ListNode? = null
    var head: ListNode? = head

    while (head != null) {
        val temp = head.next
        head.next = node
        node = head
        head = temp
    }

    return node
}