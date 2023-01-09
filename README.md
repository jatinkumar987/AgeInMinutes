# AgeInMinutes

## Code Explaination
This code is for an Android app written in Kotlin. It appears to be a simple app that allows the user to select a date using a DatePickerDialog and displays the selected date and the difference in minutes between the selected date and the current date.

The app has a single activity, MainActivity, which is created when the app is launched. The activity sets its content view to a layout file called activity_main, which is where the user interface elements are defined.

The user can select a date by clicking a button, which is defined in the layout file and referred to as btnClickMe in the code. When the button is clicked, it calls the clickDatePicker() function, which creates and displays a DatePickerDialog to the user. The user can then select a date using the dialog.

Once the user has selected a date, the clickDatePicker() function displays a toast message showing the chosen year, month, and day, and sets the text of two TextView elements in the layout to the selected date and the difference in minutes between the selected date and the current date. The difference in minutes is calculated by converting both the selected date and the current date to the number of minutes since the epoch (midnight UTC on January 1, 1970), and then subtracting the selected date's value from the current date's value.



































> [](url)
![photo_2023-01-07_13-26-16](https://user-images.githubusercontent.com/76620715/211140510-c1192b92-1e79-4a2e-be15-b1cdd8c37ff9.jpg)
