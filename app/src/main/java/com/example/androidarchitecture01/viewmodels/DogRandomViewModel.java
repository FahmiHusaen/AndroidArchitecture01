package com.example.androidarchitecture01.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.androidarchitecture01.models.DogRandomResponse;
import com.example.androidarchitecture01.models.DogRepository;

public class DogRandomViewModel extends AndroidViewModel {
    private DogRepository dogRepository = new DogRepository();

    public LiveData<DogRandomResponse> getDogRandomLiveData(){
        return dogRandomLiveData;
    }

    private LiveData<DogRandomResponse> dogRandomLiveData;

    public DogRandomViewModel(@NonNull Application application) {
        super(application);
        dogRandomLiveData = dogRepository.getDogLiveData();
    }

    public void fetchDogData(){
        dogRandomLiveData = dogRepository.getRandomDogData();
    }
}
