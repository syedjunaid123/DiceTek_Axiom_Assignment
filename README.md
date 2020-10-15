# Mobile Automation Using - Appium + TestNG + Maven

Some of the basic testing enhancement were implemented, to make this more better for maintenance of the test scripts, and to make it more reliable and Utilisable.

## Below is the basic description of the Project:

- **Configuration:** All the Desired Capabilities to Launch the Application in an Emulator is Initialised from this package.
				 The Capabilities configuration is stored in a **"config.properties"** file seperately.
				 
- **Object Repository:** A seperate class is created to pull all the locators from properties file and pass them to the test methods. 
					 All the Locators are stored in one page in **"locators.properties"** file.
					 
- **Pages:** Page Object Model Design pattern is followed, where every mobile screen has a seperate Class file. With which we have a combination of 9 page files.

- **Tests:** A test class is added to run the test cases, TestNG annotations are used to trigger and end the test case.

- **pom.XML:** Maven is used as a project building tool, and all the project dependencies are added here.

- **ExtentReport:** As part of Reporting, Extent Report has been introduced in the framework. After every Script run, the report will be generated based on timestamp and itts accessibled under **"test/resources"** folder.

- **Log4J:** To get the exact flow in console while the script is executed, a logging tool as also been implemented.




## Pre-requisites to be installed before proceeding:

1. JDK (Latest Java SE)
2. Eclipse IDE or IntelliJ IDE
3. Android Studio(SDK)
4. Device AVD downloaded
5. Appium Server Setup

## Steps to Proceed:

1. Clone the project from the Git Repo: 
	>https://github.com/syedjunaid123/DiceTek_Axiom_Assignment.git
	
2. If the Maven has not automatically started downloading the dependecies, then you can run the below command.
	>mvn package

3. Update the below details as per the AVD Emulator downloaded or your physical Device.
 	>PLATFORM_NAME = Android

	>PLATFORM_VERSION = 10

	>DEVICE_NAME = Android SDK built for x86_64

	>UDID = emulator-5554
	
	UDID can be fetched by running command **adb devices**
	
Thats it. Now all good to trigger the App and run tthe test.
