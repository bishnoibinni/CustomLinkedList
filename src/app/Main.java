package app;

import model.CustomLinkedList;
import model.Link;

public class Main {

    private static CustomLinkedList customLinkedListFirst = null;
    private static CustomLinkedList customLinkedListSecond = null;
    private static CustomLinkedList customLinkedListSorted = null;

    public static void main(String[] args) {
        //initialise
        customLinkedListFirst = new CustomLinkedList();

        // insert 1st element into the linked list
        customLinkedListFirst.create(2);

        //verify the first data insert in successful
        if (null != customLinkedListFirst && customLinkedListFirst.getCustomLink().getInputData().equals(2)
                && null == customLinkedListFirst.getCustomLink().getNextLinkedListElement()) {
            System.out.println("First Data insert is successful");
        }
        // insert second data
        customLinkedListFirst.create(3);
        //verify the second data insert in successful
        if (null != customLinkedListFirst && customLinkedListFirst.getCustomLink().getNextLinkedListElement().getInputData().equals(3)
                && null == customLinkedListFirst.getCustomLink().getNextLinkedListElement().getNextLinkedListElement()) {
            System.out.println("Second Data insert is successful");
        } else {
            System.out.println("Second Data insert is not successful");
        }

        // now multiple data insert in custom linked list
        customLinkedListSecond = new CustomLinkedList();
        customLinkedListSecond.create(15);
        customLinkedListSecond.create(115);
        customLinkedListSecond.create(111115);
        customLinkedListSecond.create(1115);
        customLinkedListSecond.create(111111115);
        customLinkedListSecond.create(11115);
        customLinkedListSecond.create(111115);
        customLinkedListSecond.create(11111115);
        customLinkedListSecond.create(1111111115);
        customLinkedListSecond.create(5);

        // verify the multiple data insert values in the console print

        Link link = customLinkedListSecond.getCustomLink();
        while (null != link) {
            System.out.println("Integer data in the custom linked list is : " + link.getInputData());
            link = link.getNextLinkedListElement();
        }


        // now sorted linked list data
        customLinkedListSorted = new CustomLinkedList();
        // one after another insertion
        customLinkedListSorted.create(3);
        customLinkedListSorted.create(4);

        // insertion in the beginning
        customLinkedListSorted.create(1);

        // insertion in the middle at the 2nd node
        customLinkedListSorted.create(2);

        Link linkSorted = customLinkedListSorted.getCustomLink();
        while (null != linkSorted) {
            System.out.println("Integer data in the custom linked list is : " + linkSorted.getInputData());
            linkSorted = linkSorted.getNextLinkedListElement();
        }
    }
}