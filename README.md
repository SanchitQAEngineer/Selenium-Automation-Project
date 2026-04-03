# 🧪 Selenium Automation Project — SauceDemo

![Java](https://img.shields.io/badge/Java-17-orange?style=flat&logo=java)
![Selenium](https://img.shields.io/badge/Selenium-4.x-green?style=flat&logo=selenium)
![TestNG](https://img.shields.io/badge/TestNG-7.x-red?style=flat)
![Maven](https://img.shields.io/badge/Maven-Build-blue?style=flat&logo=apachemaven)
![Status](https://img.shields.io/badge/Status-Active-brightgreen)

> Automated testing framework for the **SauceDemo** e-commerce website using Selenium WebDriver, Java, and TestNG. Covers login, invalid login, logout, cart, and checkout functionality with real bug reports and API test coverage.

---

## 🔗 Project Links

| Tool | Link |
|------|------|
| 🐛 Bug Tracking (Jira) | [QA Automation Project on Jira](https://sanchitmathur7.atlassian.net) |
| 🌐 Application Under Test | [saucedemo.com](https://www.saucedemo.com) |

---

## 📁 Project Structure

```
Selenium-Automation-Project/
│
├── src/
│   ├── test/java/
│   │   ├── LoginTest.java           # Valid login test
│   │   ├── InvalidLoginTest.java    # Invalid login & error message test
│   │   └── LogoutTest.java          # Logout functionality test
│   └── main/
│
├── Bug Report.xlsx                  # Manual bug report with real defects
├── SauceDemo.xlsx                   # Manual test cases in Excel format
├── API Testing Project.postman_collection.json  # Postman API tests
├── pom.xml                          # Maven dependencies
└── testng.xml                       # TestNG test suite configuration
```

---

## 🤖 Automated Test Cases

| Test File | What It Tests | Related Jira Bug |
|-----------|--------------|-----------------|
| `LoginTest.java` | Valid login → should navigate to dashboard | QAP-1 |
| `InvalidLoginTest.java` | Invalid login → should show error message | QAP-2 |
| `LogoutTest.java` | Logout → should return to login page | - |

---

## 🐛 Bugs Found (Jira — QAP)

| Jira ID | Bug | Priority |
|---------|-----|----------|
| QAP-1 | Login button not responding on valid credentials | 🔴 High |
| QAP-2 | Error message not displayed for invalid login | 🔴 High |
| QAP-3 | Password field visible instead of masked | 🔴 High |
| QAP-4 | Add to Cart button not adding product | 🟡 Medium |
| QAP-5 | Cart items removed after page refresh | 🔴 High |

---

## 🛠️ Tech Stack

| Technology | Purpose |
|-----------|---------|
| Java | Programming language |
| Selenium WebDriver | Browser automation |
| TestNG | Test framework |
| Maven | Build & dependency management |
| Postman | API testing |
| Jira | Bug tracking & project management |
| Excel | Test cases & bug reports |

---

## ▶️ How to Run Tests

### Prerequisites
- Java JDK 17+
- Maven installed
- Google Chrome installed

### Steps

```bash
# 1. Clone the repository
git clone https://github.com/SanchitQAEngineer/Selenium-Automation-Project.git

# 2. Navigate to project folder
cd Selenium-Automation-Project

# 3. Run all tests
mvn test

# 4. Run specific test suite
mvn test -Dsurefire.suiteXmlFiles=testng.xml
```

---

## 🔌 API Testing (Postman)

- ✅ Created API test collection using Postman
- ✅ Performed GET and POST request validation
- ✅ Implemented test scripts for status and response validation
- ✅ Included negative test scenarios
- 📁 Collection file: `API Testing Project.postman_collection.json`

---

## 📊 Manual Testing

- ✅ Test Cases documented in `SauceDemo.xlsx`
- ✅ Bug Report with real defects in `Bug Report.xlsx`
- ✅ Covers Login, Cart, and Checkout modules

---

## 👤 Author

**Sanchit Mathur** — QA Engineer
📧 sanchitmathur7@gmail.com
🔗 [LinkedIn](https://www.linkedin.com/in/sanchit-mathur-qa)
🐙 [GitHub](https://github.com/SanchitQAEngineer)

---

⭐ If you found this project helpful, please give it a star!
