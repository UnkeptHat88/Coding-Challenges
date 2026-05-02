package leet_code

import util.ListNode

fun main() {
    var a = mergeTwoLists(createLinearInput1(), createLinearInput2())
    while (a != null) {
        print("${a.`val`}-")
        a = a.next
    }
}

private fun createLinearInput1(): ListNode {
    val head = ListNode(10)
    head.next = ListNode(20)
    head.next!!.next = ListNode(30)
    // No cycle here, the last node's next is null
    return head
}

private fun createLinearInput2(): ListNode {
    val head = ListNode(15)
    head.next = ListNode(20)
    head.next!!.next = ListNode(25)
    // No cycle here, the last node's next is null
    return head
}

fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {

    val head = ListNode(0)
    var node: ListNode? = head
    var list1 = list1
    var list2 = list2

    var count = 0

    while (list1 != null || list2 != null) {
        if (count > 10) {
            break
        }

        println("${list1?.`val`}  ${list2?.`val`}")
        if (list1 == null) {
            node!!.next = list2
            node = node.next
            list2 = list2!!.next
        } else if (list2 == null) {
            node!!.next = list1
            node = node.next
            list1 = list1.next
        } else {
            if (list1.`val` > list2.`val`) {
                node!!.next = list2
                node = node.next
                list2 = list2.next
            } else if (list1.`val` < list2.`val`) {
                node!!.next = list1
                node = node.next
                list1 = list1.next
            } else {
                node!!.next = list2
                node = node.next
                list2 = list2.next

                node!!.next = list1
                node = node.next
                list1 = list1.next
            }
        }

        count += 1
    }

    return head.next
}