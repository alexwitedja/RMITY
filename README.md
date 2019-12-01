# [RMITY Social App]

## RMITY Social App v1.2

### Access

**Our RMITY Social App is Travis CI/CD enabled, deployed onto Google App Engine and utilising Google Cloud SQL for database storage.**

**GAE instances is no longer running.

**https://inseption.appspot.com/** -- for frontend (client)

**https://inseption-backend.appspot.com/** -- for backend

### New Functionalities:

- Campus Map Functionality
  - Users are able to now navigate to the Campus Map to search for buildings.
    - Interact with the Google Map (click on marker to find buildings).
    - Get directions from the selected marker.
    - Go through a selection of buildings to find buildings.
    - Interact with events to find the building.
- Events functionality
  - All users are able to create an event to show other users what upcoming activities there will be.
    - Create an event that lists the time, date, building
    - If the organiser wishes to cancel, the user can delete event (strictly the person who created the event)

#### Updates

- Navigation Bar
  - Linking the Campus Map & Events onto the navigation bar

#### Existing Functionalities

- Account Registration 
- Account Login
- Todo Functionality 
- Profile Wall Functionality 
- Edit Profile Functionality 
- Search Functionality 

#### Removed Functionalities 

- ~~None~~ 
  - ~~We have not removed any functionalities as of now, however, we have refactored and explained
our source code.~~

#### Fixes

- RMIT Profile Photo
  - The photo had some sizing issues, where the circle becomes a 'weird' shape, but has now been fixed since then

- Search bar
  - Search results not aligned with Google Maps (Map covering the search results), but that has been fixed since then


## RMITY Social App v1.1

### Access

**Our RMITY Social App is now Travis CI/CD enabled, deployed onto Google App Engine and utilising Google Cloud SQL for database storage.**

**https://inseption.appspot.com/** -- for frontend (client)

**https://inseption-backend.appspot.com/** -- for backend

### New Functionalities:

- Profile Wall Functionality 
  - All existing users now have a customisable wall for their account which allows for other users to 
    - View profile
    - Wall commenting
    - Timetable scheduling
- Edit Profile Functionality 
  - All users are able to update their details when they wish to edit their profile.
- Search Functionality 
  - Users are able to search for other existing users within the application.
  - List of classmates will be displayed under the search bar.

#### Updates

- New UI updates 
  - RMITY has been updated to a modern approach in the application. With the new sleek and easy design, users are able to access the pages with ease.
- Home Page 
  - The home page has been modified for the users to easily access existing functionalities on the application
- Default Profile Pictures added
  - Users are given a default profile picture which can later be updated in the application

#### Existing Functionalities

- Account Registration 
- Account Login
- Todo Functionality 

#### Removed Functionalities 

- ~~Todo functionality~~ 
  - ~~The Todo functionality has been removed due to the new release of the timetable/scheduling functionality, which had made the Todo functionality redundant.~~

#### Bugs

- There are no known bugs at this moment of time.



## RMITY Social App v1.0

### Access

To access, ensure that maven is installed on your local machine. To run, simply:

- Import the *restful-web-services* folder on Eclipse as an existing Maven project.

- Run the *RestfulWebServicesApplication.java* as Java program to **start the backend server**.

  - *RestfulWebServicesApplication.java* can be found in: *restful-web-services/src/main/java/com/sept/rest/webservices/restfulwebservices/RestfulWebServicesApplication.java*

- Open terminal/command line and open the *frontend*/todo-app directory.

- Run the following command **only once** to install dependencies for node.js:

  ```bash
  npm install
  ```

- Finally, use the following command to **start the frontend server**:

  ```bash
  npm start
  ```

- Navigate to http://localhost:3000 on your web browser.

### Functionalities 

- Account Registration 
  - Users are now able to register for an account on the RMITY Social App. When registering, ensure that
    - A valid email address is being inputted in the email field (example@example.com)
    - When typing in the password, must ensure that the confirm password field matches with password 
- Account Login
  - Users are now able to log in to the RMITY Social App using the account that was used to register.
- Todo Functionality 
  - Users are able to create a list of tasks that they would like to do, and extra functionality to set a due date for the given tasks that are registered on the Todo list.

### Bugs

- Profile viewing bug
  - Although users are able to view the profile page, there are still some bugs on the page. There appears some modal boxes - when clicked will have no functionality. Users are not able to edit their profile page as of yet.