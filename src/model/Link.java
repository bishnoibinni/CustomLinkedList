package model;

/**
 * This class will work as the base model for the Custom Linked List
 */
public class Link {

    private Link nextLinkedListElement;
    private Integer inputData;

    public Link(Integer data, Link link) {
        this.setInputData(data);
        this.setNextLinkedListElement(link);
    }

    public Link getNextLinkedListElement() {
        return nextLinkedListElement;
    }

    public void setNextLinkedListElement(Link nextLinkedListElement) {
        this.nextLinkedListElement = nextLinkedListElement;
    }

    public Integer getInputData() {
        return inputData;
    }

    public void setInputData(Integer inputData) {
        this.inputData = inputData;
    }

}
