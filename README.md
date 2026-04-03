# 🧪 Selenium Automation Project — SauceDemo

![Java](https://img.shields.io/badge/Java-17-orange?style=flat&logo=java)
![Selenium](https://img.shields.io/badge/Selenium-4.x-green?style=flat&logo=selenium)
![TestNG](https://img.shields.io/badge/TestNG-7.x-red?style=flat)
![Maven](https://img.shields.io/badge/Maven-Build-blue?style=flat&logo=apachemaven)
![Status](https://img.shields.io/badge/Status-Active-brightgreen)

> Automated testing framework for the **SauceDemo** e-commerce website using Selenium WebDriver, Java, and TestNG. Covers login, cart, and checkout functionality with real bug reports and API test coverage.

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
│   └── test/java/
│       ├── pages/          # Page Object Model classes
│       ├── tests/          # Test classes
│       └── utils/          # Base setup & helpers
│
├── Bug Report.xlsx         # Manual bug report with real defects
├── SauceDemo.xlsx          # Manual test cases in Excel format
├── API Testing Project.postman_collection.json  # Postman API tests
├── Jira_Project            # Jira project reference
├── pom.xml                 # Maven dependencies
└── testng.xml              # TestNG test suite configuration
```

---

## 🐛 Bugs Found & Automated (Jira — QAP)

| Jira ID | Bug | Priority | Status |
|---------|-----|----------|--------|
| QAP-1 | Login button not responding on valid credentials | 🔴 High | To Do |
| QAP-2 | Error message not displayed for invalid login | 🔴 High | To Do |
| QAP-3 | Password field visible instead of masked | 🔴 High | To Do |
| QAP-4 | Add to Cart button not adding product | 🟡 Medium | To Do |
| QAP-5 | Cart items removed after page refresh | 🔴 High | To Do |

---

## 🛠️ Tech Stack

| Technology | Purpose |
|-----------|---------|
| Java 17 | Programming language |
| Selenium WebDriver 4.x | Browser automation |
| TestNG | Test framework |
| Maven | Build & dependency management |
| Postman | API testing |
| Jira | Bug tracking & project management |
| Excel (Apache POI) | Test data & bug reports |

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

## ⭐ If you found this project helpful, please give it a star!
