
# Shortest Path in Strings 🧭

## 📌 Overview
This project demonstrates how to calculate the **shortest straight-line distance** from the origin `(0,0)` after following a sequence of directions represented as a string.  
The directions include:
- `N` → North (y++)
- `S` → South (y--)
- `E` → East (x++)
- `W` → West (x--)

---

## 🧩 Problem Statement
Given a string of directions (e.g., `"WNEEN"`), determine the shortest path length from the origin to the final coordinates using the Euclidean distance formula:

\[
\text{distance} = \sqrt{x^2 + y^2}
\]

---

## 📊 Example Walkthrough
### Input:
```
path = "WNEEN"
```

### Steps:
- W → (-1,0)  
- N → (-1,1)  
- E → (0,1)  
- E → (1,1)  
- N → (1,2)  

### Final Position:
```
(1,2)
```

### Output:
```
Shortest Path = √(1² + 2²) = √5 ≈ 2.23
```

---

## 📂 Project Structure
```
Shortest_Path_Strings/
│── Strings.java
│── README.md
```

---

## 🖥️ How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/IamAbinashDas/Abi_Java.git
   ```
2. Navigate to the folder:
   ```bash
   cd Shortest_Path_Strings
   ```
3. Compile and run:
   ```bash
   javac Strings.java
   java Strings
   ```

---

## ✨ Future Enhancements
- Print final coordinates along with shortest path.
- Extend to handle diagonal moves (NE, NW, SE, SW).
- Visualize the path on a grid.

---

## 👨‍💻 Author
**Abinash Das**  
📍 Indira Gandhi Institute of Technology  
🔗 GitHub Profile: IamAbinashDas [(github.com in Bing)](https://www.bing.com/search?q="https%3A%2F%2Fgithub.com%2FIamAbinashDas")
```
