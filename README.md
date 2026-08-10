# 🔤 Text ↔ Morse Code Converter

A simple **Java console-based application** that converts normal English text into Morse Code and decodes Morse Code back into readable text.

This project was built to practice **Java fundamentals, arrays, loops, methods, string manipulation, and linear search**.

---

## ✨ Key Features

* 🔤 **Text → Morse Code**

  * Converts English letters into their corresponding Morse Code.
  * Supports spaces between words.

* 📡 **Morse Code → Text**

  * Converts Morse Code back into English letters.
  * Uses `/` to separate words.

* 🔎 **Linear Search**

  * Searches for each character/Morse code using linear search.
  * Demonstrates array indexing and parallel arrays.

* 🧩 **Menu-Driven Console Interface**

  * Text to Morse
  * Morse to Text
  * Exit

* ⚠️ **Invalid Input Handling**

  * Displays `Not found` when a character or Morse code doesn't exist in the predefined mapping.

---

## 🛠️ Technologies Used

* **Java**
* **Java Arrays**
* **String & String Methods**
* **Loops**
* **Methods**
* **Linear Search**
* **Scanner for User Input**

---

## 📂 Project Structure

```text
Text-Morse-Converter/
│
├── Main.java
└── README.md
```

---

## ⚙️ How It Works

The project uses two parallel arrays:

```java
char[] arr = {'A', 'B', 'C', ...};

String[] morse = {".-", "-...", "-.-.", ...};
```

Both arrays use the **same index** for mapping.

For example:

```text
arr[0]   → 'A'
morse[0] → ".-"

arr[7]   → 'H'
morse[7] → "...."
```

### Text → Morse

The program takes each character from the input text and searches for it in the `arr[]` array.

When a match is found at index `j`:

```text
arr[j] → morse[j]
```

### Morse → Text

The program first separates words using:

```text
" / "
```

Then it separates individual Morse codes using spaces.

Each Morse code is searched inside `morse[]`.

When a match is found at index `k`:

```text
morse[k] → arr[k]
```

---

## 🚀 Getting Started

### 1. Clone the Repository

Open your terminal and run:

```bash
git clone <YOUR_GITHUB_REPOSITORY_URL>
```

Replace `<YOUR_GITHUB_REPOSITORY_URL>` with your GitHub repository URL.

Example:

```bash
git clone https://github.com/your-username/text-morse-converter.git
```

---

### 2. Navigate to the Project

```bash
cd text-morse-converter
```

---

### 3. Compile the Java Program

```bash
javac Main.java
```

---

### 4. Run the Program

```bash
java Main
```

---

## 💻 Example

### Text → Morse

```text
1. Text to Morse
2. Morse to Text
3. Exit

Choose a number between (1 to 3): 1

Enter text: Gaurav Kumar

--. .- ..- .-. .- ...- / -.- ..- -- .- .-.
```

### Morse → Text

```text
1. Text to Morse
2. Morse to Text
3. Exit

Choose a number between (1 to 3): 2

Enter morse: --. .- ..- .-. .- ...- / -.- ..- -- .- .-.

GAURAV KUMAR
```

---

## 🧠 Concepts Practiced

This project helped practice:

* Java methods
* Arrays
* Nested loops
* String manipulation
* `charAt()`
* `split()`
* `.equals()`
* Boolean flags
* Linear search
* Array indexing
* Menu-driven programs
* User input using `Scanner`

---

## 📈 Future Improvements

Possible improvements for future versions:

* Support lowercase letters automatically
* Support numbers `0–9`
* Support punctuation marks
* Improve invalid Morse-code handling
* Replace linear search with a `HashMap` for faster lookup
* Create a GUI/Web version
* Add unit tests

---

## 👨‍💻 Author

**Gaurav**

Built as part of my Java & DSA learning journey.

---

## ⭐ Support

If you find this project useful, consider giving the repository a ⭐ on GitHub.
