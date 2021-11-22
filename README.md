# View Model
ViewModel is a part of Android architecture component.

# About View Model
The ViewModel class is designed to store and manage UI-related data in a lifecycle conscious way. The ViewModel class allows data to survive configuration changes
such as screen rotations. The Android framework manages the lifecycles of UI controllers, such as activities and fragments.

# What is the purpose of ViewModel in Android?
The purpose of the ViewModel is to acquire and keep the information that is necessary for an Activity or a Fragment. The Activity or the Fragment
should be able to observe changes in the ViewModel. ViewModels usually expose this information via LiveData or Android Data Binding.

# The lifecycle of a ViewModel 

![viewmodel-lifecycle](https://user-images.githubusercontent.com/35636662/142910443-b98bfeea-fd07-4697-9c1c-1c1578888d6d.png)

# Dependencies

     #ViewModel 
     def lifecycle_version = "2.4.0"
     implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"

# Implematation
    
   Create View Model Class: 
   
                    public class MainViewModel extends ViewModel {
                         //body
                         //acquire and keep the information that is necessary for an Activity or a Fragment
                    }
   
   Create a object of View Model in Activity.which will provide view model for store and manage UI-related data: 
                    
                   //View Model life cycle aware .we pass (this).so, View Model can see the Activity
                   MainViewModel mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);
                    
   
# Reference

  https://developer.android.com/topic/libraries/architecture/viewmodel

