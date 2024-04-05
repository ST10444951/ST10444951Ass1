#ST10444951RorisangMfolo
IMAD5112 Assignment 1

**1.PURPOSE:**

The main purpose of the app is to educate students on past historical
figures or events in an imaginative and creative way. The app is meant
to serve as a way to provide students, or even those who are interested,
with access to information on history while attempting to engage their
minds and build a deeper and more personal connection to historical
figures that helped shape our present. The app installs Interactive
learning which helps students develop critical thinking skills and
problem-solving abilities as well increase the productivity of students
as it makes education more interesting. The target audience for the
following app is mainly aimed for Student who would like to explore
historical figures and have knowledge about the background of these
historical figures. This app makes it easier for teachers to have fun
with students while learning about information from the past which are
beneficial in stimulating their brain’s.

**2. DESIGN CONSIDERATION:**

**Intuitive design:**

My design is easy to follow, as I have used title colours which are
easily visible as well as using user friendly colours in the entire app,
which makes my app more readable and understandable.

**Content prioritisation:**

The interface elements presented in the app is in a clear and
straightforward manner, personal information is illustrated in a way
that is easy for a user to understand. Users can manage to navigate
through the app with out any problems as it accommodates different user
with different abilities.

**Legible Text Content:**

The font which I have used is Calibri, I have chosen this font as it is
easily readable as well as it is a well-recognised font, I have also
ensured that the text size (12) is large enough to be readable for all
the information that I have included on the app, so that it is easier to
interact with the necessary information.

**Make Interface Elements Clearly Visible**

The information on the app is visible, I have added spacing so that it
is easier to see the information on the app as well as the instructions
which have been provided. I have added constrains in order for all the
spacing to be equal and readable.

**Hand Position Control**

The buttons are easily reachable as well as spaced in a way that they
can be spotted, I have positioned them in a place where they are
understandable, I have placed it under the text view which ensures that
a user understands what is expected of them after they input their
information.

**Images**

I choose this image as it creates an historical feeling. The image is
visible and bright which adds an interesting element to the overall app
and gives it a meaning as well as this image represents old buildings
which gives the overall app an historical feeling. I have placed the
image in the middle of the app which ensure that it is seen which can
increase the overall engagement to the app as well as create interesting
conversations surrounding the app.

**3.** GitHub Actions for Automated Testing:

[<u>https://github.com/ST10444951/ST10444951Ass1</u>](https://github.com/ST10444951/ST10444951Ass1)

Set up GitHub Actions to automatically run tests and build your code
whenever changes are pushed to the repository.

Create a GitHub Actions workflow (.github/workflows/tests.yml) to run
tests automatically on every push:

Create a .github/workflows directory in your project repository.

Inside this directory, create YAML files defining your GitHub Actions
workflows for testing and building.

**Sample GitHub Actions Workflow for Testing (tests.yml):**

name: Run Tests

on: \[push\]

jobs:

test:

runs-on: ubuntu-latest

steps:

\- name: Set up JDK

uses: actions/setup-java@v2

with:

distribution: 'adopt'

java-version: '11'

\- name: Check out code

uses: actions/checkout@v2

\- name: Build and test

run: ./gradlew test

Set Up Automated Build:

Create a GitHub Actions workflow (.github/workflows/build.yml) to build
the APK automatically on every push.

**Sample GitHub Actions Workflow for Building (build.yml):**

name: Build APK

on: \[push\]

jobs:

build:

runs-on: ubuntu-latest

steps:

\- name: Set up JDK

uses: actions/setup-java@v2

with:

distribution: 'adopt'

java-version: '11'

\- name: Check out code

uses: actions/checkout@v2

\- name: Build APK

run: ./gradlew assembleDebug

Test your workflows by pushing changes to your repository and observing
the actions running in the "Actions" tab on GitHub.

Create GitHub Actions Workflow Files:

Inside your project repository, create a .github/workflows directory.

Inside this directory, create two YAML files: tests.yml and build.yml.

Copy the sample workflows provided above into their respective files.

Update Gradle Configuration:

Ensure that your Gradle configuration includes necessary dependencies
and settings for testing and building your Android project.

Commit and Push:

Commit your changes to the repository.

Push the changes to GitHub.

Test Workflows:

Open your GitHub repository in a browser.

Navigate to the "Actions" tab to observe the workflows running.

Push new changes to your repository to trigger the workflows and observe
the results.

Here's how you can do these steps within Android Studio:

Creating GitHub Actions Workflow Files:

Open your Android Studio project.

In the project explorer, navigate to the root directory of your project.

Right-click and choose "New" -> "Directory" to create the .github
directory.

Inside the .github directory, create another directory named workflows.

Right-click on the workflows directory and choose "New" -> "File".

Name the file tests.yml and paste the sample workflow content into it.

Repeat the same process to create build.yml and paste the sample build
workflow content into it.

Update Gradle Configuration:

Open your build.gradle files (usually found under the app module and the
project's root).

Ensure that you have necessary dependencies and configurations for
testing and building.

For testing, make sure you have dependencies like JUnit configured.

For building, ensure that your build.gradle contains the necessary
configurations for assembling the APK. You may need to specify signing
configurations, flavors, etc., depending on your project setup.

Commit and Push:

Go to Android Studio's Version Control view (usually located on the
bottom right).

Select the changes you've made (.github directory, Gradle configuration
changes, etc.).

Write a commit message and click "Commit".

Push the changes to your GitHub repository.

Testing Workflows:

Open your GitHub repository in a browser.

Navigate to the "Actions" tab to monitor the workflows.

Push new changes to your repository from Android Studio or through the
GitHub web interface to trigger the workflows.

**4. YOUTUBE**

**[<u>https://youtu.be HYPERLINK "https://youtu.be/eseWkMTnDXc"/
HYPERLINK
"https://youtu.be/eseWkMTnDXc"eseWkMTnDXc</u>](https://youtu.be/eseWkMTnDXc)**

**5. Reference List**

A.Sicetsa. 2022.Tribute to Patric Shai. 22 Jan 2022.

\[Online\]. Available at:

[<u>Patrick Shai dies: Filmography, tributes, cause of death - Swisher
Post</u>](https://swisherpost.co.za/news/patrick-shai-cause-of-death-fimography-tributes/)

\[Accessed 14 March 2024\]

Crais, C. and Scully, P., 2008. Sara Baartman and the Hottentot Venus: A
ghost story and a biography. 31 Dec 2008

\[Online\]. Available at:

[<u>Sara Baartman and the Hottentot Venus
(degruyter.com)</u>](https://www.degruyter.com/document/doi/10.1515/9780691238357/html)

\[Accessed 14 March 2024\]

D.Samuel.2023Life story of the South African Movie Titan, 4 March 2023

\[Online\]. Available at:

[<u>Who Was Shona Ferguson? Biography and Life Story of the South
African Movie Titan
(answersafrica.com)</u>](https://answersafrica.com/who-was-shona-ferguson-biography-and-life-story-of-the-south-african-movie-titan.html)

\[Accessed 14 March 2024\]

Encyclopedia Britannica.2024. Black Consciousness Movement, 2 March 2024

\[Online\]. Available at:

[<u>Steve Biko | Biography, Education, Death, HYPERLINK
"https://www.britannica.com/biography/Steve-Biko"& HYPERLINK
"https://www.britannica.com/biography/Steve-Biko" Facts |
Britannica</u>](https://www.britannica.com/biography/Steve-Biko)

\[Accessed 14 March 2024\]

Encyclopedia Britannica.

2024\. South African Leader, 1 March 2024

\[Online\]. Available at:

[<u>Winnie Madikizela-Mandela | Biography, Death, HYPERLINK
"https://www.britannica.com/biography/Winnie-Madikizela-Mandela"&
HYPERLINK
"https://www.britannica.com/biography/Winnie-Madikizela-Mandela" Facts |
Britannica</u>](https://www.britannica.com/biography/Winnie-Madikizela-Mandela)

\[Accessed 15 March 2024\]

Encyclopedia Britannica.

2024\. South African archbishop, 27 Feb 2024

\[Online\]. Available at:

[<u>Desmond Tutu | Biography, Facts, HYPERLINK
"https://www.britannica.com/biography/Desmond-Tutu"& HYPERLINK
"https://www.britannica.com/biography/Desmond-Tutu" Nobel Peace Prize |
Britannica</u>](https://www.britannica.com/biography/Desmond-Tutu)

\[Accessed 15 March 2024\]

Encyclopedia Britannica. 2024.Queen of the United Kingdom, 11 March 2024

\[Online\]. Available at:

[<u>Elizabeth II | Biography, Family, Reign, HYPERLINK
"https://www.britannica.com/biography/Elizabeth-II"& HYPERLINK
"https://www.britannica.com/biography/Elizabeth-II" Facts |
Britannica</u>](https://www.britannica.com/biography/Elizabeth-II)

\[Accessed 15 March 2024\]

R.Vincent.2022

Biography of Michael Jackson. 25 April 2022

\[Online\]. Available at:

[<u>Michael Jackson | Biography, Albums, Songs, Thriller, Beat It,
HYPERLINK "https://www.britannica.com/biography/Michael-Jackson"&
HYPERLINK "https://www.britannica.com/biography/Michael-Jackson" Facts |
Britannica</u>](https://www.britannica.com/biography/Michael-Jackson)

\[Accessed 14 March 2024\]

T.Hauser.2024.

American boxer. 11 March 2024

\[Online\]. Available at:

[<u>Muhammad Ali | Biography, Bouts, Record, HYPERLINK
"https://www.britannica.com/biography/Muhammad-Ali-boxer"& HYPERLINK
"https://www.britannica.com/biography/Muhammad-Ali-boxer" Facts |
Britannica</u>](https://www.britannica.com/biography/Muhammad-Ali-boxer)

\[Accessed 15 March 2024\]
