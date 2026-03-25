# 📚 Study Time Tracker (Java OOP Project)

## 🚀 Overview

The Study Time Tracker is a console-based Java application that helps users track their daily study sessions. It allows users to log study time, view sessions, analyze subject-wise performance, and set daily study goals.

---

## 🎯 Features

* Add study sessions (subject, duration, date)
* View all sessions
* Calculate total study time
* Subject-wise time tracking
* Set and check daily study goals

---

## 🛠️ Prerequisites

Make sure you have:

* Java JDK (version 8 or above)
* Any code editor (VS Code / IntelliJ)

To check Java installation:

```bash
java -version
```

---

## ⚙️ How to Run the Project

### 1. Clone the Repository

```bash
git clone <your-repo-link>
cd StudyTracker
```

---

### 2. Compile the Code

👉 For Windows (PowerShell):

```bash
javac model/*.java service/*.java main/*.java
```

👉 For Command Prompt:

```bash
javac model\Subject.java model\StudySession.java service\TrackerService.java main\Main.java
```

---

### 3. Run the Application

```bash
java main.Main
```

---

## 🧪 How to Use

When you run the program, you will see:

```
1. Add Session
2. Show Sessions
3. Total Time
4. Subject-wise Time
5. Set Daily Goal
6. Check Goal
7. Exit
```

### Example:

1. Choose `1` → Add Session

2. Enter:

   * Subject: Math
   * Duration: 60
   * Date: 2026-03-25

3. Choose `3` → View total time

4. Choose `4` → View subject-wise time

5. Choose `5` → Set goal (e.g., 120 minutes)

6. Choose `6` → Check goal

---

## 📂 Project Structure

```
StudyTracker/
├── model/
│   ├── Subject.java
│   ├── StudySession.java
├── service/
│   ├── TrackerService.java
├── main/
│   ├── Main.java
```

---

## 🧠 Concepts Used

* Object-Oriented Programming (OOP)
* Encapsulation
* ArrayList
* HashMap
* Java Packages

---

## 🚧 Future Improvements

* Save data to file
* GUI interface
* Data visualization

---

## 👨‍💻 Author

Ujjawal Rai

---




