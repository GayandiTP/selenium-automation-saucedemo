# Saucedemo Automation Script

## Overview
This project is a Selenium-based automation script that performs end-to-end testing on the SauceDemo website. The script automates the login process, adds a product to the cart, proceeds through checkout, and logs out successfully.

## Prerequisites
Ensure you have the following installed before running the script:
- **Java (JDK 8 or later)**
- **Selenium WebDriver**
- **Google Chrome**
- **ChromeDriver**

## Installation
1. Download and install [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html).
2. Download and install [Google Chrome](https://www.google.com/chrome/).
3. Download the corresponding [ChromeDriver](https://chromedriver.chromium.org/downloads) and set the system path.
4. Add Selenium dependencies to your Java project.

## How to Run the Script
1. Clone this repository or download the script file.
2. Open the project in an IDE such as **IntelliJ IDEA** or **Eclipse**.
3. Ensure **ChromeDriver** is properly configured in your system.
4. Run the `Saucedemo.java` file.

## Test Workflow
The script performs the following automated actions:
1. **Opens** the SauceDemo website.
2. **Logs in** using the credentials:
   - **Username:** `standard_user`
   - **Password:** `secret_sauce`
3. **Selects a product** and adds it to the cart.
4. **Proceeds to checkout** and fills in personal details.
5. **Completes the purchase.**
6. **Logs out** and closes the browser.

## Expected Output
After running the script, the console should display:
```plaintext
Test completed successfully.
```
This indicates the test execution was successful.

## Notes
- Ensure **ChromeDriver** version matches your **Chrome** browser version.

## Author
**Gayandi Panditharathna**

---
