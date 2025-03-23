

## 1. Overlooking Constant Factors

Big O notation ignores constant factors. [cite: 1]

* **Example:** A time complexity of 5n + 3 is simplified to O(n). [cite: 2]

## 2. Retaining the Major Term

When determining Big O notation, we only consider the fastest-growing term. [cite: 3, 4]

* **Example:** For a complexity of n² + n, we express it as O(n²) because n² grows faster than n. [cite: 4]

## 3. General Time Complexities

Here are some common Big O time complexities:

* O(1) - Constant time (time does not vary with input). [cite: 5, 6]
* O(log n) - Logarithmic time. [cite: 6]
* O(n) - Linear time. [cite: 6]
* O(n²) - Quadratic time. [cite: 6]

## 4. Worst Case vs. Best Case

Big O notation typically describes the worst-case scenario. [cite: 5]

* **Example: Linear Search**
    * Best-case scenario: O(1) (element is at the beginning).
    * Worst-case scenario: O(n) (element is at the end or not present).

## 5. Loop Rules

* **Sequential loops:** Complexities are added (e.g., O(n) + O(n) = O(n)).
* **Nested loops:** Complexities are multiplied (e.g., O(n \* n) = O(n²)).
