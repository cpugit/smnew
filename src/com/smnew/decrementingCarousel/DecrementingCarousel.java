package com.smnew.decrementingCarousel;

public class DecrementingCarousel {

    private int[] elements;
    private int size = 0;
    private boolean isRunning = false;

    public DecrementingCarousel(int capacity) {
        elements = new int[capacity];
    }

    public boolean addElement(int element) {
        if (isRunning || element <= 0 || size >= elements.length) {
            return false;
        }
        elements[size++] = element;
        return true;
    }

    public CarouselRun run() {
        if (isRunning) {
            return null;
        }
        isRunning = true;
        return new CarouselRun(elements, size);
    }
}


