package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int maxStation = 9;
    private int quantityStation = 10;
    private int currentVolume;
    private int maxVolume = 100;

    public Radio() {
    }

    public Radio(int quantityStation) {
        this.quantityStation = quantityStation;

    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getQuantityStation() {
        return quantityStation;
    }

    public void setCurrentStation(int newcurrentStation) {
        if (newcurrentStation < 0) {
            return;
        }
        if (newcurrentStation > maxStation) {
            return;
        }
        this.currentStation = newcurrentStation;
    }

    public void next() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        this.currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else currentVolume = maxVolume;
    }

    public void turnDownVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else currentVolume = 0;

    }
}



