# K-Means Clustering in Java

This project implements the **K-Means clustering algorithm** using Java and visualizes the results using **JFreeChart**.  
It was developed as part of a university assignment for the course **Computational Intelligence**.

## 📁 Project Structure

- `Main.java` – Entry point of the application. Handles repetition and selection of best clustering solution.
- `K_Means.java` – Implements the logic for clustering: initialization, assignment, updating clusters, and error calculation.
- `Cluster.java` – Represents each cluster. Stores its entries and computes new center coordinates.
- `Entry.java` – Represents a data point with X and Y coordinates.
- `CreateScatterPlot.java` – Generates scatter plots for visualizing clusters using JFreeChart.
- `Create_SDO.java` – Creates spatial data structures for mapping entries (SDO table).

## 📊 Features

- Dynamic cluster creation and assignment
- Euclidean distance calculation
- Visualization of results for different values of `k` (e.g., 3, 6, 9, 12)
- Elbow method (based on clustering error) to suggest the optimal number of clusters

## 🛠 Technologies Used

- Java
- JFreeChart (for chart visualization)

## 🚀 How to Run

1. **Compile all files**:
   ```bash
   javac *.java
   ```

2. **Run the main class**:
   ```bash
   java Main
   ```

Make sure JFreeChart is correctly added to your classpath if needed.

## 📚 Notes

- The clustering is repeated multiple times (e.g. 15 iterations) to select the best result.
- Visualization helps identify the "knee point" where error stops significantly decreasing.

## 👨‍💻 Contributors

Developed by:
- Christos Ktsios  
(and authorized collaborators)

---

📌 *For academic purposes.*
