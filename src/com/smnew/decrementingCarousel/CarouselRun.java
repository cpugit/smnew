package com.smnew.decrementingCarousel;

public class CarouselRun {
    private int[] elements;
    private int size;
    private int currentIndex = 0;

    public CarouselRun(int[] elements, int size) {
        this.elements = elements;
        this.size = size;
    }

    public int next() {
        if (isFinished()) {
            return -1;
        }

        int checked = 0;

        while (checked < size) {
            if (elements[currentIndex] > 0) {
                int value = elements[currentIndex];
                elements[currentIndex]--;

                currentIndex = (currentIndex + 1) % size;
                return value;
            }

            currentIndex = (currentIndex + 1) % size;
            checked++;
        }

        return -1;
    }

    public boolean isFinished() {
        for (int i = 0; i < size; i++) {
            if (elements[i] > 0) {
                return false;
            }
        }
        return true;
    }

}

