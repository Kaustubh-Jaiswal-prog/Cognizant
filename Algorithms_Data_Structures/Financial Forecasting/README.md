# Exercise 7: Financial Forecasting

## Objective

Develop a financial forecasting tool that predicts future values based on historical growth rates using a recursive algorithm. The exercise demonstrates the concept of recursion, its implementation, and analyzes its performance.

---

# Theory

## What is Recursion?

Recursion is a programming technique in which a function calls itself to solve a problem. Instead of solving the entire problem at once, recursion breaks it down into smaller subproblems until a stopping condition, known as the **base case**, is reached.

A recursive function consists of:

- **Base Case:** Terminates the recursion.
- **Recursive Case:** Calls the function again with a smaller input.

Recursion is widely used in tree traversal, graph algorithms, divide-and-conquer techniques, dynamic programming, and mathematical computations.

---

## Financial Forecasting

Financial forecasting is the process of estimating future financial values using historical data and growth rates. It helps organizations and individuals make informed decisions regarding investments, budgeting, and long-term planning.

For a constant annual growth rate, the future value is calculated using the compound growth formula:

```
Future Value = Present Value × (1 + Growth Rate)^Years
```

Where:

- **Present Value (PV):** Initial investment or current value.
- **Growth Rate (r):** Annual percentage growth expressed as a decimal.
- **Years (n):** Number of years for prediction.
- **Future Value (FV):** Estimated value after the specified period.

In this exercise, the same calculation is performed recursively instead of using the direct mathematical formula.

---

# Recursive Algorithm

### Base Case

When the number of years becomes zero, the current value is returned.

```java
if (years == 0)
    return currentValue;
```

### Recursive Case

Multiply the current value by the growth factor and recursively calculate the remaining years.

```java
return futureValue(currentValue * (1 + growthRate),
                   growthRate,
                   years - 1);
```

---

# Algorithm

1. Read the present value.
2. Read the annual growth rate.
3. Read the number of years.
4. If years become zero, return the current value.
5. Multiply the current value by `(1 + growthRate)`.
6. Recursively call the function for the remaining years.
7. Display the predicted future value.

---

# Project Structure

```text
Financial_Forecasting/
│── src/
│   ├── FinancialForecast.java
│── README.md
```

---

# Sample Input

```text
Present Value : 10000
Growth Rate   : 10%
Years         : 5
```

---

# Expected Output

```text
Future Value after 5 years = 16105.10
```

---

# Dry Run

```
futureValue(10000, 10%, 5)

↓

futureValue(11000, 10%, 4)

↓

futureValue(12100, 10%, 3)

↓

futureValue(13310, 10%, 2)

↓

futureValue(14641, 10%, 1)

↓

futureValue(16105.10, 10%, 0)

↓

Return 16105.10
```

---

# Time Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time Complexity | O(n) |
| Space Complexity | O(n) |

**Reason:**

- The recursive function is called once for each year.
- The recursion depth is equal to the number of years.

---

# Optimization

Although recursion is simple and elegant, it consumes additional memory because each recursive call is stored on the call stack.

The recursive solution can be optimized in the following ways:

### 1. Iterative Approach

- Eliminates recursive function calls.
- Uses constant auxiliary memory.

**Time Complexity:** O(n)

**Space Complexity:** O(1)

---

### 2. Mathematical Formula

Using the compound growth formula:

```
Future Value = Present Value × (1 + Growth Rate)^Years
```

or

```java
Math.pow(1 + growthRate, years)
```

This approach avoids recursion completely and is the most efficient for constant growth rates.

---

# Comparison

| Method | Time | Space |
|---------|------|-------|
| Recursive | O(n) | O(n) |
| Iterative | O(n) | O(1) |
| Mathematical Formula | O(1)* | O(1) |

> *Conceptually constant time when treating the formula as a direct computation.*

---

# Conclusion

- Recursion simplifies problems that can be divided into smaller subproblems.
- Financial forecasting using recursion demonstrates the working of recursive algorithms effectively.
- While recursion provides a clean and elegant implementation, it requires additional stack memory.
- For production-level financial applications, an iterative approach or the direct mathematical formula is generally preferred due to better space efficiency and performance.