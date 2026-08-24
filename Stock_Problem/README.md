
# Buy and Sell Stock Problem

This project contains a Java implementation of the classic **Buy and Sell Stock** problem.  
The goal is to determine the maximum profit achievable by buying and selling a stock once, given an array of stock prices.

---

## 📌 Problem Statement
You are given an array `prices[]` where `prices[i]` represents the price of a stock on the `i-th` day.  
You need to find the maximum profit you can achieve by choosing a single day to buy and a different day in the future to sell.

- You may only complete **one transaction** (buy one and sell one share).
- If no profit is possible, return `0`.

---

## 🛠️ Approach
1. Traverse the array while keeping track of:
   - The **minimum price** encountered so far.
   - The **maximum profit** achievable at each step.
2. Update the maximum profit whenever the difference between the current price and the minimum price is greater than the previous maximum.

This ensures a **linear time complexity** solution:  
\[
O(n) \quad \text{time}, \quad O(1) \quad \text{space}
\]

---

## 📂 File Structure
```
Stock_Problem/
│── buy_sell_stock.java   # Java solution for the problem
```

---

## ▶️ How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/IamAbinashDas/Abi_Java.git
   ```
2. Navigate to the project folder:
   ```bash
   cd Abi_Java/Stock_Problem
   ```
3. Compile and run the program:
   ```bash
   javac buy_sell_stock.java
   java buy_sell_stock
   ```

---

## ✅ Example
Input:
```
prices = [7, 1, 5, 3, 6, 4]
```

Output:
```
Maximum Profit = 5
```

Explanation:
- Buy at price = 1 (Day 2)
- Sell at price = 6 (Day 5)
- Profit = 6 - 1 = 5

---

## 📖 References
- LeetCode - Best Time to Buy and Sell Stock [(leetcode.com in Bing)](https://www.bing.com/search?q="https%3A%2F%2Fleetcode.com%2Fproblems%2Fbest-time-to-buy-and-sell-stock%2F")
- Common interview problem in **Data Structures & Algorithms**

---

## 👨‍💻 Author
Developed by **Abinash Das**  
GitHub: IamAbinashDas [(github.com in Bing)](https://www.bing.com/search?q="https%3A%2F%2Fgithub.com%2FIamAbinashDas")
```
