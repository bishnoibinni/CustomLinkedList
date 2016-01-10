package model;

/**
 * All the processing of the linked list will be carried on in this file.
 */
public class CustomLinkedList {

    //Keep one object type of Link in the CustomLinkedList
    private Link customLink;

    public void create(Integer data) {
        Link currentCustomLinkedList = getCustomLink();
        if (null == currentCustomLinkedList) {
            setCustomLink(new Link(data, null));
        } else {
            boolean isEligibleForInsertion = true;
            if (data < currentCustomLinkedList.getInputData()) {
                setCustomLink(new Link(data, currentCustomLinkedList));
            } else {
                Link currentTempCustomLinkList = currentCustomLinkedList.getNextLinkedListElement();
                while (null != currentTempCustomLinkList && isEligibleForInsertion) {
                    if (data < currentTempCustomLinkList.getInputData()) {
                        isEligibleForInsertion = false;
                    } else {
                        currentCustomLinkedList = currentTempCustomLinkList;
                        currentTempCustomLinkList = currentCustomLinkedList.getNextLinkedListElement();
                    }
                }
                if (!isEligibleForInsertion) {
                    currentCustomLinkedList.setNextLinkedListElement(new Link(data, currentTempCustomLinkList));
                } else {
                    currentCustomLinkedList.setNextLinkedListElement(new Link(data, null));
                }
            }
        }
    }

    public Link getCustomLink() {
        return customLink;
    }

    public void setCustomLink(Link customLink) {
        this.customLink = customLink;
    }
}
