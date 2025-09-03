
# K-Means Clustering in Java (with JFreeChart Visualization)

## 📌 Overview
This project is an implementation of the **K-Means Clustering** algorithm in Java.  
It takes a set of 2D points and groups them into clusters based on distance.

Additionally, it uses **JFreeChart** to visualize the clustering results as scatter plots.

---

## 🗂 Project Structure

### 1. `Entry.java`
A simple class representing a point with two coordinates:
- `x` → X-axis value  
- `y` → Y-axis value  

### 2. `Cluster.java`
Represents a cluster (group of points).
- Stores the cluster center (`x_Center`, `y_Center`)  
- Calculates Euclidean distance between a point and the cluster center  
- Updates the center to the average of assigned points  
- Tracks the error (how well the cluster fits its points)  

### 3. `Create_SDO.java`
Generates the **synthetic dataset** (1200 points).  
The points are distributed in several rectangular regions, forming natural clusters with some noise.

### 4. `K_Means.java`
Implements the K-Means algorithm:
- Converts raw data into `Entry` objects  
- Initializes random cluster centers  
- Assigns points to the nearest cluster  
- Updates cluster centers iteratively  
- Computes the overall clustering error  

### 5. `CreateScatterPlot.java`
Uses **JFreeChart** to visualize the clustering result:
- One series for cluster centers (`Centers`)  
- One series per cluster with its assigned points  
- Custom background color  
- Displayed in a Swing `JFrame` window  

### 6. `Main.java`
The entry point:
- Generates the dataset (`Create_SDO`)  
- Runs K-Means with **3, 6, 9, and 12 clusters**  
- Improves results by repeating K-Means multiple times and keeping the best (lowest error) solution  
- Displays each result in a scatter plot window  

---

## ▶️ How to Run

### Requirements
- Java 8+  
- [JFreeChart](https://www.jfree.org/jfreechart/) library  

### Compile & Run
1. Compile all `.java` files with JFreeChart in the classpath:
   ```bash
   javac -cp .:jfreechart-x.y.z.jar *.java
// replace jfreechart-x.y.z.jar with your downloaded version
2. Run the program:
java -cp .:jfreechart-x.y.z.jar Main
3.Four windows will open:
- Scatter plot with 3 clusters
- Scatter plot with 6 clusters
- Scatter plot with 9 clusters
- Scatter plot with 12 clusters
4.📊 What You’ll See

1200 points plotted in the 2D plane

Points grouped into clusters with different colors

Cluster centers plotted separately

A visual comparison of results with 3, 6, 9, and 12 clusters

⚙️ Possible Improvements

Assign fixed colors per cluster for consistency

Add labels for cluster centers

Enable interactive charts (zoom, pan, tooltips)

Allow users to choose the number of clusters at runtime


Developed by:
- Christos Ktsios  
(and authorized collaborators)

---

📌 *For academic purposes.*
