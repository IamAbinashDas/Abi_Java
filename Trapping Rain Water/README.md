
# Trapping Rain Water

## 📌 Problem Statement
Given an array of non-negative integers representing the elevation map where the width of each bar is 1, compute how much water can be trapped after raining.

### Example
```
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
```

---

## 💡 Approaches

### 1. Brute Force
- For each element, find the maximum height to its left and right.
- Water trapped = `min(leftMax, rightMax) - height[i]`.
- Time Complexity: **O(n²)**

### 2. Dynamic Programming
- Precompute `leftMax[]` and `rightMax[]`.
- Water trapped = `min(leftMax[i], rightMax[i]) - height[i]`.
- Time Complexity: **O(n)**, Space Complexity: **O(n)**

### 3. Two-Pointer Technique (Optimal)
- Maintain two pointers (`left`, `right`) and two variables (`leftMax`, `rightMax`).
- Move pointers inward, calculating trapped water.
- Time Complexity: **O(n)**, Space Complexity: **O(1)**

---

## 🛠️ Java Implementation (Two-Pointer Approach)
```java
public class TrappingRainWater {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0, water = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    water += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    water += rightMax - height[right];
                }
                right--;
            }
        }
        return water;
    }
}

---

### ✅ Summary
This guide walks through the **two-pointer technique** step by step:
- Start with pointers at both ends.
- Move inward, updating max heights.
- Calculate trapped water at each step.
- Return the accumulated result.

This makes your README not just a code reference but also a **learning resource** for anyone studying the problem.  

---

## ✅ Key Takeaways
- The **two-pointer approach** is the most efficient.
- Always test with edge cases (empty array, increasing/decreasing heights).
- This problem is a classic example of **array manipulation + two-pointer technique**.

---
## 📊 Visual Explanation

Imagine the elevation map as vertical bars:

```
    #
    #       #
  # #   #   #
# # # # # # #
-------------
0 1 0 2 1 0 1 3 2 1 2 1
```

- The `#` symbols represent the bars (heights).
- The gaps between taller bars can hold water.
- Water trapped is shown as `~` below:

```
    #
    #       #
  #~#~~~#~~~#
# # # # # # #
-------------
0 1 0 2 1 0 1 3 2 1 2 1
```

Here, the total trapped water = **6 units**.

---

## 🎯 Why This Helps
- **Bars** = elevation heights.
- **Water (~)** = trapped rainwater.
- The diagram shows how valleys between taller bars collect water.

---

## 📘 Learning Tip
Try drawing your own elevation maps with different arrays to visualize how water gets trapped. This helps you understand why the **two-pointer technique** works so efficiently.

---
