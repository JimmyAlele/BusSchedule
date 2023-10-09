# Bus Schedule App
The Bus Schedule app displays a list of bus stops and arrival times. Tapping a bus stop on the first
screen will display a list of all arrival times for that particular stop. Built using Kotlin Jetpack
Compose, [Room database](https://developer.android.com/jetpack/androidx/releases/room).

The bus stops are stored in a Room database. Schedule items are represented by the `BusSchedule` class
and queries on the data table are made by the `BusScheduleDao` class. The app includes a view model to
access the `BusScheduleDao` and format data to be display in a list.

## Concepts Applied
- Kotlin Jetpack Compose
- Persisting data in Android
- Implementing Room Database in Android App
- Modern Android Design Architecture:
-  Implementing UI layer
- Implementing data layer (repositories, interfaces and room database)
- Manual dependency injection

## Final Application Screenshots
