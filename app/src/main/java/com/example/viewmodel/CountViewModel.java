package com.example.viewmodel;

import androidx.lifecycle.ViewModel;

public class CountViewModel extends ViewModel {
    int countNumber = 0;

    void numberAdd() {
        countNumber += 1;
    }

    void numberMinus() {
        countNumber -= 1;
    }

}
