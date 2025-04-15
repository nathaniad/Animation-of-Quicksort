# ⚡ Quick Sort Animation (Java + Swing)

An animated, multithreaded visualization of the **Quick Sort algorithm** using Java Swing. This project visually demonstrates how Quick Sort recursively partitions and sorts data in-place. Designed to help students, educators, and enthusiasts **see the algorithm in action** — ideal for learning or teaching sorting algorithms.

---

## 🖼 Preview

![Quick Sort Animation Screenshot](./images/quickpreview.png)

---

## 🚀 Features

- ✅ Real-time **Quick Sort animation**
- ✅ Highlights:
  - 🔴 Pivot element
  - 🟣 Elements currently being compared
  - ⚫ Unsorted values
- ✅ Smooth frame-by-frame animation
- ✅ Uses multithreading for responsiveness (`Runnable`, `Thread`)
- ✅ Thread-safe rendering with `ReentrantLock`
- ✅ Centered layout in a **dark-themed UI**

---

## 🧠 How It Works

- A random array is generated.
- A **separate thread** performs Quick Sort on the array.
- At each step:
  - The **pivot** is shown in **red**.
  - The elements being **compared** are shown in **magenta**.
  - Unsorted elements remain **black**.
- The `pause()` method slows down the sorting to make the logic visible.
- The sorting thread repaints the GUI to reflect changes using `Graphics2D`.

---

## 🛠 Technologies Used

- Java (JDK 8+)
- Java Swing (`JComponent`, `JPanel`, `JFrame`)
- Concurrency (`Thread`, `Runnable`, `ReentrantLock`)
- Graphics rendering (`Graphics2D`, `Line2D.Double`)

---

## 📁 File Structure

```bash
QuickSortProject/
├── ArrayUtil.java               # Utility for generating random arrays
├── QuickSorter.java             # Sorting logic + animation control
├── QuickSortComponent.java      # Custom Swing component that draws the animation
├── QuickSortViewer.java         # Main class that builds the UI and starts animation
├── preview.png                  # (Optional) Screenshot of the animation
└── README.md                    # You are here!
